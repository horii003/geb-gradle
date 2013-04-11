import  geb.Page

class GooglePage extends Page {
    static url = "http://www.google.by"
    static at = { $("title").text() == "Google"}
    static content = {
        theModule { module SearchModule }
    }

    def Search(String arg0) {
        theModule.field.value(arg0)
        theModule.search.click()
    }
}
