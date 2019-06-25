import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.ArithmeticException;

public class Calculadora implements ActionListener {

    static JTextField field;
    static float a = 0, b = 0, result = 0;
    static Calculadora j = new Calculadora();
    static JanelaPrinc jn = new JanelaPrinc(j);


    public static void main(String args[]) {

       jn.tx.getText1().addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent e) {
                field = jn.tx.getText1();
            }
        });

        jn.tx.getText2().addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent e) {
                field = jn.tx.getText2();
            }
        });

        jn.setVisible(true);
    }

    
    public float gravarValor(JTextField f) {
        float r = 0;
        try {
            r = Float.parseFloat(f.getText());

        } catch (Exception ae) {

            JOptionPane.showMessageDialog(null,
                    "Valor não numerico, insira novamente os dados \n erro: " + ae.getMessage());
            TextBoxCalc.limpaCaixa(f);
        }

        return r;

    }

    public void actionPerformed(ActionEvent evt) {
        Object obj = evt.getSource();
        
        if ( jn.bt.getBtn0().equals(obj) || jn.bt.getBtn1().equals(obj) || jn.bt.getBtn2().equals(obj) || jn.bt.getBtn3().equals(obj) || jn.bt.getBtn4().equals(obj)
                || jn.bt.getBtn5().equals(obj) || jn.bt.getBtn6().equals(obj) || jn.bt.getBtn7().equals(obj) || jn.bt.getBtn8().equals(obj) || jn.bt.getBtn9().equals(obj)) {
            JButton bt = (JButton) obj;
            if (field.equals(jn.tx.getText1())) {
                jn.tx.getText1().setText(jn.tx.getText1().getText() + bt.getText());
            } else if (field.equals(jn.tx.getText2())) {
                jn.tx.getText2().setText(jn.tx.getText2().getText() + bt.getText());
            }

        }

        if (jn.bt.getBtnProximo().equals(obj)) {
            jn.tx.getText2().requestFocus();
        }

        if (jn.bt.getBtnMais().equals(obj)) {
            a = gravarValor(jn.tx.getText1());
            b = gravarValor(jn.tx.getText2());
            result = Func.soma(a, b);

        }

        if (jn.bt.getBtnMenos().equals(obj)) {
            a = gravarValor(jn.tx.getText1());
            b = gravarValor(jn.tx.getText2());
            try {
                result = Func.subtrair(a, b);
            } catch (NegaException ne) {
                ne.valorNegativo();
                TextBoxCalc.limpaCaixa(jn.tx.getText2());
            }

        }

        if (jn.bt.getBtnMulti().equals(obj)) {
            a = gravarValor(jn.tx.getText1());
            b = gravarValor(jn.tx.getText2());
            result = a * b;

        }

        if (jn.bt.getBtnDiv().equals(obj)) {
            a = gravarValor(jn.tx.getText1());
            b = gravarValor(jn.tx.getText2());
            try {
                result = Func.dividir(a, b);
            } catch (ArithmeticException ae) {
                JOptionPane.showMessageDialog(null,
                        "Não existe divisão por zero, insira novamente o valor erro: " + ae.getMessage());
                if (a == 0) {
                    TextBoxCalc.limpaCaixa(jn.tx.getText1());
                } else if (b == 0) {
                    TextBoxCalc.limpaCaixa(jn.tx.getText2());
                }
            }

        }

        if (jn.bt.getBtnIgual().equals(obj)) {
            jn.tx.getText3().setText(String.valueOf(result));
            TextBoxCalc.limpaCaixa(jn.tx.getText1(), jn.tx.getText2());
        }

        if (jn.bt.getBtnClear().equals(obj)) {
            TextBoxCalc.limpaCaixa(jn.tx.getText1(),jn.tx.getText2(),jn.tx.getText3());

        }

        if (jn.bt.getBtnExit().equals(obj)) {
            System.exit(0);
        }

    }

}

