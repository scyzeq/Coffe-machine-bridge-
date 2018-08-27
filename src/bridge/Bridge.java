/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import bridge.options.Making;
import java.util.Scanner;

/**
 *
 * @author AJuda
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Choices choices = new Choices();
        MakeCoffe makeCoffe1 = new ImplementMakeCoffe(CoffeType.error
                , new Making(), "Error");
        Scanner in = new Scanner(System.in);
        int choice;
        int coffeLeft = 100;
        while(true)
        {
            System.out.println("Choose your coffe type:"
                    + "\n1: esspresso"
                    + "\n2: latte"
                    + "\n3: americano"
                    + "\n4: with ice");
            choice = in.nextInt();        
            makeCoffe1.setCoffeType(choices.ChooseType(choice));

            if(makeCoffe1.getCoffeType()!=null)
            {
                System.out.println("Choose your sugar amount:"
                    + "\n1: one cube"
                    + "\n2: two cubes"
                    + "\n3: three cubes"
                    + "\n0: no cubes");
                choice = in.nextInt();            
                makeCoffe1.setSuggar(choices.HowMuchSugar(choice));
                
                coffeLeft = choices.useCoffe(makeCoffe1.getCoffeType(), coffeLeft);
                
                makeCoffe1.setConffeIntefrace(new Making());
                if(makeCoffe1.getSuggar()!=null)
                {
                    makeCoffe1.make();
                    System.out.println(makeCoffe1.show() + "\n");
                }
                else 
                    System.out.println("No such option");
            }
            else
                System.out.println("no such coffe type");            
        }
        
    }
    
}
