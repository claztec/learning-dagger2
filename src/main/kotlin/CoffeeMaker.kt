import javax.inject.Inject

class CoffeeMaker @Inject constructor(private val heater: Heater, private val pump: Pump) {

    fun brew() {
        heater.on()
        pump.pump()
        println(" [_]P coffee! [_]P ")
        heater.off()
    }
}
