import javax.swing.JOptionPane;

public class NegaException extends Exception {

    public NegaException() {

    }

    public void valorNegativo() {

        JOptionPane.showMessageDialog(null, "Valor negativo, insira um valor valido");
    }
}