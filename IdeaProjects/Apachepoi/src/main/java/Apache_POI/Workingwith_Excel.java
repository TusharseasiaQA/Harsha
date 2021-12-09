package Apache_POI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Workingwith_Excel
{

    public static void main(String args[]) throws IOException
    {
        FileInputStream fls = new FileInputStream("D:\\datafile.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fls);
        XSSFSheet ws = wb.getSheet("Sheet1");
        Row r;
        r = ws.createRow(0);
        r.createCell(0).setCellValue("Harsha");
        FileOutputStream fss = new FileOutputStream("D:\\datafile.xlsx");
        wb.write(fss);
    }

}
