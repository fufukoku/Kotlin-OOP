//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val dog0: Animal = Dog("Hachiko")
//    dog0.move("Forward")
//    dog0.makeASound()
//
//
//    val cat0: Cat = Cat("Tom")
//    cat0.move("Forward")
//    cat0.makeASound()
//    println("\n")
//
//    moveAndMakeASound(dog0)
//    moveAndMakeASound(cat0)
    val mouse0: Mouse =  Mouse("Jerry")
    mouse0.makeASound();
    println(mouse0.CheeseAmount)
    mouse0.StealCheese(1)
    mouse0.StealCheese(1)
    mouse0.EatCheese()
}

fun moveAndMakeASound(animal: Animal){ //Polymorphism
    animal.move("forward")
    animal.makeASound()
}