package ru.homework.lessonOne.GeekBrainsLessons.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyWindow extends JFrame {
    public MyWindow() {
            setTitle("Calculator");
            getContentPane().add(new CalculatorPanel());
        }
        public static void main(String[] args) {
            MyWindow frame = new MyWindow ();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(400,200,300,300);
            frame.setVisible(true);
        }
    }

class CalculatorPanel extends JPanel {
    private JLabel display;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;

    public CalculatorPanel() {
        setLayout(new BorderLayout());
        result = 0;
        lastCommand = "=";
        start = true;
        display = new JLabel("0");
        Dimension dim = new Dimension(300, 50);
        display.setPreferredSize(dim);
        add(display, BorderLayout.NORTH);
        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();
        ActionListener clear = new ClearAction();
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5));
        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);
        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);
        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);
        addButton("0", insert);
        addButton(".", insert);
        addButton("=", command);
        addButton("+", command);
        addButton("%", clear);
        addButton("C", clear);
        add(panel, BorderLayout.CENTER);
    }

    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }

    private class InsertAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }

    private class ClearAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display.setText("0");
        }
    }

    private class CommandAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                } else
                    lastCommand = command;
            } else {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }
        }
    }

    public void calculate(double x) {
        if (lastCommand.equals("+"))
            result += x;
        else if (lastCommand.equals("-"))
            result -= x;
        else if (lastCommand.equals("*"))
            result *= x;
        else if (lastCommand.equals("/"))
            result /= x;
        else if (lastCommand.equals("="))
            result = x;
        display.setText("" + result);
    }
}