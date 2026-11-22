fun main() {
    val numeros = IntArray(20) { it + 1 } // Preenche de 1 a 20
    var somaIndicesPares = 0

    for (i in numeros.indices step 2) {
        somaIndicesPares += numeros[i]
    }

    println("Soma dos valores nos índices pares: $somaIndicesPares")
}