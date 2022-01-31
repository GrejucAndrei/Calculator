package com.company;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;


public class Calculator implements ActionListener {

    JFrame frame;
    JLabel display;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPlus,bMinus,bEquals,bMult,bDiv,bDot,bClear;
    Font buttonFont = new Font("Century",Font.PLAIN,24);

    LinkedList<Float> listOfNumbers = new LinkedList<Float>();

    Float result = 0f;
    String numberToBeAdded = "";
    char operation;



    Calculator(){
        //Labels
        display = new JLabel();
        display.setBounds(0,-10,500,100);
        display.setFont(new Font("Century", Font.BOLD,24));
        display.setForeground(Color.white);

        //Buttons
        b1 = new JButton();
        b1.setFocusPainted(false);
        b1.setBounds(0,160,50,50);
        b1.setText("1");
        styleButton(b1);

        b2 = new JButton();
        b2.setBounds(50,160,50,50);
        b2.setText("2");
        styleButton(b2);

        b3 = new JButton();
        b3.setBounds(100,160,50,50);
        b3.setText("3");
        styleButton(b3);

        b4 = new JButton();
        b4.setBounds(0,110,50,50);
        b4.setText("4");
        styleButton(b4);

        b5 = new JButton();
        b5.setBounds(50,110,50,50);
        b5.setText("5");
        styleButton(b5);

        b6 = new JButton();
        b6.setBounds(100,110,50,50);
        b6.setText("6");
        styleButton(b6);

        b7 = new JButton();
        b7.setBounds(0,60,50,50);
        b7.setText("7");
        styleButton(b7);

        b8 = new JButton();
        b8.setBounds(50,60,50,50);
        b8.setText("8");
        styleButton(b8);

        b9 = new JButton();
        b9.setBounds(100,60,50,50);
        b9.setText("9");
        styleButton(b9);

        b0 = new JButton();
        b0.setBounds(50,210,50,50);
        b0.setText("0");
        styleButton(b0);

        bPlus = new JButton();
        bPlus.setBounds(0,210,50,50);
        bPlus.setText("+");
        styleButton(bPlus);

        bMinus = new JButton();
        bMinus.setBounds(150,160,50,50);
        bMinus.setText("-");
        styleButton(bMinus);

        bMult = new JButton();
        bMult.setBounds(150,110,50,50);
        bMult.setText("*");
        styleButton(bMult);

        bDiv = new JButton();
        bDiv.setBounds(150,60,50,50);
        bDiv.setText("/");
        styleButton(bDiv);

        bDot = new JButton();
        bDot.setBounds(100,210,50,50);
        bDot.setText(".");
        styleButton(bDot);

        bEquals = new JButton();
        bEquals.setBounds(150,210,50,50);
        bEquals.setText("=");
        styleButton(bEquals);

        bClear = new JButton();
        bClear.setBounds(200,210,50,50);
        bClear.setText("c");
        styleButton(bClear);


        //Frame
        frame = new JFrame("Calculator");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(bClear);
        frame.add(bPlus);
        frame.add(bMinus);
        frame.add(bMult);
        frame.add(bDiv);
        frame.add(bEquals);
        frame.add(bDot);
        frame.add(display);

        frame.setVisible(true);


    }

    public void styleButton(JButton button){
        button.setFocusPainted(false);
        button.addActionListener(this);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.setFont(buttonFont);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //numbers
        if(e.getSource() == b1){
            display.setText(display.getText()+"1");
            numberToBeAdded = numberToBeAdded.concat("1");
        }
        if(e.getSource() == b2){
            display.setText(display.getText()+"2");
            numberToBeAdded = numberToBeAdded.concat("2");
        }
        if(e.getSource() == b3){
            display.setText(display.getText()+"3");
            numberToBeAdded = numberToBeAdded.concat("3");
        }
        if(e.getSource() == b4){
            display.setText(display.getText()+"4");
            numberToBeAdded = numberToBeAdded.concat("4");
        }
        if(e.getSource() == b5){
            display.setText(display.getText()+"5");
            numberToBeAdded = numberToBeAdded.concat("5");
        }
        if(e.getSource() == b6){
            display.setText(display.getText()+"6");
            numberToBeAdded = numberToBeAdded.concat("6");
        }
        if(e.getSource() == b7){
            display.setText(display.getText()+"7");
            numberToBeAdded = numberToBeAdded.concat("7");
        }
        if(e.getSource() == b8){
            display.setText(display.getText()+"8");
            numberToBeAdded = numberToBeAdded.concat("8");
        }
        if(e.getSource() == b9){
            display.setText(display.getText()+"9");
            numberToBeAdded = numberToBeAdded.concat("9");
        }
        if(e.getSource() == b0){
            display.setText(display.getText()+"0");
            numberToBeAdded = numberToBeAdded.concat("0");
        }
        if(e.getSource() == bDot){
            display.setText(display.getText() +".");
            numberToBeAdded = numberToBeAdded.concat(".");
        }
        //operations
        if(e.getSource() == bPlus){ // Plus button
        try {
            listOfNumbers.add(Float.parseFloat(numberToBeAdded));
            operation = '+';

            numberToBeAdded = "";

            display.setText(display.getText() + " + ");
        }
        catch(NumberFormatException ex){
            System.out.println("ERROR : " + ex.getMessage());
        }
            }
        if(e.getSource() == bMinus){
        try {
            listOfNumbers.add(Float.parseFloat(numberToBeAdded));
            operation = '-';

            numberToBeAdded = "";
            display.setText(display.getText() + " - ");
        }
        catch(NumberFormatException ex){
            System.out.println("ERROR : " + ex.getMessage());
        }
        }
        if(e.getSource() == bMult){
        try {
            listOfNumbers.add(Float.parseFloat(numberToBeAdded));
            operation = '*';

            numberToBeAdded = "";
            display.setText(display.getText() + " * ");
        }
        catch(NumberFormatException ex){
            System.out.println("ERROR : " + ex.getMessage());
        }
        }
        if(e.getSource() == bDiv){
            try {
                listOfNumbers.add(Float.parseFloat(numberToBeAdded));
                operation = '/';

                numberToBeAdded = "";
                display.setText(display.getText() + " / ");
            }
            catch(NumberFormatException ex){
                System.out.println("ERROR : " + ex.getMessage());
            }
        }

        if(e.getSource() == bEquals){
            try {
                listOfNumbers.add(Float.parseFloat(numberToBeAdded));
                numberToBeAdded = "";


                display.setText(display.getText() + " = " + calc(listOfNumbers, operation));
            }
            catch(NumberFormatException ex){
                System.out.println("ERROR : " + ex.getMessage());
            }
        }
        if(e.getSource()==bClear){
            frame.dispose();
            Calculator calc = new Calculator();
        }

    }
    public Float calc(LinkedList<Float> numbers, char op){

        if(op == '+'){
            return numbers.get(0) + numbers.get(1);
        }
        if(op == '-'){
            return numbers.get(0) - numbers.get(1);
        }
        if(op == '*'){
            return numbers.get(0) * numbers.get(1);
        }
        if(op == '/'){
            return numbers.get(0) / numbers.get(1);
        }

        return 0f;
    };

}
