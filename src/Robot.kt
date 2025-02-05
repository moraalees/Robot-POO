package src

class Robot(private val nombre: String) {

    private var posX = 0
    private var posY = 0
    private var direccion = Direccion.PositiveY

    fun mover(movimientos: IntArray){
        for (pasos in movimientos){
            if (pasos != 0) {
                when (direccion) {
                    Direccion.PositiveY -> {
                        posY += pasos
                        direccion = Direccion.NegativeX
                    }

                    Direccion.NegativeX -> {
                        posX -= pasos
                        direccion = Direccion.NegativeY
                    }

                    Direccion.NegativeY -> {
                        posY -= pasos
                        direccion = Direccion.PositiveX
                    }

                    Direccion.PositiveX -> {
                        posX += pasos
                        direccion = Direccion.PositiveY
                    }
                }
                direccion = Direccion.nuevaDir(direccion.ordinal)
            }
        }
    }

    fun obtenerPosicion() = "($posX, $posY)"

    fun obtenerDireccion() = direccion

    override fun toString(): String {
        return "$nombre está en ${obtenerPosicion()} ${obtenerDireccion()}"
    }

}