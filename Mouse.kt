class Mouse(_name:String = "Jerry"): Animal(_name){
    override fun makeASound(){
        squeaks()
    }

    private fun squeaks(){
        println("$animalName said squeaks")
    }

    private var CheeseAmount: Int = 0

    private fun StealCheese(x: Int){
        println("before"+CheeseAmount)
        CheeseAmount+=x
        println("after"+CheeseAmount)
    }

    private fun EatCheese(){
        println("before"+CheeseAmount)
        CheeseAmount--
        println("after"+CheeseAmount)
    }
}