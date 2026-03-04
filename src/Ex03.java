import utilitarios.Teclado;
import utilitarios.Video;

public class Ex03 {
    public static void main(String[] args) {
        double valorHora, horasTrabalhadas;
        double valorHorasExtras = 0, horasExtras, salarioBruto, salarioLiquido;

        valorHora = Teclado.solicitarDouble("Informe o valor da hora do funcionário:");
        horasTrabalhadas = Teclado.solicitarDouble("Informe a quantidade de horas trabalhadas pelo funcionário:");

        if(horasTrabalhadas > 160) {
            horasExtras = horasTrabalhadas - 160;
            valorHorasExtras = horasExtras * valorHora * 0.50;
        }

        salarioBruto = valorHora * horasTrabalhadas + valorHorasExtras;

        Video.exibirMensagemInformativa("O salário bruto do funcionário é: " + salarioBruto);

        salarioLiquido = salarioBruto * 0.11;
        salarioLiquido = salarioBruto - salarioLiquido;

        Video.exibirMensagemInformativa("O salário com desconto de 11% do INSS do funcionário é: " + salarioLiquido);

    }
}
