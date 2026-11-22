fun main() {
    val temperaturas = doubleArrayOf(28.5, 31.0, 29.8, 33.2, 30.0, 27.4, 32.1)
    var soma = 0.0

    for (temp in temperaturas) {
        soma += temp
    }

    val media = soma / temperaturas.size
    println("Média geral: %.2f°C".format(media))
    println("Dias (índices) acima da média:")

    for (i in temperaturas.indices) {
        if (temperaturas[i] > media) {
            println("Dia $i -> ${temperaturas[i]}°C")
        }
    }
}