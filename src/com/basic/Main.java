package com.basic;

import javax.swing.*;

public class Main extends JFrame
{
    final JLabel label1 = new JLabel("Text");
    final JLabel label2 = new JLabel("Text");

    public Main()
    {
        super("JavaPrograms");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.add(label1);
        pane.add(label2);
        label1.setText("★ In this build there are various Java programs");
        label2.setText(" organized by package. Make good use of it !");
        add(pane);
        setVisible(true);
    }
    
    public static void setLookAndFell()
    {
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }

        catch (Exception exc)
        {
            // Ignore error.
        }
    }
    
    public static void main(String[] args)
    {
        setLookAndFell();
        @SuppressWarnings("unused")
        Main main = new Main();
    }
}
