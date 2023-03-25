/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

/**
 *
 * @author ht3015955
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaCadastro cadastro = new TelaCadastro();
//        cadastro.setVisible(true);;
        
        Frame f1 = new Frame();
        f1.add(cadastro);
        f1.setSize(400,350);
        f1.setVisible(true);
    }
    
}
