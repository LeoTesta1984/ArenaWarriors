/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warriorsarena;


import forms.MenuForm;
import forms.WarArForm;


/**
 *
 * @author Casa
 */
public class WarriorsArena {
    //private static Object map[][];

    public static void main(String[] args) {
       
        //Map is created (where Warriors will be placed):
        //map = new Object[6][6];
        
        //Game starts:
        Game game = new Game();
                
        //Game turn is set to 0:
        game.setTurn(0);
        
        //A new Menu of the game is initialized:
        new MenuForm().setVisible(true);
        
        
        

    }
    
    
    
    
}
