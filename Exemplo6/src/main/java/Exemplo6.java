/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

//nesses botões foram usados imagens
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Exemplo6 extends JFrame {
   JButton botao1, botao2, botao3;  
   ImageIcon icone1, icone2, icone3;
   public Exemplo6 (){
   super ("Exemplo com JButton");
   Container tela = getContentPane();
   setLayout(null);
    //colocando imagem no botao
    icone1 = new ImageIcon("Dollar.gif");
    botao1 = new JButton ("Novo", icone1);
    botao1.setBounds(50, 20, 100, 20);
    icone2 = new ImageIcon("Eject.gif");
    botao2 = new JButton ("Abrir", icone2);
    botao2.setBounds(50, 60, 100, 20);
    icone3 = new ImageIcon("E-mail.gif");
    botao3 = new JButton (icone3);
    botao3.setBounds(50, 100, 100, 20);
    //colocando cor no botao
    botao1.setBackground(Color.yellow);
    botao2.setBackground(Color.red);
    botao3.setBackground(Color.green);
    //marcando a primeira inicial da palavra
    botao1.setMnemonic(KeyEvent.VK_N);
    botao2.setMnemonic(KeyEvent.VK_A);
    botao3.setMnemonic(KeyEvent.VK_X);
    //adicionando cor nas palavras 
    botao1.setForeground(Color.black);
    botao2.setForeground(Color.black);
    botao3.setForeground(Color.black);
    
    //adiocionar na tela
    tela.add(botao1);
    tela.add(botao2);
    tela.add(botao3);
    
    setSize(200, 200);
    setVisible(true);
    setLocationRelativeTo(null);
}
    public static void main(String args[]){
    Exemplo6 app = new  Exemplo6();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}