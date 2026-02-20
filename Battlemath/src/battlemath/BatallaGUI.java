/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battlemath;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Administrator
 */
public class BatallaGUI extends JFrame {
    
    private JTextField txtNumero;
    private JButton btnAtacar;
    private JButton btnGolpe;
    private JLabel lblResultado;
    private Mago miMago;
    private Guerrero miGuerrero;
    
    public BatallaGUI(){
        miMago = new Mago("Gandalf");
        miGuerrero = new Guerrero("Guts");
        
        txtNumero = new JTextField(10);
        btnAtacar = new JButton("Lanzar Hechizo");
        btnGolpe = new JButton("Lanzar Golpe");
        lblResultado = new JLabel("Resultado: ");        

        
        btnAtacar.addActionListener(new ActionListener(){
     
            public void actionPerformed(ActionEvent e){
                //vapta de datos
                try{
                    int n = Integer.parseInt(txtNumero.getText());
                    String msg = miMago.realizarAccion(n);
                    lblResultado.setText(msg);
                } catch(NumberFormatException ex){
                    lblResultado.setText("ERROR: Ingresa un numero valido. ");
                }
            }
        });
        
        btnGolpe.addActionListener(new ActionListener(){
                
            public void actionPerformed(ActionEvent e){
                try{
                    int n = Integer.parseInt(txtNumero.getText());
                    String msg = miGuerrero.realizarAccion(n);
                    lblResultado.setText(msg);
                } catch(NumberFormatException ex){
                    lblResultado.setText("ERROR: Ingresa un numero valido.");
                }
            }
        });
        
        //añadir elementos al frame(simplificado);
        this.setLayout(new java.awt.FlowLayout());
        this.add(new JLabel("Nivel de poder:"));
        this.add(txtNumero);
        this.add(btnAtacar);
        this.add(btnGolpe);
        this.add(lblResultado);
        
       
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
     public static void main(String[] args) {
         new BatallaGUI();
     }

}
