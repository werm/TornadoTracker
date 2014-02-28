package tornadotracker

import grails.transaction.Transactional

@Transactional
class TornadoService {
	@Transactional(readOnly = true)
		def listTornados() {
			Tornado.list()
		}
}