/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import bridge.ENUMS.CoffeType;
import bridge.options.Making;
import bridge.options.NoBeans;
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
        choices.setCoffeCount(100);
        int choice;
        while(true)
        {   
            System.out.print("Choose your coffe type:"
                        + "\n1: esspresso"
                        + "\n2: latte"
                        + "\n3: americano"
                        + "\n4: with ice"
                        + "\n0: add coffe"
                        + "\nYour choice: ");
            choice = in.nextInt();        
            if(choice==0)
                choices.addCoffe(choices.getCoffeCount());
            else
                makeCoffe1.setCoffeType(choices.ChooseType(choice));

            if(makeCoffe1.getCoffeType()!=null)
            {
                System.out.print("Choose your sugar amount:"
                        + "\n1: one cube"
                        + "\n2: two cubes"
                        + "\n3: three cubes"
                        + "\n0: no cubes "
                        + "\nYour choice: ");
                choice = in.nextInt();            
                makeCoffe1.setSuggar(choices.HowMuchSugar(choice));
                
                choices.setCoffeCount(choices.useCoffe(makeCoffe1.getCoffeType()
                        , choices.getCoffeCount()));
                
                makeCoffe1.setConffeIntefrace(new Making());
                if(makeCoffe1.getSuggar()!=null)
                {
                    if (choices.getCoffeCount()<=0)
                    {
                        choices.setCoffeCount(0);
                        makeCoffe1.setCoffeMachine(CoffeType.error
                                , new NoBeans(), "Error");
                        makeCoffe1.make();
                        System.out.println(makeCoffe1.show() + "\n");
                    }
                    else
                    {
                        makeCoffe1.make();
                        System.out.println(makeCoffe1.show() + "\n"
                                + "amount left " + choices.getCoffeCount() + "\n");
                    }
                }
                else 
                    System.out.println("No such option");
            }
            else
                System.out.println("no such coffe type");            
        }
        
    }
    
}
