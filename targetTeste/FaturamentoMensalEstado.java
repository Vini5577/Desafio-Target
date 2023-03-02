package targetTeste;

public class FaturamentoMensalEstado {
    
    public static void main(String[] args) {
        
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        System.out.println("Porcentual de representação de Faturamento de cada no faturamento total: ");
        System.out.println("SP: " + String.format("%.2f", (faturamentoSP / faturamentoTotal) * 100) + "%");
        System.out.println("RJ: " + String.format("%.2f", (faturamentoRJ / faturamentoTotal) * 100) + "%");
        System.out.println("MG: " + String.format("%.2f", (faturamentoMG / faturamentoTotal) * 100) + "%");
        System.out.println("ES: " + String.format("%.2f", (faturamentoES / faturamentoTotal) * 100) + "%");
        System.out.println("Outros: " + String.format("%.2f", (faturamentoOutros / faturamentoTotal) * 100) + "%");
    }
}
