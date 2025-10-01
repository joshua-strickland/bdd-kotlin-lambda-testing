import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import io.cucumber.java.After
import io.cucumber.java.Before
import io.cucumber.java8.En
import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import java.net.URL

// Implement the 'En' interface to use the English Gherkin lambda DSL.
open class AppiumWrapperTools {

    private var driver: AndroidDriver? = null

    fun setDriver(driver: AndroidDriver?){
        this.driver = driver
    }

    fun getDriver(): AndroidDriver?{
        return driver
    }

    fun tapOn(elementString: String){
        driver?.findElement(By.id(elementString))?.click()
    }

    fun get(elementString: String): WebElement? {
        return driver?.findElement(By.id(elementString))
    }

    fun assertTextOf(elementString: String, comparisonString: String){
        Assert.assertSame(get(elementString)?.text, comparisonString)
    }

}