package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GroupFive extends JPanel {
    private JTextField Text;
    private JTable table;

    public GroupFive() {
        super(new GridLayout(0, 6));
        setBackground(Color.yellow);
        Text = new JTextField(12);
        JLabel label = new JLabel("Group Five");
        JButton fiveButton1 = new JButton("first");
        fiveButton1.addActionListener(new buttonOne());
        JButton fiveButton2 = new JButton("second");
        fiveButton2.addActionListener(new buttonTwo());
        JButton fiveButton3 = new JButton("three");
        fiveButton3.addActionListener(new buttonThree());
        table = new JTable(2, 2);
        add(label);
        add(Text);
        add(fiveButton1);
        add(fiveButton2);
        add(fiveButton3);
        add(table);

    }

    class buttonOne implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String swap = Text.getText();
            int selected;
            try {
                selected = table.getSelectedRow();
                table.setValueAt(swap, selected, 0);
            } catch (java.lang.ArrayIndexOutOfBoundsException h) {
                System.out.println("Its ok");
            } catch (java.lang.NullPointerException t) {

            }
        }
    }

    class buttonTwo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String swap;
            int selected;
            try {
                selected = table.getSelectedRow();
                swap = (String) table.getValueAt(selected, 0);
                if (swap.equals("")) return;
                table.setValueAt("", selected, 0);
                table.setValueAt(swap, selected, 1);
            } catch (java.lang.ArrayIndexOutOfBoundsException h) {
                System.out.println("Its ok");
            } catch (java.lang.NullPointerException t) {

            }
        }
    }

    class buttonThree implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String swap;
            int selected;
            try {
                selected = table.getSelectedRow();
                swap = (String) table.getValueAt(selected, 1);
                if (swap.equals("")) return;
                table.setValueAt("", selected, 1);
                table.setValueAt(swap, selected, 0);
            } catch (java.lang.ArrayIndexOutOfBoundsException h) {
                System.out.println("Its ok");
            } catch (java.lang.NullPointerException t) {

            }
        }
    }
}
