package org.example;

public class Validacao {

    static String porcentagemInss = "";
    static String porcentagemVt = "";

    static String porcentagemBonificacao = "";

    public static double validacaoInss(double salario) {
        double descontoInss = 0;
        if (salario >= 2000) {
            descontoInss = (salario * 11) / 100;
            porcentagemInss = "11%";
        } else if (salario >= 1501 && salario <= 1999) {
            descontoInss = (salario * 9) / 100;
            porcentagemInss = "9%";
        } else if (salario <= 1500) {
            descontoInss = (salario * 8) / 100;
            porcentagemInss = "8%";
        }
        return descontoInss;
    }

    public static double validacaoVt(double salario) {
        double descontoVale = 0;
        if (salario >= 1801) {
            descontoVale = (salario * 6) / 100;
            porcentagemVt = "5%";
        } else if (salario >= 1201 && salario <= 1800) {
            descontoVale = (salario * 4) / 100;
            porcentagemVt = "2%";
        }
        return descontoVale;
    }

    public static double validacaoBonificacao(int tempoCasa, double salario) {
        double bonificacao = 0;
        if (tempoCasa > 9) {
            bonificacao = (salario * 5) / 100;
            porcentagemBonificacao = "5%";
        } else if (tempoCasa > 5 && tempoCasa < 10) {
            bonificacao = (salario * 2) / 100;
            porcentagemBonificacao = "2%";
        }
        return bonificacao;
    }

    public static String validPorcentagemInss() {
        return porcentagemInss;
    }

    public static String validPorcentagemInssVt() {
        return porcentagemVt;
    }
    public static String validPorcentagemBonificacao() {
        return porcentagemBonificacao;
    }
}
