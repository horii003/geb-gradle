import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.Dimension
import geb.driver.SauceLabsDriverFactory

import geb.report.CompositeReporter
import geb.report.ScreenshotReporter

environments {
    chrome {
          driver = {
//           def sauceLabsBrowser = "browserName:chrome\nplatform:Windows 7\nversion:38.0"
             def sauceLabsBrowser = System.getProperty("geb.saucelabs.browser")
             def username = "horii03"
             assert username
             def accessKey = "1dff5a82-1c94-4bec-bbe9-f37b0cb3ffa8"
             assert accessKey
             new SauceLabsDriverFactory().create(sauceLabsBrowser, username, accessKey)
          }
    }
}

reporter = new CompositeReporter(
    new ScreenshotReporter(){
        @Override
        protected escapeFileName(String name) {
            name.replaceAll('[\\\\/:\\*?\\"&lt;>\\|]', '_')
        }
    },
    new ScreenshotReporter(){
        @Override
        protected escapeFileName(String name) {
            name.replaceAll('[\\\\/:\\*?\\"&lt;>\\|]', '_')
        }
    }
)
