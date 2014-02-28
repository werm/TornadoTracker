package tornadotracker
import grails.converters.JSON

class TornadoController {

    def index() { 
		response.setContentType("application/json")
		Tornado.list()
	}
    def api() {
		def tornado = Tornado.list()
        render tornado as JSON
    }
}
