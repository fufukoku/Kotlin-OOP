fun main() {
    val mouse0: Mouse =  Mouse("Jerry")
    mouse0.makeASound()
}

fun moveAndMakeASound(animal: Animal){ //Polymorphism
    animal.move("forward")
    animal.makeASound()
}