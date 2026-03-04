import utilitarios.Teclado;
import utilitarios.Video;

public class Ex02 {
    public static void main(String[] args) {
        double luz, agua, internet, condominio, total, dividirDespesas;
        int quantidadeMoradores;
        
        luz = Teclado.solicitarDouble("Informe o valor da conta de luz:");
        agua = Teclado.solicitarDouble("Informe o valor da conta de água:");
        internet= Teclado.solicitarDouble("Informe o valor da conta de internet:");
        condominio = Teclado.solicitarDouble("Informe o valor da conta do condomínio:");

        quantidadeMoradores = Teclado.solicitarInt("Informe quantos moradores dividem as despesas:");

        total = luz + agua + internet + condominio;
        dividirDespesas = valorParcialDespesas(total, quantidadeMoradores);

        Video.exibirMensagemInformativa("Cada morador terá que pagar: R$ " + dividirDespesas);

    }
    
    static double valorParcialDespesas(double total, int quantidadeMoradores){
        total = total/quantidadeMoradores;
        return total;
    }
}
