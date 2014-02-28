package tornadotracker
import grails.converters.JSON

class TornadosController {

    def index() { }
	def api() {
		def tornado = Tornado.list()
		render tornado as JSON
	}
}
