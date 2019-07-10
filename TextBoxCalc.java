import javax.swing.JOptionPane;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.lang.ArithmeticException;

public class TextBoxCalc {
    private JTextField text1 = new JTextField(10);
    private JTextField text2 = new JTextField(10);
    private JTextField text3 = new JTextField(10);

    public TextBoxCalc(){
        text1.setBounds(90, 10, 185, 25);
        text2.setBounds(90, 40, 185, 25);
        text3.setBounds(90, 70, 185, 25);
        // text3.disable();
        text3.setText("");
    }


    public static void limpaCaixa(JTextField f) {
        f.setText("");
        f.requestFocus();
    }

    public static void limpaCaixa(JTextField f1, JTextField f2) {
        limpaCaixa(f2);
        limpaCaixa(f1);

    }

    public static void limpaCaixa(JTextField f1, JTextField f2, JTextField f3) {
        f3.setText("");
        limpaCaixa(f1, f2);
    }


    public JTextField getText1() {
        return this.text1;
    }

    public void setText1(JTextField text1) {
        this.text1 = text1;
    }

    public JTextField getText2() {
        return this.text2;
    }

    public void setText2(JTextField text2) {
        this.text2 = text2;
    }

    public JTextField getText3() {
        return this.text3;
    }

    public void setText3(JTextField text3) {
        this.text3 = text3;
    }

}
