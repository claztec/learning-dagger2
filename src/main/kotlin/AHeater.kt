class AHeater : Heater {

    var heatring: Boolean = false

    override fun on() {
        println("A Heating ~~ heating ~~")
        this.heatring = true
    }

    override fun off() {
        this.heatring = false
    }

    override fun isHot(): Boolean {
        return heatring
    }

}