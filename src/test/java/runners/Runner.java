package runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = {"src/test/resources/features"},
        glue = {"stepsDefinitions"},
        monochrome = true,
        dryRun = false,
        tags = ("@SmokeTest")
)
        //monochrome = true, snippets = SnippetType.CAMELCASE, dryRun = false)
public class Runner {
   public static void main(String[] args){
        {io.cucumber.core.cli.Main.main(args);}
    }
}

