fun main() {
    val tarefas = arrayOf(
        "Revisar modelagem de dados",
        "Testar consultas SQL",
        "Fazer backup do banco",
        "Enviar atividade no portal"
    )

    for ((indice, descricao) in tarefas.withIndex()) {
        println("${indice + 1}. $descricao")
    }
}