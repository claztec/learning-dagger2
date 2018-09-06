class APump(private val heater: Heater) : Pump {
    override fun pump() {
        if (heater.isHot()) {
            println("A_Pump > pumping => =>")
        }
    }

}