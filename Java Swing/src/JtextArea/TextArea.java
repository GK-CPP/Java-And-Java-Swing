package JtextArea;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JTextArea;

public class TextArea extends JFrame{
    
    private Container c;
    private Font t;
    private JMenu b,b1,b2;
    private JTextArea tf;

    TextArea() {
        method();
    }

    public void method() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        t = new Font("Arobic", Font.BOLD + Font.ITALIC, 16);

        tf = new JTextArea();
        tf.setBackground(Color.LIGHT_GRAY);
        tf.setBounds(5,55,450,300);
        tf.setFont(t);
        tf.setLineWrap(true);
        tf.setWrapStyleWord(true);
        tf.setToolTipText("Enter Your Text");
        tf.setForeground(Color.BLACK);
        c.add(tf);

        b = new JMenu("File");
        b.setFont(t);
        b.setBackground(Color.gray);
        b.setForeground(Color.BLACK);
        b.setBounds(5,5,55,25);
        c.add(b);
        b1 = new JMenu("Edit");
        b1.setFont(t);
        b1.setBackground(Color.gray);
        b1.setForeground(Color.BLACK);
        b1.setBounds(65,5,50,25);
        c.add(b1);
        b2 = new JMenu("Help");
        b2.setFont(t);
        b2.setBackground(Color.gray);
        b2.setForeground(Color.BLACK);
        b2.setBounds(120,5,60,25);
        c.add(b2);

    }

    public static void main(String[] args) {
        TextArea f = new TextArea();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10, 20, 500, 400);
        f.setTitle("Text Viewer");
        f.setResizable(false);

    }
}