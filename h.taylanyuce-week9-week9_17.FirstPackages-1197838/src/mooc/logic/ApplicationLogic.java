/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author root
 */
public class ApplicationLogic {

    private UserInterface uu ;
    
    public ApplicationLogic(UserInterface ui) {
        uu = ui;
    }
    public void execute(int howManyTimes)
    {
        while(howManyTimes-- > 0)
        {
            System.out.println("The application logic works");
            uu.update();
    }
    
    }
}
