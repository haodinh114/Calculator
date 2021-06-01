package View;
import Controller.BWCalculator;
import Controller.BinaryCalculator;
import Model.Binary;
import Model.Number;

import javax.swing.*;
import java.awt.*;

import static java.lang.Integer.parseInt;

public class BWCalView {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("Bandwidth Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        frame.setLayout(null);
//        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
//        frame.setVisible(true);

        JPanel res = panel();

        frame.add(res);
        frame.setVisible(true);
    }

    public static JPanel panel() {

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 600, 800);
        p1.setBackground(Color.pink);

//        JButton b1 = new JButton("+");
//        b1.setBounds(175,25,60,50);

        JButton clear1 = new JButton("Clear");
        clear1.setBounds(450,45,100,30);

        JButton b5 = new JButton("Calculate");
        b5.setBounds(350,45,100,30);

        JLabel text = new JLabel("Hosting Bandwidth Converter");
        text.setBounds(5,0,200,20);

        JLabel text1 = new JLabel("Monthly Usage:");
        text1.setBounds(5,25,160,20);

//        JTextField tf1 = new JTextField();
//        tf1.setBounds(150,25,100,30);

        JTextField tf6 = new JTextField();
        tf6.setBounds(250,25,100,30);

        JTextField tf1 = new JTextField();
        tf1.setBounds(150,25,100,30);

        JLabel text2 = new JLabel("Bandwidth:");
        text2.setBounds(5,65,160,20);

        JTextField tf7 = new JTextField();
        tf7.setBounds(250,65,100,30);

        JTextField tf2 = new JTextField();
        tf2.setBounds(150,65,100,30);

        JTextArea tf3 = new JTextArea();
        tf3.setBounds(0,100,400,25);

        JLabel text3 = new JLabel("Data Unit Converter");
        text3.setBounds(5,130,200,20);

        JTextField tf4 = new JTextField();
        tf4.setBounds(150,130,100,30);

        JTextField tf8 = new JTextField();
        tf8.setBounds(250,130,100,30);

        JButton b6 = new JButton("Calculate");
        b6.setBounds(350,130,100,30);

        JButton clear2 = new JButton("Clear");
        clear2.setBounds(450,130,100,30);

        JTextArea tf5 = new JTextArea();
        tf5.setBounds(5,165,370,200);

        JLabel text4 = new JLabel("Download/Upload Time Calculator");
        text4.setBounds(5,375,250,20);

        JLabel text5 = new JLabel("File Size:");
        text5.setBounds(5,400,200,20);

        JTextField tf9 = new JTextField();
        tf9.setBounds(150,400,100,30);

        JTextField tf10 = new JTextField();
        tf10.setBounds(250,400,100,30);

        JLabel text6 = new JLabel("Bandwidth:");
        text6.setBounds(5,440,200,20);

        JTextField tf11 = new JTextField();
        tf11.setBounds(150,440,100,30);

        JTextField tf12 = new JTextField();
        tf12.setBounds(250,440,100,30);

        JButton b7 = new JButton("Calculate");
        b7.setBounds(350,420,100,30);

        JButton clear3 = new JButton("Clear");
        clear3.setBounds(450,420,100,30);

        JTextArea tf13 = new JTextArea();
        tf13.setBounds(5,480,370,25);

        JLabel text7 = new JLabel("Website Bandwidth Calculator");
        text7.setBounds(5,515,250,20);

        JLabel text8 = new JLabel("Page Views:");
        text8.setBounds(5,540,200,20);

        JTextField tf14 = new JTextField();
        tf14.setBounds(150,540,100,30);

        JTextField tf15 = new JTextField();
        tf15.setBounds(250,540,100,30);

        JLabel text9 = new JLabel("Average Page Size:");
        text9.setBounds(5,580,200,20);

        JTextField tf16 = new JTextField();
        tf16.setBounds(150,580,100,30);

        JTextField tf17 = new JTextField();
        tf17.setBounds(250,580,100,30);

        JLabel text10 = new JLabel("Redundancy Factor:");
        text10.setBounds(5,620,200,20);

        JTextField tf18 = new JTextField();
        tf18.setBounds(150,620,100,30);

        JButton b8 = new JButton("Calculate");
        b8.setBounds(150,660,100,30);

        JButton clear4 = new JButton("Clear");
        clear4.setBounds(250,660,100,30);

        JTextArea tf19 = new JTextArea();
        tf19.setBounds(5,700,500,25);

        b5.addActionListener(e -> {
            BWCalculator cal = new BWCalculator();
            String num1 = tf1.getText();
            String num2 = tf2.getText();
//            Binary newBin1 = new Binary(num1);
//            Binary newBin2 = new Binary(num2);
            //String result = null;
            String unit1 = tf6.getText();
            String unit2 = tf7.getText();
            double size = parseInt(num1);
            double bandWidth = parseInt(num2);
            String result = cal.MonthlyUsage(size, unit1, bandWidth, unit2);
            String restotal = String.valueOf(result);
            tf3.setText(restotal);

        });

        b6.addActionListener(e -> {
            BWCalculator cal = new BWCalculator();
            String num1 = tf4.getText();
            //String num2 = tf2.getText();
//            Binary newBin1 = new Binary(num1);
//            Binary newBin2 = new Binary(num2);
            //String result = null;
            //String unit1 = tf6.getText();
            String unit = tf8.getText();
            double size = parseInt(num1);
           // double bandWidth = Double.parseDouble(num2);
            String result = cal.UnitConvert(size, unit);
            String restotal = String.valueOf(result);
            tf5.setText(restotal);

        });

        b8.addActionListener(e -> {
            BWCalculator cal = new BWCalculator();
            String num1 = tf14.getText();
            String num2 = tf16.getText();
            String num3 = tf18.getText();
//            Binary newBin1 = new Binary(num1);
//            Binary newBin2 = new Binary(num2);
            //String result = null;
            String unit1 = tf15.getText();
            String unit2 = tf17.getText();
            double view = parseInt(num1);
            double size = parseInt(num2);
            int redundancy = parseInt(num3);
            String result = cal.calculateWebsiteBW(view, unit1, size, unit2, redundancy);
            String restotal = String.valueOf(result);
            tf19.setText(restotal);

        });

        b7.addActionListener(e -> {
            BWCalculator cal = new BWCalculator();
            String num1 = tf9.getText();
            String num2 = tf11.getText();
//            Binary newBin1 = new Binary(num1);
//            Binary newBin2 = new Binary(num2);
            //String result = null;
            String unit1 = tf10.getText();
            String unit2 = tf12.getText();
            double size = parseInt(num1);
            double bandWidth = parseInt(num2);
            double result = cal.calculateUpAndDownBW(size, unit1, bandWidth, unit2);
            String restotal = String.valueOf(result);
            tf13.setText(restotal);

        });

        clear1.addActionListener(e -> {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf6.setText("");
            tf7.setText("");

        });

        clear2.addActionListener(e -> {
            tf4.setText("");
            tf5.setText("");
            tf8.setText("");

        });

        clear3.addActionListener(e -> {
            tf9.setText("");
            tf10.setText("");
            tf11.setText("");
            tf12.setText("");
            tf13.setText("");

        });

        clear4.addActionListener(e -> {
            tf14.setText("");
            tf15.setText("");
            tf16.setText("");
            tf17.setText("");
            tf18.setText("");
            tf19.setText("");

        });

        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(clear1);
        p1.add(clear2);
        p1.add(clear3);
        p1.add(clear4);
        p1.add(tf1);
        p1.add(tf2);
        p1.add(tf3);
        p1.add(tf4);
        p1.add(tf5);
        p1.add(tf6);
        p1.add(tf7);
        p1.add(tf8);
        p1.add(tf9);
        p1.add(tf10);
        p1.add(tf11);
        p1.add(tf12);
        p1.add(tf13);
        p1.add(tf14);
        p1.add(tf15);
        p1.add(tf16);
        p1.add(tf17);
        p1.add(tf18);
        p1.add(tf19);
        p1.add(text);
        p1.add(text1);
        p1.add(text2);
        p1.add(text3);
        p1.add(text4);
        p1.add(text5);
        p1.add(text6);
        p1.add(text7);
        p1.add(text8);
        p1.add(text9);
        p1.add(text10);
        p1.setVisible(true);

        return p1;
    }
}
