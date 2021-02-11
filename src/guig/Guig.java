package guig;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Guig implements ActionListener {
int count=0;
JLabel label;
    public Guig(){
        JFrame frame=new JFrame();
        JButton btn =new JButton("click me");
        btn.addActionListener(this);
        label=new JLabel("NUMBER OF CLICKS:  "+count);
        label.setForeground(Color.red);
        JPanel panel=new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 100));
       panel.setLayout(new GridLayout(0,1));
       frame.add(panel,BorderLayout.CENTER);
       panel.add(btn);
       panel.add(label);
       frame.setVisible(true);
       frame.pack();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("memo");
      panel.setBackground(Color.BLACK);
       
     
       
       
       
    }
    public static void main(String[] args) {
       
        new Guig();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    count++;   
    label.setText("NUMBER OF CLICKS:  "+"\n"+count);
    
    }
    
}
