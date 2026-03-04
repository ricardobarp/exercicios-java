import utilitarios.*;

public class Ex01 {
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        String nomeCompleto;

        nome = Teclado.solicitarString
        ("Informe seu nome: ");

        sobrenome = Teclado.solicitarString
        ("Informe seu sobrenome: ");

        nomeCompleto = nome.concat(" " + sobrenome);
        Video.exibirMensagem("O seu nome completo é: " + nomeCompleto);
    }

}
