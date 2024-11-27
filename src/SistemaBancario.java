import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SistemaBancario {
    private JLabel txtSaldo;
    private JTextField txtfSaque;
    private JButton btnSaque;
    private JTextField txtfDeposito;
    private JButton btnDeposito;
    public JTextArea txtArea;
    private JButton btnLimpar;
    private JPanel panelTela;
    private JPanel penalPrimeiro;
    private JPanel panelSegundo;
    private JPanel panelSegundoEsquerda;
    private JPanel panelSegundoDireita;
    private JPanel panelTerceiro;

    Interacoes inter = new Interacoes();

    public SistemaBancario() {
        btnSaque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtfSaque.getText().equals("")) {

                    txtfSaque.setText("");

                }else {

                    inter.operacao(txtfSaque.getText(), 1);
                    txtSaldo.setText(inter.getSaldo());
                    txtArea.setText(inter.mensagem());
                    txtfSaque.setText("");

                }

            }
        });
        btnDeposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtfDeposito.getText().equals("")) {

                    txtfDeposito.setText("");

                }else {

                    inter.operacao(txtfDeposito.getText(), 2);
                    txtSaldo.setText(inter.getSaldo());
                    txtArea.setText(inter.mensagem());
                    txtfDeposito.setText("");
                }

            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtArea.setText("");
                inter.limpar();

            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Sistema Bancario");
        frame.setContentPane(new SistemaBancario().panelTela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}




