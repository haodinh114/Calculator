package View;

import Controller.BinaryCalculator;
import Model.Binary;
import Model.Number;
import View.Main;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

import static java.lang.Integer.parseInt;

public class BinCalView {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("Binary Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430, 300);
        frame.setLayout(null);
//        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
//        frame.setVisible(true);

        //JPanel panel1 = new JPanel();
        JPanel res = panel();

        frame.add(res);
        frame.setVisible(true);

//        JPanel p1 = new JPanel();
//        p1.setBounds(0, 0, 400, 300);
//        p1.setBackground(Color.gray);
//
//        JLabel text2 = new JLabel("Calculate Binary numbers:");
//        text2.setBounds(5,10,200,20);
//
//        JLabel text = new JLabel("Convert to Binary");
//        text.setBounds(5,145,150,20);
//
//        JTextField tf4 = new JTextField();
//        tf4.setBounds(130,145,100,30);
//
//        JLabel text1 = new JLabel("Convert to Decimal");
//        text1.setBounds(5,215,150,20);
//
//        JTextField tf6 = new JTextField();
//        tf6.setBounds(130,215,100,30);
//
//        JButton b1 = new JButton("+");
//        b1.setBounds(20,70,60,30);
//
//        JButton b2 = new JButton("-");
//        b2.setBounds(90,70,60,30);
//
//        JButton b3 = new JButton("*");
//        b3.setBounds(160,70,60,30);
//
//        JButton b4 = new JButton("/");
//        b4.setBounds(230,70,60,30);
//
//        JButton b5 = new JButton("Convert");
//        b5.setBounds(240,145,80,30);
//
//        JButton b6 = new JButton("Convert");
//        b6.setBounds(240,215,80,30);
//
//        JButton clear1 = new JButton("Clear");
//        clear1.setBounds(300,70,80,30);
//
//        JButton clear2 = new JButton("Clear");
//        clear2.setBounds(315,145,80,30);
//
//        JButton clear3 = new JButton("Clear");
//        clear3.setBounds(315,215,80,30);
//
//        JTextField tf1 = new JTextField();
//        tf1.setBounds(50,35,100,30);
//
//        JTextField tf2 = new JTextField();
//        tf2.setBounds(250,35,100,30);
//
//        JTextArea tf3 = new JTextArea();
//        tf3.setBounds(0,110,400,25);
//
//        JTextArea tf5 = new JTextArea();
//        tf5.setBounds(0,180,400,25);
//
//        JTextArea tf7 = new JTextArea();
//        tf7.setBounds(0,250,400,25);
//
////        JButton calculate = new JButton("=");
////        calculate.setBounds(75,50,50,30);
//
//
//          b1.addActionListener(e -> {
//            BinaryCalculator cal = new BinaryCalculator();
//            String num1 = tf1.getText();
//            String num2 = tf2.getText();
//            Binary newBin1 = new Binary(num1);
//            Binary newBin2 = new Binary(num2);
//            Number result = null;
//            result = cal.add(newBin1, newBin2);
//            String restotal = String.valueOf(result);
//            tf3.setText(restotal);
//
//        });
//
//        b2.addActionListener(e -> {
//            BinaryCalculator cal = new BinaryCalculator();
//            String num1 = tf1.getText();
//            String num2 = tf2.getText();
//            Binary newBin1 = new Binary(num1);
//            Binary newBin2 = new Binary(num2);
//            Number result = null;
//            result = cal.subtract(newBin1, newBin2);
//            String restotal = String.valueOf(result);
//            tf3.setText(restotal);
//
//        });
//
//        b3.addActionListener(e -> {
//            BinaryCalculator cal = new BinaryCalculator();
//            String num1 = tf1.getText();
//            String num2 = tf2.getText();
//            Binary newBin1 = new Binary(num1);
//            Binary newBin2 = new Binary(num2);
//            Number result = null;
//            result = cal.multiply(newBin1, newBin2);
//            String restotal = String.valueOf(result);
//            tf3.setText(restotal);
//
//        });
//
//        b4.addActionListener(e -> {
//            BinaryCalculator cal = new BinaryCalculator();
//            String num1 = tf1.getText();
//            String num2 = tf2.getText();
//            Binary newBin1 = new Binary(num1);
//            Binary newBin2 = new Binary(num2);
//            Number result = null;
//            result = cal.divide(newBin1, newBin2);
//            String restotal = String.valueOf(result);
//            tf3.setText(restotal);
//
//        });
//
//        b5.addActionListener(e -> {
//            BinaryCalculator cal = new BinaryCalculator();
//            String num1 = tf4.getText();
////            String num2 = tf2.getText();
////            Binary newBin1 = new Binary(num1);
////            Binary newBin2 = new Binary(num2);
////            Number result = null;
////            result = cal.multiply(newBin1, newBin2);
//            int x = parseInt(num1);
//            //Main.analyzeText("to do");
//            String result = cal.convertFromDec(x);
//            String restotal = String.valueOf(result);
//            tf5.setText(restotal);
//
//        });
//
//        b6.addActionListener(e -> {
//            BinaryCalculator cal = new BinaryCalculator();
//            String num1 = tf6.getText();
////            String num2 = tf2.getText();
////            Binary newBin1 = new Binary(num1);
////            Binary newBin2 = new Binary(num2);
////            Number result = null;
////            result = cal.multiply(newBin1, newBin2);
//            //int x = parseInt(num1);
//            int result = cal.convertToDec(num1);
//            String restotal = String.valueOf(result);
//            tf7.setText(restotal);
//
//        });
//
//        clear1.addActionListener(e -> {
//            tf1.setText("");
//            tf2.setText("");
//            tf3.setText("");
//
//        });
//
//        clear2.addActionListener(e -> {
//            tf4.setText("");
//            tf5.setText("");
//
//        });
//
//        clear3.addActionListener(e -> {
//            tf6.setText("");
//            tf7.setText("");
//
//        });
//
//
//        frame.add(b1);
//        frame.add(b2);
//        frame.add(b3);
//        frame.add(b4);
//        frame.add(b5);
//        frame.add(b6);
//        frame.add(tf4);
//        frame.add(tf1);
//        frame.add(tf2);
//        frame.add(tf3);
//        frame.add(tf5);
//        frame.add(tf6);
//        frame.add(tf7);
//        frame.add(text);
//        frame.add(text1);
//        frame.add(text2);
//        frame.add(clear1);
//        frame.add(clear2);
//        frame.add(clear3);
//        frame.setVisible(true);
//
//

}

    public static JPanel panel() {
//        JPanel p1 = new JPanel();
//
//        frame.setTitle("Binary Calculator");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 300);
//        frame.setLayout(null);
////        frame.setLayout(new BorderLayout());
//        frame.setResizable(false);
////        frame.setVisible(true);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 430, 300);
        p1.setBackground(Color.blue);

        JLabel text2 = new JLabel("Calculate Binary numbers:");
        text2.setBounds(5,10,200,20);

        JLabel text = new JLabel("Convert to Binary");
        text.setBounds(5,145,150,20);

        JTextField tf4 = new JTextField();
        tf4.setBounds(130,145,100,30);

        JLabel text1 = new JLabel("Convert to Decimal");
        text1.setBounds(5,215,150,20);

        JTextField tf6 = new JTextField();
        tf6.setBounds(130,215,100,30);

        JButton b1 = new JButton("+");
        b1.setBounds(20,70,60,30);

        JButton b2 = new JButton("-");
        b2.setBounds(90,70,60,30);

        JButton b3 = new JButton("*");
        b3.setBounds(160,70,60,30);

        JButton b4 = new JButton("/");
        b4.setBounds(230,70,60,30);

        JButton b5 = new JButton("Convert");
        b5.setBounds(240,145,80,30);

        JButton b6 = new JButton("Convert");
        b6.setBounds(240,215,80,30);

        JButton clear1 = new JButton("Clear");
        clear1.setBounds(300,70,80,30);

        JButton clear2 = new JButton("Clear");
        clear2.setBounds(315,145,80,30);

        JButton clear3 = new JButton("Clear");
        clear3.setBounds(315,215,80,30);

        JTextField tf1 = new JTextField();
        tf1.setBounds(50,35,100,30);

        JTextField tf2 = new JTextField();
        tf2.setBounds(250,35,100,30);

        JTextArea tf3 = new JTextArea();
        tf3.setBounds(0,110,400,25);

        JTextArea tf5 = new JTextArea();
        tf5.setBounds(0,180,400,25);

        JTextArea tf7 = new JTextArea();
        tf7.setBounds(0,250,400,25);

//        JButton calculate = new JButton("=");
//        calculate.setBounds(75,50,50,30);


        b1.addActionListener(e -> {
            BinaryCalculator cal = new BinaryCalculator();
            String num1 = tf1.getText();
            String num2 = tf2.getText();
            Binary newBin1 = new Binary(num1);
            Binary newBin2 = new Binary(num2);
            Number result = null;
            result = cal.add(newBin1, newBin2);
            String restotal = String.valueOf(result);
            tf3.setText(restotal);

        });

        b2.addActionListener(e -> {
            BinaryCalculator cal = new BinaryCalculator();
            String num1 = tf1.getText();
            String num2 = tf2.getText();
            Binary newBin1 = new Binary(num1);
            Binary newBin2 = new Binary(num2);
            Number result = null;
            result = cal.subtract(newBin1, newBin2);
            String restotal = String.valueOf(result);
            tf3.setText(restotal);

        });

        b3.addActionListener(e -> {
            BinaryCalculator cal = new BinaryCalculator();
            String num1 = tf1.getText();
            String num2 = tf2.getText();
            Binary newBin1 = new Binary(num1);
            Binary newBin2 = new Binary(num2);
            Number result = null;
            result = cal.multiply(newBin1, newBin2);
            String restotal = String.valueOf(result);
            tf3.setText(restotal);

        });

        b4.addActionListener(e -> {
            BinaryCalculator cal = new BinaryCalculator();
            String num1 = tf1.getText();
            String num2 = tf2.getText();
            Binary newBin1 = new Binary(num1);
            Binary newBin2 = new Binary(num2);
            Number result = null;
            result = cal.divide(newBin1, newBin2);
            String restotal = String.valueOf(result);
            tf3.setText(restotal);

        });

        b5.addActionListener(e -> {
            BinaryCalculator cal = new BinaryCalculator();
            String num1 = tf4.getText();
//            String num2 = tf2.getText();
//            Binary newBin1 = new Binary(num1);
//            Binary newBin2 = new Binary(num2);
//            Number result = null;
//            result = cal.multiply(newBin1, newBin2);
            int x = parseInt(num1);
            //Main.analyzeText("to do");
            String result = cal.convertFromDec(x);
            String restotal = String.valueOf(result);
            tf5.setText(restotal);

        });

        b6.addActionListener(e -> {
            BinaryCalculator cal = new BinaryCalculator();
            String num1 = tf6.getText();
//            String num2 = tf2.getText();
//            Binary newBin1 = new Binary(num1);
//            Binary newBin2 = new Binary(num2);
//            Number result = null;
//            result = cal.multiply(newBin1, newBin2);
            //int x = parseInt(num1);
            int result = cal.convertToDec(num1);
            String restotal = String.valueOf(result);
            tf7.setText(restotal);

        });

        clear1.addActionListener(e -> {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");

        });

        clear2.addActionListener(e -> {
            tf4.setText("");
            tf5.setText("");

        });

        clear3.addActionListener(e -> {
            tf6.setText("");
            tf7.setText("");

        });


        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(tf4);
        p1.add(tf1);
        p1.add(tf2);
        p1.add(tf3);
        p1.add(tf5);
        p1.add(tf6);
        p1.add(tf7);
        p1.add(text);
        p1.add(text1);
        p1.add(text2);
        p1.add(clear1);
        p1.add(clear2);
        p1.add(clear3);
        p1.setVisible(true);

        return p1;

    }
    }
