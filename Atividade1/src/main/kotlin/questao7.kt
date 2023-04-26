fun main() {
    //A) Faça um programa que receba duas notas de um aluno e calcule a média. Se a média
    //for maior ou igual a 7, exiba "Aprovado". Caso contrário, exiba "Reprovado". Use if/else.
    println("Este programa calcula a média de um aluno.")
    println("Digite a 1° nota: ")
    val nota1 = readLine()!!.toFloat()
    println("Digite a 2° nota: ")
    val nota2 = readLine()!!.toFloat()
    val media = (nota1 + nota2)/2

    if(media >= 7){
        println("APROVADO! :)")
    }else{
        println("REPROVADO! :)")
    }


    //B) Faça um programa que receba um número inteiro e verifique se ele é par ou ímpar
    //usando if/else.
    println("Este programa verifica se um número é par ou ímpar.")
    println("Digite um número qualquer: ")
    val num = readLine()!!.toInt()

    if(num % 2 == 0){
        println("Par!")
    }else{
        println("Impar!")
    }


    //C) Faça um programa que receba um número inteiro e verifique se ele é positivo, negativo
    //ou zero usando if/else.
    println("Este programa verifica se um número é positivo, negativo ou neutro.")
    println("Digite o número a ser verificado: ")
    val num2 = readLine()!!.toInt()

    if(num2 == 0){
        println("É um zero! Número neutro.")
    }else if (num2 > 0){
        println("Número positivo!")
    }else{
        println("Número negativo!")
    }


    //D) Faça um programa que verifique se uma pessoa é maior de idade (18 anos ou mais)
    //usando if/else.
    println("Este programa verifica se a pessoa é maior de idade.")
    println("Digite a sua idade: ")
    val idade = readLine()!!.toInt()

    if(idade >= 18){
        println("Sim! Vc é maior de idade!")
    }else{
        println("Não! Vc não é maior de idade!")
    }
}