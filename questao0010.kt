fun main() {
    val notas = Array(3) { DoubleArray(2) }

    // Preenchendo notas de exemplo
    notas[0] = doubleArrayOf(8.0, 7.5)
    notas[1] = doubleArrayOf(5.5, 6.0)
    notas[2] = doubleArrayOf(9.0, 9.5)

    var somaTotalTurma = 0.0

    for (i in notas.indices) {
        val mediaIndividual = (notas[i][0] + notas[i][1]) / 2.0
        somaTotalTurma += mediaIndividual

        val status = if (mediaIndividual >= 7.0) {
            "Aprovado"
        } else {
            "Reprovado"
        }

        println("Aluno ${i + 1} - Média: %.2f -> $status".format(mediaIndividual))
    }

    val mediaGeral = somaTotalTurma / notas.size
    println("\nMédia geral da turma: %.2f".format(mediaGeral))
}