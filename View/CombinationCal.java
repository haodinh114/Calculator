package View;

import javax.swing.*;
import java.awt.*;

public class CombinationCal {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("Handy Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1050, 820);
        frame.setLayout(null);
//        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
//        frame.setVisible(true);

//        JPanel panel1 = new JPanel();

        JPanel resBinCal = BinCalView.panel();
        resBinCal.setBounds(5,0,430,300);

        JPanel resHexCal = HexCalView.panel();
        resHexCal.setBounds(5,305,430,300);

        JPanel resBWCal = BWCalView.panel();
        resBWCal.setBounds(440,0,600,800);

        frame.add(resBinCal);
        frame.add(resHexCal);
        frame.add(resBWCal);
        frame.setVisible(true);

    }

    public static JPanel filePanel(){
        JPanel panel = new JPanel();
        panel.setBounds(0,0,430,160);
        panel.setBackground(Color.green);
        JLabel l1 = new JLabel("File name");
        l1.setBounds(5,20,100,30);
        JTextArea text = new JTextArea();
        text.setBounds(10,40,100,30);
        JButton b1 = new JButton("Finish");
        b1.setBounds(130,40,100,30);

        b1.addActionListener(e -> {
            String file = text.getText();
            String readFile = Main.analyzeText();

        });



    }
}
