import javax.swing.JOptionPane;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.lang.ArithmeticException;

public class JanelaPrinc extends JFrame{

    BotaoCalc bt = new BotaoCalc();
    LabelCalc lb = new LabelCalc();
    TextBoxCalc tx = new TextBoxCalc();
    public JanelaPrinc(Calculadora j){



        bt.getBtnProximo().setBounds(5, 110, 200, 25);
        bt.getBtnProximo().addActionListener(j);
        bt.getBtnMais().setBounds(225, 110, 50, 25);
        bt.getBtnMais().addActionListener(j);

        bt.getBtn1().setBounds(5, 145, 50, 30);
        bt.getBtn1().setMnemonic(1);
        bt.getBtn1().addActionListener(j);
        bt.getBtn2().setBounds(85, 145, 50, 30);
        bt.getBtn2().addActionListener(j);
        bt.getBtn3().setBounds(155, 145, 50, 30);
        bt.getBtn3().addActionListener(j);
        bt.getBtnMenos().setBounds(225, 145, 50, 30);
        bt.getBtnMenos().addActionListener(j);

        bt.getBtn4().setBounds(5, 185, 50, 30);
        bt.getBtn4().addActionListener(j);
        bt.getBtn5().setBounds(85, 185, 50, 30);
        bt.getBtn5().addActionListener(j);
        bt.getBtn6().setBounds(155, 185, 50, 30);
        bt.getBtn6().addActionListener(j);
        bt.getBtnDiv().setBounds(225, 185, 50, 30);
        bt.getBtnDiv().addActionListener(j);

        bt.getBtn7().setBounds(5, 225, 50, 30);
        bt.getBtn7().addActionListener(j);
        bt.getBtn8().setBounds(85, 225, 50, 30);
        bt.getBtn8().addActionListener(j);
        bt.getBtn9().setBounds(155, 225, 50, 30);
        bt.getBtn9().addActionListener(j);
        bt.getBtnMulti().setBounds(225, 225, 50, 30);
        bt.getBtnMulti().addActionListener(j);

        bt.getBtnClear().setBounds(5, 265, 75, 30);
        bt.getBtnClear().addActionListener(j);
        bt.getBtn0().setBounds(85, 265, 50, 30);
        bt.getBtn0().addActionListener(j);
        bt.getBtnExit().setBounds(145, 265, 60, 30);
        bt.getBtnExit().addActionListener(j);
        bt.getBtnIgual().setBounds(225, 265, 50, 30);
        bt.getBtnIgual().addActionListener(j);


        this.add(lb.getLabel1());
        this.add(tx.getText1());

        this.add(lb.getLabel2());
        this.add(tx.getText2());

        this.add(lb.getLabel3());
        this.add(tx.getText3());

        this.add(bt.getBtnProximo());
        this.add(bt.getBtnMais());

        this.add(bt.getBtn1());
        this.add(bt.getBtn2());
        this.add(bt.getBtn3());
        this.add(bt.getBtnMenos());

        this.add(bt.getBtn4());
        this.add(bt.getBtn5());
        this.add(bt.getBtn6());
        this.add(bt.getBtnDiv());

        this.add(bt.getBtn7());
        this.add(bt.getBtn8());
        this.add(bt.getBtn9());
        this.add(bt.getBtnMulti());

        this.add(bt.getBtnClear());
        this.add(bt.getBtn0());
        this.add(bt.getBtnExit());
        this.add(bt.getBtnIgual());

        this.setLayout(null);
        this.setSize(300, 350);
    }
}