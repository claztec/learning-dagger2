import dagger.Component

@Component(modules = arrayOf(CoffeeMakerModule::class))
interface CoffeeComponent {
    fun make(): CoffeeMaker
    fun inject(coffeeMaker: CoffeeMaker)
}