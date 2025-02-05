package src

enum class Direccion(val desc: String) {
    PositiveY("Eje Y positivo"),
    NegativeX("Eje X negativo"),
    NegativeY("Eje Y negativo"),
    PositiveX("Eje X positivo");

    companion object{
        fun nuevaDir(pos: Int): Direccion{
            if (pos >= Direccion.entries.size - 1)
                return Direccion.entries[0]
            else {
                return Direccion.entries[pos + 1]
            }
        }

        fun nuevaDir2(pos: Int) =
            Direccion.entries[((pos + 1) % Direccion.entries.size)]

    }
}