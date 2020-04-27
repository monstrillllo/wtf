package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GroupOne extends JPanel {
    private JComboBox box;
    private JTextField Field;

    public GroupOne() {
        super(new GridLayout(0, 4));
        setBackground(Color.GREEN);
        JLabel label = new JLabel("Group One");
        Field = new JTextField(12);
        JButton button = new JButton("Add to Box");
        box = new JComboBox();
        box.setEditable(true);
        button.addActionListener(new buttonListener());
        add(label);
        add(Field);
        add(button);
        add(box);

    }

    class buttonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String field = Field.getText();
            for (int i = 0; i < box.getItemCount(); i++) {
                String a = box.getItemAt(i).toString();
                if (a.equals(field)){
                    JOptionPane.showMessageDialog(null, "Already exist ","Warning",JOptionPane.WARNING_MESSAGE);
                    return;}
            }
            box.addItem(field);
        }
    }
}
