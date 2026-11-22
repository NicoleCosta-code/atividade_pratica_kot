fun main() {
    val original = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val transposta = Array(3) { IntArray(2) }

    for (i in 0 until 2) {
        for (j in 0 until 3) {
            transposta[j][i] = original[i][j]
        }
    }

    println("Matriz Original (2x3):")
    for (linha in original) println(linha.joinToString(" "))

    println("\nMatriz Transposta (3x2):")
    for (linha in transposta) println(linha.joinToString(" "))
}