package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GroupSix extends JPanel {
    int ex = 0;
    JTextField TextOne;
    JTextField TextTwo;
    JTable TableSix;
    public GroupSix() {

        super(new GridLayout(0, 7));
        setBackground(Color.blue);
        TextOne = new JTextField(12);
        TextTwo = new JTextField(12);
        TableSix = new JTable(2,2);
        JLabel label = new JLabel("Group Six");
        JButton sixButton1 = new JButton("first");
        sixButton1.addActionListener(new buttonOne());
        JButton sixButton2 = new JButton("second");
        sixButton2.addActionListener(new buttonTwo());
        JButton sixButton3 = new JButton("three");
        sixButton3.addActionListener(new buttonThree());
        add(TextOne);
        add(sixButton1);
        add(sixButton2);
        add(sixButton3);
        add(TextTwo);
        add(TableSix);
        add(label);

    }

    class buttonOne implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(ex==0){int x = Integer.parseInt(TextOne.getText());
                int y = Integer.parseInt(TextTwo.getText());
                remove(TableSix);
                revalidate();
                TableSix = new JTable(x,y);
                add(TableSix);
                revalidate();
                repaint();
                ex++;
            }else{
                ex=0;
                Random randValue = new Random();
                TableSix.setValueAt("Random word"+ ex, randValue.nextInt(TableSix.getRowCount()) , randValue.nextInt(TableSix.getColumnCount()) );
            }
            
        }
    }

    class buttonTwo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

    class buttonThree implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

}
