package stepdefinitions

import AppiumWrapperTools
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import io.cucumber.java.After
import io.cucumber.java.Before
import io.cucumber.java8.En
import screens.DetailScreen
import screens.HomeScreen
import java.net.URL

// Implement the 'En' interface to use the English Gherkin lambda DSL.
class ButtonClickSteps : En, AppiumWrapperTools() {

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
        setDriver(driver)
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

        When("The user clicks on the button for screen 1") {
            tapOn(HomeScreen.SCREEN_1_NAV_BUTTON)
        }

        Then("the user is directed to screen 1") {
            get(DetailScreen.TITLE)?.isDisplayed
        }

        And("the screen 1 title should read screen 1") {
            assertTextOf(DetailScreen.TITLE, "Screen 1")
        }

        When("the user taps on the go back button") {
            tapOn(DetailScreen.GO_BACK_BUTTON)
        }

        Then("the user is directed to the home screen") {
            get(HomeScreen.TITLE)?.isDisplayed
        }

        When("The user clicks on the button for screen 2") {
            tapOn(HomeScreen.SCREEN_2_NAV_BUTTON)
        }

        Then("the user is directed to screen 2") {
            assertTextOf(DetailScreen.TITLE, "Screen 2")
        }
    }
}