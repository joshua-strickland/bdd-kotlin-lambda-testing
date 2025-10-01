package stepdefinitions

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

class CucumberRunner

@RunWith(Cucumber::class)
@CucumberOptions(glue = ["org.example.stepdefinitions"])
class RunCucumberTest {
}