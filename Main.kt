//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val mouse0: Mouse =  Mouse("Jerry")
    mouse0.makeASound()
}

fun moveAndMakeASound(animal: Animal){ //Polymorphism
    animal.move("forward")
    animal.makeASound()
}