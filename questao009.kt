fun main() {
    val matriz = arrayOf(
        intArrayOf(10, 0, 5),
        intArrayOf(0, 8, 0),
        intArrayOf(3, 7, 0)
    )

    var somaPositivos = 0

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            val valor = matriz[i][j]
            if (valor == 0) {
                continue
            }
            if (valor > 0) {
                somaPositivos += valor
            }
        }
    }

    println("Soma dos valores maiores que zero: $somaPositivos")
}