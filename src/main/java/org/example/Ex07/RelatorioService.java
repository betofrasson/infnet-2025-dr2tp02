package org.example.Ex07;

public class RelatorioService {
    public void gerarRelatorio(String tipo) {
        Relatorio relatorio;

        switch (tipo) {
            case "PDF":
                relatorio = new RelatorioPDF();
                break;
            case "CSV":
                relatorio = new RelatorioCSV();
                break;
            case "JSON":
                relatorio = new RelatorioJSON();
                break;
            default:
                System.out.println("Tipo de relatório desconhecido!");
                return;
        }

        System.out.println("Gerando relatório em " + tipo + "...");
        relatorio.gerarCabecalho();
        relatorio.gerarCorpo();
        relatorio.gerarRodape();
    }

    public static void main(String[] args) {
        RelatorioService relatorioService = new RelatorioService();
        relatorioService.gerarRelatorio("JSON");
    }
}
