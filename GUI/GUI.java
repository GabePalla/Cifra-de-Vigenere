package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Locale;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
public class GUI extends JFrame{

    GUI() {
        JToolBar toolbar = new JToolBar();
        JPanel panelToolBar = new JPanel();

        JButton encrypt = new JButton("Encrypt");
        JButton decrypt = new JButton("Decrypt");

        panelToolBar.add(encrypt);
        panelToolBar.add(decrypt);

        toolbar.add(panelToolBar);
        toolbar.setFloatable(false);
        
        JTextArea inputField = new JTextArea();
        inputField.setBounds(16, 50, 950, 150);
        inputField.setBackground(new Color(217, 217, 217));

        JTextArea outputField = new JTextArea();
        outputField.setBounds(16, 300, 950, 150);
        outputField.setBackground(new Color(217, 217, 217));
        outputField.setEditable(false);

        JButton b = new JButton("Click");
        b.setBounds(860,497,110,50);
        
        JLabel inputLabel = new JLabel("INPUT");
        inputLabel.setBounds(16, 30, 50, 100);

        JLabel outputLabel = new JLabel("OUTPUT");
        outputLabel.setBounds(16, 280, 50, 100);

        
        add(b); add(outputLabel); add(inputLabel); add(outputField); add(inputField); add(toolbar); 

        setTitle("Vegenere Cipher");
        setSize(1000, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
}
