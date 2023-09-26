package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao nosso programa teste!");

        System.out.println("Qual seu nome completo?");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        System.out.println("Qual seu tempo de casa?");
        int tempoCasa = Integer.parseInt(sc.nextLine());

        System.out.println("Qual o valor do seu salário?");
        double salario = Double.parseDouble(sc.nextLine());

        double descMaior = 11;
        double descMeio = 9;
        double descMenor = 8;
        double descValeMaior = 6;
        double descValeMenor = 4;

        double descontoInss = 0;
        double descontoVale = 0;

        double bonificacaoMaior = 5;
        double bonificacaoMenor = 2;
        double bonificacao = 0;

        if (salario >= 2000) {
            descontoInss = (salario * descMaior) / 100;
        } else if (salario > 1501 && salario < 1999) {
            descontoInss = (salario * descMeio) / 100;
        } else if (salario <= 1500) {
            descontoInss = (salario * descMenor) / 100;
        }

        if (salario > 1800) {
            descontoVale = (salario * descValeMaior) / 100;
        } else if (salario >= 1201 && salario <= 1800) {
            descontoVale = (salario * descValeMenor) / 100;
        }

        if (tempoCasa > 9) {
            bonificacao = (salario * bonificacaoMaior) / 100;
        } else if (tempoCasa > 5 && tempoCasa < 9) {
            bonificacao = (salario * bonificacaoMenor) / 100;
        }

        double salarioLiquido = salario - descontoInss - descontoVale + bonificacao;

        System.out.println("-------------------------------------------------");
        System.out.println("| Nome: " + nome + "                             | ");
        System.out.println("| Tempo de casa: " + tempoCasa + " anos          | ");
        System.out.println("| Salário bruto: R$" + salario + "               | ");
        System.out.println("| Desconto INSS: R$" + descontoInss + "          | ");
        System.out.println("| Desconto Vale Refeição: R$" + descontoVale + " | ");
        System.out.println("| Bonificação: R$" + bonificacao + "             | ");
        System.out.println("| Salário líquido: R$" + salarioLiquido + "      | ");
        System.out.println("--------------------------------------------------");



        //System.out.print("Hello and welcome!");
        //var nome = "Nicole";
        //for (int i = 1; i <= 10; i++) {


        //System.out.println( "Olá " + nome + " essa é a vez do número " + i + " que o programa passa por aqui ");


        //System.out.println("Digite seu sobrenome: ");
        //Scanner sobrenome = new Scanner(System.in);
        //String inputSobrenome = sobrenome.nextLine();

        //System.out.println("O seu sobrenome é: " + inputSobrenome);

//        var nome = "Nicole";
//        System.out.println("Qual o seu sobrenome: ");
//        Scanner sc = new Scanner(System.in);
//        String inputSobrenome = sc.nextLine();
//
//        System.out.println("Qual a sua idade?");
//        String inputIdade = sc.nextLine();
//
//        System.out.println("O seu nome e sobrenome são: " + nome + " " + inputSobrenome + " e sua idade é: " + inputIdade);

//        int numero = 0;
//        for (numero = 0; numero <= 100; numero = numero + 2) {
//            System.out.println(numero);
//        }
//        int numeroImpar = 1;
//        while (numeroImpar <= 100) {
//            switch (numeroImpar) {
//                case 23:
//                    System.out.println("esse número veio do switch. " + numeroImpar);
//                    break;
//                case 57:
//                    System.out.println("esse número veio do switch. " + numeroImpar);
//                    break;
//                default:
//                    System.out.println("erro!");
//                    break;
//            }
//            numeroImpar += 2;
//        }

//        int numImpar = 1;
//        while (numImpar <= 100) {
//            if (numeroImpar == 11) {
//                System.out.println("esse é o número: " + numImpar);
//            }
//        }

//        if (numeroImpar == 10) {
//            System.out.println("teste");
//        } else {
    }
}

