import javax.swing.JTextField;


public class Convert{

    public static float gravarValor(JTextField f) {
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



}
