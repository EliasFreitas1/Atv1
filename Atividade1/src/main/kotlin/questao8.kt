fun main(){
    //A) Faça um programa que receba um número de 1 a 7 e exiba o dia da semana
    //correspondente usando when.
    println("Este programa recebe um número de 1 a 7 e exibe o dia da semana correspondente.")
    println("Digite uma letra qualquer: ")
    val dia = readLine()!!.toInt()

    val diaNome = when (dia) {
        1 -> "Segunda-Feira"
        2 -> "Terça-Feira"
        3 -> "Quarta-Feira"
        4 -> "Quinta-Feira"
        5 -> "Sexta-Feira"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Dia inválido!"
    }
    println("O dia referente a $dia é $diaNome!")

    //B) Faça um programa que verifique se um animal é um mamífero, ave ou réptil usando
    //when.
    println("Este programa verifica se um animal é mamífero, ave ou réptil.")
    println("Digite um animal (cachorro, gato, pato, galinha, serpente, crocodilo): ")
    val animal = readln()

    val especie = when (animal) {
        "cachorro" -> "mamífero"
        "gato" -> "mamífero"
        "pato" -> "ave"
        "galinha" -> "ave"
        "serpente" -> "réptil"
        "crocodilo" -> "réptil"
        else -> "Este animal não é válido"
    }
    println ("O animal $animal é da espécie $especie.")


    //C) Faça um programa que receba uma letra e verifique se ela é uma vogal ou consoante
    //usando when.
    println("Este programa verifica se uma letra é vogal ou consoante.")
    println("Digite um valor inteiro de 1 a 7: ")
    val letra = readln()

    val verificador = when (letra) {
        "a" -> "Vogal"
        "e" -> "Vogal"
        "i" -> "Vogal"
        "o" -> "Vogal"
        "u" -> "Vogal"
        else -> "Consoante"
    }
    println ("A letra $letra é uma $verificador.")


    //D) Faça um programa que receba um número de 1 a 12 e exiba o mês correspondente
    //usando when.
    println("Este programa recebe um número de 1 a 12 e exibe o mês correspondente.")
    println("Digite um número de 1 a 12: ")
    val mes = readLine()!!.toInt()

    val mesNome = when (mes) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês inválido!"
    }
    println("O mês referente a $mes é $mesNome!")
}