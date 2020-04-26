package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GroupThree extends JPanel {
    private JTextField Field;
    private JRadioButton RadOne;
    private JRadioButton RadTwo;
    private JRadioButton RadThree;

    public GroupThree() {
        super(new GridLayout(0, 6));
        setBackground(Color.MAGENTA);
        Field = new JTextField(12);
        JLabel label = new JLabel("Group Three");
        JButton threeButton = new JButton("Check");
        RadOne = new JRadioButton("yes");
        RadOne.setBackground(Color.MAGENTA);
        RadTwo = new JRadioButton("no");
        RadTwo.setBackground(Color.MAGENTA);
        RadThree = new JRadioButton("maybe");
        RadThree.setBackground(Color.MAGENTA);

        add(Field);
        add(threeButton);
        ButtonGroup radios = new ButtonGroup();
        radios.add(RadOne);
        radios.add(RadTwo);
        radios.add(RadThree);
        add(RadOne);
        add(RadTwo);
        add(RadThree);
        add(label);
        threeButton.addActionListener(new groupThreeL());
    }

    class groupThreeL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String curr = Field.getText();
            if (curr.equals(RadOne.getText())) {
                RadOne.setSelected(true);
            } else if (curr.equals(RadTwo.getText())) {
                RadTwo.setSelected(true);
            } else if (curr.equals(RadThree.getText())) {
                RadThree.setSelected(true);
            } else {
                JOptionPane.showMessageDialog(null, "Doesn't exist","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
