package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GroupSix extends JPanel {
    int ex = 0;
    int x1 = 1;
    int x2 = 1;
    int y1 = 1;
    int y2 = 1;
    int run = 1;
    JTextField TextOne;
    JTextField TextTwo;
    JTable TableSix;
    public GroupSix() {

        super(new GridLayout(0, 7));
        setBackground(Color.blue);
        TextOne = new JTextField();
        TextTwo = new JTextField();
        TableSix = new JTable(2,2);
        JLabel label = new JLabel("Group Six");
        JButton sixButton1 = new JButton("make or add words");
        sixButton1.addActionListener(new buttonOne());
        JButton sixButton2 = new JButton("start");
        sixButton2.addActionListener(new buttonTwo());
        JButton sixButton3 = new JButton("stop");
        sixButton3.addActionListener(new buttonThree());
        add(label);
        add(TextOne);
        add(sixButton1);
        add(sixButton2);
        add(sixButton3);
        add(TextTwo);
        add(TableSix);


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
                x1 = randValue.nextInt(TableSix.getRowCount());
                y1 = randValue.nextInt(TableSix.getColumnCount());
                x2 = randValue.nextInt(TableSix.getRowCount());
                y2 = randValue.nextInt(TableSix.getColumnCount());
                TableSix.setValueAt("R"+ x1+y1,x1  , y1 );
                TableSix.setValueAt("R"+ x2+y2, x2 , y2 );
                repaint();
            }
            
        }
    }

    class buttonTwo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            timer1.start();

        }
    }
    Timer timer1 = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String save1 = (String) TableSix.getValueAt(x1, y1);
            TableSix.setValueAt("", x1, y1);
            String save2 = (String) TableSix.getValueAt(x2, y2);
            TableSix.setValueAt("", x2, y2);
            x1 += 2;
            if (x1 >= TableSix.getRowCount()) {
                x1 = 0;
            }
            y1 += 1;
            if (y1 >= TableSix.getColumnCount()) {
                y1 = 0;
            }
            x2 += 2;
            if (x2 >= TableSix.getRowCount()) {
                x2 = 0;
            }
            y2 += 1;
            if (y2 >= TableSix.getColumnCount()) {
                y2 = 0;
            }
            TableSix.setValueAt(save1, x1, y1);
            TableSix.setValueAt(save2, x2, y2);
            repaint();
        }
    });
    class buttonThree implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
        timer1.stop();
        }
    }


}
