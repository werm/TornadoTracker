package tornadotracker

class Tornado {

    static constraints = {
		om(editable: false)
		yr(editable: false)
		mo(editable: false)
		dy(editable: false)
		date(editable: false)
		time(editable: false)
		tz(editable: false)
		st(editable: false)
		stf(editable: false)
		stn(editable: false)
		f(editable: false)
		inj(editable: false)
		fat(editable: false)
		loss(editable: false)
		closs(editable: false)
		slat(editable: false)
		slon(editable: false)
		elat(editable: false)
		elon(editable: false)
		len(editable: false)
		wid(editable: false)
		ns(editable: false)
		sn(editable: false)
		sg(editable: false)
		f1(editable: false)
		f2(editable: false)
		f3(editable: false)
		f4(editable: false)
    }
	Integer om
	Integer yr
	Integer mo
	Integer dy
	String date
	String time
	String tz
	String st
	Integer stf
	Integer stn
	Integer f
	Integer inj
	Integer fat
	Integer loss
	Integer closs
	String slat
	String slon
	String elat
	String elon
	Integer len
	Integer wid
	Integer ns
	Integer sn
	Integer sg
	Integer f1
	Integer f2
	Integer f3
	Integer f4
}
