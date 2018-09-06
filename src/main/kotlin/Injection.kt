object Injection {
    fun provideHeater(): Heater {
        return AHeater()
    }

    fun providePump(): Pump {
        return APump(provideHeater())
    }

    fun provideCoffeeMaker(): CoffeeMaker {
        return CoffeeMaker(provideHeater(), providePump())
    }

}