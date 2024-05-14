/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafe;

import static cafe.DB.insertUser;
import static cafe.Splash.bar;
import static cafe.Splash.loading;

/**
 *
 * @author HP
 */
public class Cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Splash s = new Splash();
        s.setVisible(true);
        try {
            for(int i =0 ; i<=100 ; i++){
                bar.setValue(i);
                loading.setText(i + "%");
                Login l = new Login();
                if(i == 100){
                s.dispose();
                l.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
         
    }
    
}
