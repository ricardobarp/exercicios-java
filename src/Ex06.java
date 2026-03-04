import utilitarios.Teclado;
import utilitarios.Video;

public class Ex06 {
    public static void main(String[] args) {
        int numero;
        boolean positivo, par;

        numero = Teclado.solicitarInt("Digite um número:");
        
        positivo = ehPositivo(numero);

        if (positivo) {
            Video.exibirMensagemInformativa("O número digitado é positivo");

            par = ehPar(numero);
            if (par) {
                Video.exibirMensagemInformativa("O número digitado é par");
                return;
            }
    
            if (!par) {
                Video.exibirMensagemInformativa("O número digitado é ímpar");
                return;
            }
        }

        Video.exibirMensagemInformativa("O número digitado é 0 ou negativo");
        Video.exibirMensagemAlerta("A calculadora não pode exibir se este número é par ou ímpar");
    }

    static boolean ehPositivo(int n) {
        if (n > 0) {
            return true;
        }
        return false;
    }

    static boolean ehPar(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}
