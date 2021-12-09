package runner_N;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "D:\\IdeaProjects\\Cucumber\\Features\\LoginN.feature",
        glue = {""},
        tags = "@loginFunc"
)
public class RunCucumberTest {
}
