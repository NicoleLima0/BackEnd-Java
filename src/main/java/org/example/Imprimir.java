package org.example;

public class Imprimir {
    public static void imprimirDoc(String nome, double salario, Integer tempoCasa, double descontoInss, double descontoVale, double bonificacao,
                                   double salarioLiquido, String porcentagemInss, String porcentagemVt, String porcentagemBonificacao) {
        System.out.println("-------------------------------------------------");
        System.out.println("| Nome: " + nome + "                             | ");
        System.out.println("| Tempo de casa: " + tempoCasa + " anos          | ");
        System.out.println("| Salário bruto: R$" + salario + "               | ");
        System.out.println("| Desconto INSS: R$" + descontoInss + " " + porcentagemInss + " | ");
        System.out.println("| Desconto Vale Refeição: R$" + descontoVale + " | ");
        System.out.println("| Bonificação: R$" + bonificacao + "             | ");
        System.out.println("| Salário líquido: R$" + salarioLiquido + "      | ");
        System.out.println("--------------------------------------------------");

    }
}