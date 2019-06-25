import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Calculadora implements ActionListener{

    static JTextField text1 = new JTextField(10);
    static JTextField text2 = new JTextField(10);
    static JTextField text3 = new JTextField(10);

    static JLabel label1 = new JLabel("Valor 1:");
    static JLabel label2 = new JLabel("Valor 2:");
    static JLabel label3 = new JLabel("Resultado:");


    static JButton btnProximo = new JButton("Proximo");
    static JButton btnClear = new JButton("Clear");
    static JButton btnExit = new JButton("Exit");

    static JButton btnMais = new JButton("+");
    static JButton btnMenos = new JButton("-");
    static JButton btnDiv = new JButton("/");
    static JButton btnMulti = new JButton("*");
    static JButton btnIgual = new JButton("=");

    static JButton btn1 = new JButton("1");
    static JButton btn2 = new JButton("2");
    static JButton btn3 = new JButton("3");
    static JButton btn4 = new JButton("4");
    static JButton btn5 = new JButton("5");
    static JButton btn6 = new JButton("6");
    static JButton btn7 = new JButton("7");
    static JButton btn8 = new JButton("8");
    static JButton btn9 = new JButton("9");
    static JButton btn0 = new JButton("0");
    static JTextField field;
    static float a=1,b=1, result =0;
	

    static Calculadora j = new Calculadora();


    public static void main(String args[]){

        JFrame janela1 = new JFrame();
        janela1.setLayout(null);
        janela1.setSize(295,350);





        
	
	


        label1.setBounds(5, 10, 70, 25);
        label2.setBounds(5, 40, 70, 25);
        label3.setBounds(5, 70, 70, 25);

        
        
        text1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent e) {
                field = text1;
            }
        });

        text2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent e) {
                field = text2;
            }
        });

        text1.setBounds(90, 10, 185, 25);
        text2.setBounds(90, 40, 185, 25);
        text3.setBounds(90, 70, 185, 25);
        //text3.disable();
        text3.setText("");

        btnProximo.setBounds(5, 110, 200, 25);
        btnProximo.addActionListener(j);
        btnMais.setBounds(225, 110, 50, 25);
        btnMais.addActionListener(j);


        btn1.setBounds(5, 145, 50, 30);
        btn1.setMnemonic(1);
        btn1.addActionListener(j);
        btn2.setBounds(85, 145,  50, 30);
        btn2.addActionListener(j);
        btn3.setBounds(155, 145,  50, 30);
        btn3.addActionListener(j);
        btnMenos.setBounds(225, 145, 50, 30);
        btnMenos.addActionListener(j);

        
        btn4.setBounds(5, 185, 50, 30);
        btn4.addActionListener(j);
        btn5.setBounds(85, 185, 50, 30);
        btn5.addActionListener(j);
        btn6.setBounds(155, 185, 50, 30);
        btn6.addActionListener(j);
        btnDiv.setBounds(225, 185, 50, 30);
        btnDiv.addActionListener(j);

 
        btn7.setBounds(5, 225, 50, 30);    
        btn7.addActionListener(j);
        btn8.setBounds(85, 225, 50, 30);
        btn8.addActionListener(j);
        btn9.setBounds(155, 225, 50, 30);
        btn9.addActionListener(j);
        btnMulti.setBounds(225, 225, 50, 30);
        btnMulti.addActionListener(j);

        btnClear.setBounds(5, 265, 75, 30);
        btnClear.addActionListener(j);
        btn0.setBounds(85, 265, 50, 30);
        btn0.addActionListener(j);
        btnExit.setBounds(145, 265, 60, 30);    
        btnExit.addActionListener(j);
        btnIgual.setBounds(225, 265, 50, 30);
        btnIgual.addActionListener(j);
        
 
     
        

        

        
        
       
        
        janela1.add(label1);
        janela1.add(text1);
        
        janela1.add(label2);
        janela1.add(text2);
        
        janela1.add(label3);
        janela1.add(text3);

        janela1.add(btnProximo);
        janela1.add(btnMais);


        janela1.add(btn1);
        janela1.add(btn2);
        janela1.add(btn3);
        janela1.add(btnMenos);

        janela1.add(btn4);
        janela1.add(btn5);
        janela1.add(btn6);
        janela1.add(btnDiv);

        janela1.add(btn7);
        janela1.add(btn8);
        janela1.add(btn9);
        janela1.add(btnMulti);

        janela1.add(btnClear);
        janela1.add(btn0);
        janela1.add(btnExit);
        janela1.add(btnIgual);






        
        janela1.setVisible(true);
        

    }

    public void limpaCaixa(JTextField f1, JTextField f2){
        f1.setText("");
        f2.setText("");
        f1.requestFocus();
    }

    public void limpaCaixa(JTextField f1, JTextField f2, JTextField f3){
        f3.setText("");
        limpaCaixa(f1, f2);
    }

    public void actionPerformed(ActionEvent evt){
            Object obj = evt.getSource();
            
            if(btn0.equals(obj) || btn1.equals(obj) || btn2.equals(obj) || btn3.equals(obj) || btn4.equals(obj) || btn5.equals(obj) || btn6.equals(obj) || btn7.equals(obj) || btn8.equals(obj) || btn9.equals(obj)){
                JButton bt = (JButton)obj;
                if(field.equals(text1)){
                    text1.setText(text1.getText() + bt.getText());
                }else if(field.equals(text2)){
                    text2.setText(text2.getText() + bt.getText());
                }
		
                
                
            }

            if(btnProximo.equals(obj)){
                text2.requestFocus();
            }

            if(btnMais.equals(obj)){
                a = Float.parseFloat(text1.getText());
                b = Float.parseFloat(text2.getText());
                result = a + b;
                
            }
            
            if(btnMenos.equals(obj)){
                a = Float.parseFloat(text1.getText());
                b = Float.parseFloat(text2.getText());
                result = a - b;

            }
            if(btnDiv.equals(obj)){
                a = Float.parseFloat(text1.getText());
                b = Float.parseFloat(text2.getText());
                result = a / b;
                System.out.println(result);
            }

            if(btnMulti.equals(obj)){
                a = Float.parseFloat(text1.getText());
                b = Float.parseFloat(text2.getText());
                result = a * b;
            }

            if(btnIgual.equals(obj)){
                text3.setText(String.valueOf(result));
                limpaCaixa(text1, text2);
            }

            if(btnClear.equals(obj)){
                limpaCaixa(text1, text2, text3);
            }

            if(btnExit.equals(obj)){
                System.exit(0);
            }

    }


}
