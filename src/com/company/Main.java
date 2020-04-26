package com.company;

import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        super("myLab");
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(new GroupOne());
        container.add(new GroupTwo());
        container.add(new GroupThree());
        container.add(new GroupFour());
        container.add(new GroupFive());
        container.add(new GroupSix());
        add(container);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Main fdf = new Main();
    }

}
