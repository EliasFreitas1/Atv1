fun main(){
    //A) Faça um programa que peça ao usuário para digitar dois números e mostre a soma
    //desses números.
    println("Digite o primeiro número: ")
    var num1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    var num2 = readLine()!!.toInt()
    var soma = num1 + num2
    println("A soma dos números é $soma")


    //B) Faça um programa que calcule o quadrado de um número informado pelo usuário.
    println("Digite um número: ")
    var num3 = readLine()!!.toInt()
    println("O quadrado deste número é " + num3 * num3)


    //C) Faça um programa que peça ao usuário para informar seu nome e sua idade, e que
    //exiba uma mensagem de boas-vindas com o nome e a idade informados.
    println("Digite seu nome: ")
    var nome = readLine()
    println("Digite sua idade: ")
    var idade = readLine()!!.toInt()
    println("Seja bem-vindo, $nome, que tem $idade anos!")
}