
import java.awt.*;

import java.awt.event.*;


import javax.swing.*;



public class juego extends JFrame implements ActionListener{


private JLabel texto;

public juego(){


setLayout(null);


texto=new JLabel("Hola");



texto.setBounds(10,10,100,30);

add(texto);


}


public void actionPerformed(ActionEvent s){



}

public static void main(String[]args){

juego uno=new juego(){

uno.setSize(500,500);


uno.setTitle("esto es una practica de java");

uno.setResizable(false);

uno.setLocationRelativeTo(null);


uno.setVisible(true);

uno.setDefaultCloseOperation(EXIT_ON_CLOSE);





}





}

}





