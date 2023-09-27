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
        double salario = Double.parseDouble(sc.nextLine()); // chamando uma classe double e chamando o método parseDouble e passando o parâmetro

        double descontoInss = 0;
        double descontoVale = 0;
        double bonificacao = 0;
        String porcentagemInss = "";
        String porcentagemVt = "";
        String porcentagemBonificacao = "";

        descontoInss = Validacao.validacaoInss(salario);
        porcentagemInss = Validacao.validPorcentagemInss();

        descontoVale = Validacao.validacaoVt(salario);
        porcentagemVt = Validacao.validPorcentagemInssVt();

        bonificacao = Validacao.validacaoBonificacao(tempoCasa, salario);
        porcentagemBonificacao= Validacao.validPorcentagemBonificacao();

        double salarioLiquido = salario - descontoInss - descontoVale + bonificacao;

        Imprimir.imprimirDoc(nome, salario, tempoCasa, descontoInss, descontoVale, bonificacao, salarioLiquido, porcentagemInss, porcentagemVt, porcentagemBonificacao);
    }
}

