package CorsaCavalliGrafica;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Grafica extends JFrame implements ActionListener
{
    private Container c = new Container();
    private JPanel pannello = new JPanel();
    private JLabel titolo = new JLabel("Inserire Numero Di Cavalli Da Gareggiare.");
    private JTextField inserimentoCavalli = new JTextField();
    private JButton bottoneInserisciCorsie = new JButton("RUN");
    
    public Grafica()
    {
        c = this.getContentPane();
        pannello.setLayout(null);
        this.setVisible(true);
        this.setTitle("Input Cavalli"); 
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setResizable(false);
        
        titolo.setBounds(30, 30, 300, 20);
        inserimentoCavalli.setBounds(80, 60, 20, 20);
        bottoneInserisciCorsie.setBounds(110, 60, 90, 20);
        
        pannello.add(titolo);
        pannello.add(inserimentoCavalli);
        pannello.add(bottoneInserisciCorsie);
        
        c.add(pannello);
        
        bottoneInserisciCorsie.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String evento = e.getActionCommand();
        int cavalliInseriti = 0;
        
        switch(evento)
        {
            case "RUN":
                cavalliInseriti = Integer.valueOf(inserimentoCavalli.getText());
                inserimentoCavalli.setText("");
                FrameStampa.traguardo = 100000;
                
                FrameStampa fs = new FrameStampa(Integer.valueOf(cavalliInseriti)); 
                break;        
        }
    }
}


