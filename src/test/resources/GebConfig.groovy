/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.Platform
import org.openqa.selenium.firefox.FirefoxBinary
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxProfile


waiting {
    timeout = 5
}

environments {

    // run via “./gradlew firefoxTest”
    // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
    /*firefox {
        capability = DesiredCapabilities.firefox()
        capability.setPlatform(Platform.LINUX)
        driver = {new RemoteWebDriver(new URL("http://master2-hd-data.domain:4444/wd/hub"), capability)}
    }*/

    firefox {
        FirefoxBinary firefoxBinary = new FirefoxBinary()
        firefoxBinary.setEnvironmentProperty("DISPLAY",":77")
        firefoxBinary.setTimeout(20000l)
        FirefoxProfile profile = new FirefoxProfile()

        driver = {
            new FirefoxDriver(firefoxBinary, profile)
        }
    }

}

// To run the tests with all browsers just run “./gradlew test”