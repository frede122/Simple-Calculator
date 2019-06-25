import javax.swing.JOptionPane;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.lang.ArithmeticException;

public class BotaoCalc{

    private JButton btnProximo = new JButton("Proximo");
    private JButton btnClear = new JButton("Clear");
    private JButton btnExit = new JButton("Exit");

    private JButton btnMais = new JButton("+");
    private JButton btnMenos = new JButton("-");
    private JButton btnDiv = new JButton("/");
    private JButton btnMulti = new JButton("*");
    private JButton btnIgual = new JButton("=");

    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");
    private JButton btn0 = new JButton("0");
    private JTextField field;
    private float a = 1, b = 1, result = 0;

	public JButton getBtnProximo() {
		return this.btnProximo;
	}

	public void setBtnProximo(JButton btnProximo) {
		this.btnProximo = btnProximo;
	}

	public JButton getBtnClear() {
		return this.btnClear;
	}

	public void setBtnClear(JButton btnClear) {
		this.btnClear = btnClear;
	}

	public JButton getBtnExit() {
		return this.btnExit;
	}

	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}

	public JButton getBtnMais() {
		return this.btnMais;
	}

	public void setBtnMais(JButton btnMais) {
		this.btnMais = btnMais;
	}

	public JButton getBtnMenos() {
		return this.btnMenos;
	}

	public void setBtnMenos(JButton btnMenos) {
		this.btnMenos = btnMenos;
	}

	public JButton getBtnDiv() {
		return this.btnDiv;
	}

	public void setBtnDiv(JButton btnDiv) {
		this.btnDiv = btnDiv;
	}

	public JButton getBtnMulti() {
		return this.btnMulti;
	}

	public void setBtnMulti(JButton btnMulti) {
		this.btnMulti = btnMulti;
	}

	public JButton getBtnIgual() {
		return this.btnIgual;
	}

	public void setBtnIgual(JButton btnIgual) {
		this.btnIgual = btnIgual;
	}

	public JButton getBtn1() {
		return this.btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn2() {
		return this.btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public JButton getBtn3() {
		return this.btn3;
	}

	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

	public JButton getBtn4() {
		return this.btn4;
	}

	public void setBtn4(JButton btn4) {
		this.btn4 = btn4;
	}

	public JButton getBtn5() {
		return this.btn5;
	}

	public void setBtn5(JButton btn5) {
		this.btn5 = btn5;
	}

	public JButton getBtn6() {
		return this.btn6;
	}

	public void setBtn6(JButton btn6) {
		this.btn6 = btn6;
	}

	public JButton getBtn7() {
		return this.btn7;
	}

	public void setBtn7(JButton btn7) {
		this.btn7 = btn7;
	}

	public JButton getBtn8() {
		return this.btn8;
	}

	public void setBtn8(JButton btn8) {
		this.btn8 = btn8;
	}

	public JButton getBtn9() {
		return this.btn9;
	}

	public void setBtn9(JButton btn9) {
		this.btn9 = btn9;
	}

	public JButton getBtn0() {
		return this.btn0;
	}

	public void setBtn0(JButton btn0) {
		this.btn0 = btn0;
	}

	public JTextField getField() {
		return this.field;
	}

	public void setField(JTextField field) {
		this.field = field;
	}

	public float getA() {
		return this.a;
	}

	public void setA(float a) {
		this.a = a;
	}


}