import utilitarios.Teclado;
import utilitarios.Video;

public class Ex04 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        int aVogal = 0, eVogal = 0, iVogal = 0, oVogal = 0, uVogal = 0;

        for (int i = 0, cont = 1; i < nomes.length; i++) {
            nomes[i] = Teclado.solicitarString("Informe o " + cont + "° nome:");
            cont++;
        }

        for (String nome : nomes) {
            
            for (int i = 0; i < nome.length(); i++) {
                char letra = nome.charAt(i);

                if (letra == 'A' || letra == 'a') {
                    aVogal++;
                }
                if (letra == 'E' || letra == 'e') {
                    eVogal++;
                }
                if (letra == 'I' || letra == 'i') {
                    iVogal++;
                }
                if (letra == 'O' || letra == 'o') {
                    oVogal++;
                }
                if (letra == 'U' || letra == 'u') {
                    uVogal++;
                }
            }

        }

        Video.exibirMensagemInformativa("A vogal 'A' aparece: " + aVogal + " vezes");
        Video.exibirMensagemInformativa("A vogal 'E' aparece: " + eVogal + " vezes");
        Video.exibirMensagemInformativa("A vogal 'I' aparece: " + iVogal + " vezes");
        Video.exibirMensagemInformativa("A vogal 'O' aparece: " + oVogal + " vezes");
        Video.exibirMensagemInformativa("A vogal 'U' aparece: " + uVogal + " vezes");

    }
}
