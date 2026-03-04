import utilitarios.Teclado;
import utilitarios.Video;

public class Ex05 {
    static final double MEDIA_ALUNO = 7.0;
	public static void main(String[] args) {
        
        double nota1, nota2, nota3, peso1, peso2, peso3, media = 0;
        int escolha;
        
        nota1 = Teclado.solicitarDouble("Informe a primeira nota:");
        nota2 = Teclado.solicitarDouble("Informe a segunda nota:");
        nota3 = Teclado.solicitarDouble("Informe a terceira nota:");
        Video.exibirMensagemInformativa("Escolha entre:");
        Video.exibirMensagemInformativa("1 - Média aritmética");
        Video.exibirMensagemInformativa("2 - Média ponderada");
        escolha = Teclado.solicitarInt("");
        
        if(escolha != 1 && escolha != 2) {
            Video.exibirMensagemErro("Você deve escolher 1 ou 2, tente novamente...");
            return;
        }

        if(escolha == 1) {
            media = calcularMediaAritmetica(nota1, nota2, nota3);
            Video.exibirMensagemInformativa("A média aritmética é: " + media);
        }
        
        if(escolha == 2) {
            peso1 = Teclado.solicitarDouble("Informe o peso da primeira nota:");
            peso2 = Teclado.solicitarDouble("Informe o peso da segunda nota:");
            peso3 = Teclado.solicitarDouble("Informe o peso da terceira nota:");
            media = calcularMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);
            Video.exibirMensagemInformativa("A média pondera é: " + media);
        }
        
        if(media<MEDIA_ALUNO) {
            Video.exibirMensagemInformativa("Aluno Reprovado!");
            System.exit(0);
        }
        
        Video.exibirMensagemInformativa("Aluno Aprovado!");
	}
	
	static double calcularMediaPonderada(double n1, double n2, double n3,
	                             double p1, double p2, double p3) {
	                                 
	    return (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
	}
	
	static double calcularMediaAritmetica(double n1, double n2, double n3) {
	    return (n1 + n2 + n3) / 3;
	}
}
