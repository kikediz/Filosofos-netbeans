/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos2;

/**
 *
 * @author morte
 */
public class Main {
    
    static Filosofos_GUI fgui;
    static Cena_filosofos cena_filosofos;
    Main(){
        fgui = new Filosofos_GUI();
        fgui.construir();
        cena_filosofos = new Cena_filosofos(fgui, true);
    }
    
    public static void main(String args[]) { 
        Thread thread = new Thread(
            new Runnable() {

                @Override
                public void run() {
                    new Main();
                }
            }
        );
        thread.start();
    }
    
}
