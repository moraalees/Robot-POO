package src

fun main(){
    val robot1 = Robot("R2D2")

    val listaMov = listOf(
        intArrayOf(10, 5, -2),
        intArrayOf(0, 0, 0),
        intArrayOf(),
        intArrayOf(-10, -5, 2),
        intArrayOf(-10, -5, 2, 4, -8)
    )

    for (movimientos in listaMov){
        robot1.mover(movimientos)
        println(robot1)
    }
}