package cucumberRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Rachna\\Programs\\GraphQLAPIAutomation-master\\GraphQLAPIAutomation-master\\Prac01\\src\\test\\resources\\Feature\\login.feature",
		glue={"StepDefinition"}
		)

public class runner {

}