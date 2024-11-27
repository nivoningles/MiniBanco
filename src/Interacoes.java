import java.util.ArrayList;
import java.util.List;

public class Interacoes {

    private Double valorFinal = 500.;
    private List<String> mensagem = new ArrayList<String>();


    public void operacao(String valor, int operacao) {

        try {



        if (operacao == 1) {

            if (valorFinal < Double.valueOf(valor)) {

                mensagem.add("Erro Saldo Insuficiente");

            } else if (Double.valueOf(valor) < 0) {

                mensagem.add("Erro Numero negativo");

            } else {

                mensagem.add("Saque Bem Sucedido");
                valorFinal = valorFinal - Double.valueOf(valor);

            }

        } else if (operacao == 2) {

            if (Double.valueOf(valor) >= 1000) {

                mensagem.add("Erro Limite Maximo de Deposito é 1000");

            }else if (Double.valueOf(valor) < 0) {

                mensagem.add("Erro Numero negativo");

            } else {

                mensagem.add("Deposito Bem Sucedido");
                valorFinal = valorFinal + Double.valueOf(valor);

            }


        }

    }catch (Exception e) {

            mensagem.add("Informar Valor Valido");

        }

    }

    public String getSaldo(){
        return "R$ " + valorFinal;
    }


    public String mensagem(){

        return String.join("\n", mensagem);

    }

    public void limpar(){

        mensagem.clear();

    }


}
