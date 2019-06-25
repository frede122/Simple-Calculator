import javax.swing.JOptionPane;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.lang.ArithmeticException;

public class LabelCalc{

    private JLabel label1 = new JLabel("Valor 1:");
    private JLabel label2 = new JLabel("Valor 2:");
    private JLabel label3 = new JLabel("Resultado:");

    public LabelCalc(){
        label1.setBounds(5, 10, 70, 25);
        label2.setBounds(5, 40, 70, 25);
        label3.setBounds(5, 70, 70, 25);
    }


	public JLabel getLabel1() {
		return this.label1;
	}

	public void setLabel1(JLabel label1) {
		this.label1 = label1;
	}

	public JLabel getLabel2() {
		return this.label2;
	}

	public void setLabel2(JLabel label2) {
		this.label2 = label2;
	}

	public JLabel getLabel3() {
		return this.label3;
	}

	public void setLabel3(JLabel label3) {
		this.label3 = label3;
	}

}