package GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import Cipher.Decrypting;
import Cipher.Encrypting;

public class GUI extends JFrame {

    private JButton actionButton;
    private JButton encrypt;
    private JButton decrypt;
    private JToolBar toolbar;
    private JPanel panelToolBar;
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JTextField key;
    private JLabel inputLabel;
    private JLabel outputLabel;
    private JLabel keyLabel;

    public GUI() {
        this.GUIDefaultInitializr();
        this.toolBarEncryptButtonAction();
        this.toolBarDecryptButtonAction();
    }

    private void GUIDefaultInitializr() {
        toolbar = new JToolBar();
        panelToolBar = new JPanel();

        this.encrypt = new JButton("Encrypt");
        this.encrypt.setBackground(new Color(176, 196, 222));
        decrypt = new JButton("Decrypt");
        this.decrypt.setBackground(new Color(248, 248, 255));

        panelToolBar.add(encrypt);
        panelToolBar.add(decrypt);

        toolbar.add(panelToolBar);
        toolbar.setFloatable(false);

        inputTextArea = new JTextArea();
        inputTextArea.setBounds(16, 50, 950, 150);
        inputTextArea.setBackground(new Color(255,250,250));

        outputTextArea = new JTextArea();
        outputTextArea.setBounds(16, 300, 950, 150);
        outputTextArea.setBackground(new Color(255,250,250));
        outputTextArea.setEditable(false);

        key = new JTextField();
        key.setBounds(16, 490, 250, 45);
        key.setBackground(new Color(255,250,250));

        actionButton = new JButton("Encrypt");
        actionButton.setBounds(855, 497, 110, 50);
        actionButton.setBackground(new Color(248, 248, 255));

        inputLabel = new JLabel("INPUT:");
        inputLabel.setBounds(20, -10, 50, 100);

        outputLabel = new JLabel("OUTPUT:");
        outputLabel.setBounds(20, 240, 50, 100);

        keyLabel = new JLabel("KEY:");
        keyLabel.setBounds(20, 430, 50, 100);

        add(actionButton);
        add(outputLabel);
        add(inputLabel);
        add(keyLabel);
        add(outputTextArea);
        add(inputTextArea);
        add(key);
        add(toolbar);

        setTitle("Vigenère cipher");
        setSize(1000, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void toolBarEncryptButtonAction() {
        this.encrypt.addActionListener(action -> {
            this.actionButton.setText("Encrypt");
            this.encrypt.setBackground(new Color(176, 196, 222));
            this.decrypt.setBackground(new Color(248, 248, 255));
        });
    }

    private void toolBarDecryptButtonAction() {
        this.decrypt.addActionListener(action -> {
            this.actionButton.setText("Decrypt");
            this.decrypt.setBackground(new Color(176, 196, 222));
            this.encrypt.setBackground(new Color(248, 248, 255));
        });
    }

    public void actionButton(Encrypting encrypt, Decrypting decrypt) {
        this.actionButton.addActionListener(action -> {
            if (this.actionButton.getText().equalsIgnoreCase("Encrypt")) {
                encrypt.setData(this.inputTextArea.getText(), key.getText());
                outputTextArea.setText(encrypt.encrypting());
            } else {
                decrypt.setData(this.inputTextArea.getText(), key.getText());
                outputTextArea.setText(decrypt.decrypting());
            }
        });
    }

    public JTextArea getInputTextArea() {
        return inputTextArea;
    }

    public void setInputTextArea(JTextArea inputTextArea) {
        this.inputTextArea = inputTextArea;
    }

    public JTextArea getOutputTextArea() {
        return outputTextArea;
    }

    public void setOutputTextArea(JTextArea outputTextArea) {
        this.outputTextArea = outputTextArea;
    }
}
