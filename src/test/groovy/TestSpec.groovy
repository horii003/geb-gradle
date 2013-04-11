import geb.spock.*

class TestSpec extends GebReportingSpec {
    def "Google"() {
        given: "go to google.com"
        to GooglePage

        when: "we at Google home page"
        at GooglePage

        then: "Search Yahoo"
        Search("Yahoo")
    }

}
