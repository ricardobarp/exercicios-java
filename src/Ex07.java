import utilitarios.Teclado;
import utilitarios.Video;

public class Ex07 {
    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        int escolha = 0;

        while(true) {

            for (int i = 0, cont = 1; i < numeros.length; i++, cont++) {
                numeros[i] = Teclado.solicitarInt("Digite o "+ cont +"° número:");
            }            

            Video.exibirMensagemInformativa("Escolha uma das opções:");
            Video.exibirMensagem("1 - Maior número\n2 - Menor número\n3 - Média aritmética dos números\n4 - Alterar números\n");

            escolha = Teclado.solicitarInt();

            switch (escolha) {
                case 1:
                    int maior;
                    maior = verificarMaiorNumero(numeros);
                    Video.exibirMensagemInformativa("O maior número é: " + maior);
                    return;
                case 2:
                    int menor;
                    menor = verificarMenorNumero(numeros);
                    Video.exibirMensagemInformativa("O menor número é: " + menor);
                    return;
                case 3:
                    double media;
                    media = calcularMediaNumeros(numeros);
                    Video.exibirMensagemInformativa("A media dos número é: " + media);
                    return;
                case 4:
                    continue;
                default:
                    Video.exibirMensagemErro("Você precisa escolher uma das opções!");
                    return;
            }
        }

    }

    static int verificarMaiorNumero(int[] n) {
        int maior = n[0];
        for (int i : n) {
            if (i > maior) {
                maior = i;
            }
        } 
        return maior;
    }

    static int verificarMenorNumero(int[] n) {
        int menor = n[0];
        for (int i : n) {
            if (i < menor) {
                menor = i;
            }
        } 
        return menor;
    }
    static double calcularMediaNumeros(int[] n) {
        double contador = 0;
        for (int i : n) {
            contador += i;
        }
        return contador / n.length;
    }
}