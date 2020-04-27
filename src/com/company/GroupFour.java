package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GroupFour extends JPanel {
    private JTextField Field;
    private JCheckBox CheckOne;
    private JCheckBox CheckTwo;
    private JCheckBox CheckThr;

    public GroupFour() {
        super(new GridLayout(0, 6));
        setBackground(Color.ORANGE);
        Field = new JTextField(12);
        JLabel label = new JLabel("Group Four");
        JButton fourButton = new JButton("press");
        fourButton.addActionListener(new groupFourL());
        CheckOne = new JCheckBox("one");
        CheckOne.setBackground(Color.ORANGE);
        CheckTwo = new JCheckBox("two");
        CheckTwo.setBackground(Color.ORANGE);
        CheckThr = new JCheckBox("three");
        CheckThr.setBackground(Color.ORANGE);
        add(label);
        add(Field);
        add(fourButton);
        add(CheckOne);
        add(CheckTwo);
        add(CheckThr);

        }

    class groupFourL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String curr = Field.getText();
            if (curr.equals(CheckOne.getText())) {
                if (CheckOne.isSelected()) CheckOne.setSelected(false);
                else CheckOne.setSelected(true);
            } else if (curr.equals(CheckTwo.getText())) {
                if (CheckTwo.isSelected()) CheckTwo.setSelected(false);
                else CheckTwo.setSelected(true);
            } else if (curr.equals(CheckThr.getText())) {
                if (CheckThr.isSelected()) CheckThr.setSelected(false);
                else CheckThr.setSelected(true);
            } else {
                JOptionPane.showMessageDialog(null, "Doesn't exist","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
