/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsclient.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author chiarotti
 */
public class ClientEduardo{
    private JFrame frame;
    JPanel mainPanel;
    private JButton executeAction;
    private JTextField correntistBox;
    private JTextField balanceBox;
    private wseduardo.WSEduardo ws;
    JComboBox<String> actions;
    
    public ClientEduardo(){
        this.ws = new wseduardo.WSEduardo();
        this.frame = new JFrame("WebService");
        this.correntistBox = new JTextField();
        this.balanceBox = new JTextField();
        this.executeAction = new JButton("Executar");
        this.executeAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                            switch(actions.getSelectedIndex()){
                                case 1:
                                    ws.getWSEduardoSoap().ted(correntistBox.getText(),Double.parseDouble(balanceBox.getText()));
                                break;
                                
                                case 2:
                                    wseduardo.ObjectC correntista = ws.getWSEduardoSoap().correntista(correntistBox.getText());
                                    JOptionPane.showMessageDialog(null, correntista.getNome());
                                break;
                            }
                        }
        });
        mainPanel = new JPanel();
        
        String actionsList[] = {"Selecione uma operação","TED","Obter Correntista"};
        this.actions = new JComboBox<String>(actionsList);
        actions.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               switch(actions.getSelectedIndex()){
                       case 1:
                           mainPanel.removeAll();
                           mainPanel.add(actions);
                           
                           mainPanel.setLayout(new GridLayout(3,1));
                           JPanel tedPanel = new JPanel();
                           tedPanel.setLayout(new GridLayout(2,2));
                           
                           tedPanel.add(new JLabel("Correntista:"));
                           tedPanel.add(correntistBox);
                           
                           tedPanel.add(new JLabel("Valor:"));
                           tedPanel.add(balanceBox);
                           
                           mainPanel.add(tedPanel);
                           mainPanel.add(executeAction);
                           tedPanel.setBorder(new EmptyBorder(10,10,10,10));
                           frame.setSize(300,250);
                       break;
                       
                       case 2:
                           mainPanel.removeAll();
                           mainPanel.add(actions);
                           
                           mainPanel.setLayout(new GridLayout(3,1));
                           JPanel correntistPanel = new JPanel();
                           correntistPanel.setLayout(new GridLayout(1,2));
                           
                           correntistPanel.add(new JLabel("Correntista:"));
                           correntistPanel.add(correntistBox);
                           
                           mainPanel.add(correntistPanel);
                           mainPanel.add(executeAction);
                           correntistPanel.setBorder(new EmptyBorder(10,10,10,10));
                           frame.setSize(300,250);                           
                       break;
               }
               frame.validate();
               frame.repaint();
            }
                        
        });
        
        mainPanel.setLayout(new GridLayout(1,1));
        mainPanel.add(actions);
        
        this.frame.add(mainPanel);
        
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(300,100);
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args){
        new ClientEduardo();
    }
}
