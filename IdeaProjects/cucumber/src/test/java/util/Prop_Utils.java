package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Prop_Utils//Classname.methodname(Browser)
{
    public static String get_Property(String pname) throws IOException {
        Properties prop = new Properties();
        FileInputStream fname = null;
        fname = new FileInputStream("D:\\IdeaProjects\\Cucumber\\src\\config.properties");
        prop.load(fname);

        String property=prop.getProperty(pname);
        return (property);

    }
}
