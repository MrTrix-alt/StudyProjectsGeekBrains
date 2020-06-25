package ru.homework.lessonFour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.jar.JarOutputStream;

public class MyWindow extends JFrame {
    private final JTextField textField = new JTextField();
    private final JTextField textFieldTwo = new JTextField();

    public MyWindow() {
        setTitle("Action Window");
        setBounds(500, 500, 500, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout());

        GridLayout c = new GridLayout();
        textField.addActionListener(this::reactToAction);
        textField.addKeyListener(new CustomKeyListener());
        add(textField, c);

        JButton button = new JButton("Say");
        button.addActionListener(this::reactToAction);
        add(button, c);
        textFieldTwo.addActionListener(this::reactToAction);
        textFieldTwo.addKeyListener(new CustomKeyListener());
        add(textFieldTwo, c);

        setVisible(true);

    }

    private void reactToAction(ActionEvent event) {
        JOptionPane.showInputDialog(textField.getText(), textFieldTwo.getText());
    }

    private static class CustomKeyListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.print(e.getKeyChar());
        }
    }
}
