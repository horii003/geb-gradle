import geb.Module

/**
 * Created with IntelliJ IDEA.
 * User: Alex Misuno
 * Date: 10/04/13
 * Time: 14:51
 * To change this template use File | Settings | File Templates.
 */

class SearchModule extends Module {
    static content = {
        field { $("input", name: "q") }
        search { $("input", name: "btnK") }
    }
}
