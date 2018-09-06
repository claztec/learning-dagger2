fun main(args: Array<String>) {
    println("Hello world")


    val heater = AHeater()
    val pump = APump(heater)
    val coffeeMaker = CoffeeMaker(heater, pump)

//    val coffeeMaker = CoffeeMaker(Injection.provideHeater(), Injection.providePump())
    coffeeMaker.brew()

    Injection.provideCoffeeMaker().brew()
}