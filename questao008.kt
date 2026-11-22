fun main() {
    val matriz = arrayOf(
        intArrayOf(2, 4, 6, 8),
        intArrayOf(1, 3, 5, 7),
        intArrayOf(9, 8, 7, 6),
        intArrayOf(5, 4, 3, 2)
    )

    var somaDiagonalPrincipal = 0

    println("Matriz 4x4:")
    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            print("${matriz[i][j]}\t")
            if (i == j) {
                somaDiagonalPrincipal += matriz[i][j]
            }
        }
        println()
    }

    println("\nSoma da Diagonal Principal: $somaDiagonalPrincipal")
}