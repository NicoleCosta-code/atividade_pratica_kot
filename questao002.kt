fun main() {
    val codigos = arrayOf("TX-101", "TX-205", "TX-309", "TX-412", "TX-550")
    val alvo = "TX-309"

    for (i in codigos.indices) {
        if (codigos[i] == alvo) {
            println("Código $alvo encontrado na posição (índice): $i")
            break
        }
    }
}