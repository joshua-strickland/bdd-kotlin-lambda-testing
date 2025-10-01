package stepdefinitions

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import io.cucumber.java.After
import io.cucumber.java.Before
import io.cucumber.java8.En
import org.openqa.selenium.By
import java.net.URL

// Implement the 'En' interface to use the English Gherkin lambda DSL.
class ButtonClickSteps : En {

    private var driver: AndroidDriver? = null

    @Before
    fun setUp() {
        val options = UiAutomator2Options()
            .setPlatformName("Android")
            .setAutomationName("UiAutomator2")
            .setDeviceName("Android Emulator") // Replace with your device name or UDID
            .setAppPackage("com.example.joshcomposetesting")
            .setAppActivity(".MainActivity")
            .setNoReset(true)

        // The URL for your running Appium 2 server
        val url = URL("http://127.0.0.1:4723")

        driver = AndroidDriver(url, options)
        driver?.setSetting("disableIdLocatorAutocompletion", true)
        //println(driver?.pageSource)
    }


    @After
    fun tearDown() {
        driver?.quit()
    }

    init {
        Given("the app is open") {
            //placeholder
        }

        When("I click on the button for screen 1") {
            // Appium will look for an element with the resource-id "screen1"
            val screen1Button = driver?.findElement(By.id("screen1"))
            assert(screen1Button != null) { "Button with resource ID 'screen1' not found." }
            screen1Button?.click()
            println("Clicked on the button with resource ID 'screen1'.")
        }

        Then("the first screen should be displayed") {

            println("Verification step passed (placeholder).")
        }
    }
}