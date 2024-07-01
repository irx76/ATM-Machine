/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj;
import java.util.logging.Level;
import java.util.logging.Logger;
import proj.LOCALE;
import proj.Login;


/**
 *
 * @author irosh
 */
public class Newnew {
    public static void main(String[] args) {
        
        Progressbar pb=new Progressbar();
        pb.setVisible(true);
        Login lg=new Login();
        LOCALE ll=new LOCALE();
        
        for(int i=1;i<=100; ++i ){
            try {
                Thread.sleep(15);
                pb.jProgressBar1.setValue(i);
                
                if(i==100){
                    pb.dispose();
                    ll.setVisible(true);
                    
                    
                }
                
                
                
            } catch (Exception e) {
                Logger.getLogger(Newnew.class.getName()).log(Level.SEVERE,null,e);
            }
        }
    }
}
