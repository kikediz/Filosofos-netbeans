/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author morte
 */
public class Filosofos_GUI extends JFrame {

        
        JFrame frame;
        JPanel jPanel;
        JTextField field;
        JButton button,button1;
        
        Imagen image;

    public Filosofos_GUI() {
        super("Cena de filosofos");
        image=new Imagen();
        image.setImage("/home/morte/NetBeansProjects/Filosofos/src/imagen/filo.png");
        jPanel = new JPanel();
        field = new JTextField();
        field.setSize(100, 20);
        button = button1 = new JButton();
        this.toBack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void construir(){
        //getContentPane().add(paintComponent(null));
        //setBounds(100, 100, 600, 400);
        setSize(800, 700);
        setVisible(true);
        this.setLayout(null);
        setLocationRelativeTo(null);
        //jPanel.setSize(100, 20);
        //jPanel.add(button);
        //jPanel.setLocation((int)(getContentPane().getSize().height*0.1), (int)(getContentPane().getSize().width*0.5));
        //button.setSize(500, 200);
        //button.setBounds(100, 200, 100, 20);
        //button1.setBounds(300, 200, 100, 20);
        this.setContentPane(image);
        button.setBounds(100, 200, 100, 200);
        this.add(button);
        //this.add(button1);
        //paint(this.getGraphics());
        //repaint();
    }
}