import dagger.Module
import dagger.Provides

@Module
class CoffeeMakerModule {

    @Provides
    fun provideHeater(): Heater {
        return AHeater()
    }

    @Provides
    fun providePump(heater: Heater): Pump {
        return APump(heater)
    }

}