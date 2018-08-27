/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author AJuda
 */
public class Choices {
    
    public CoffeType ChooseType(int choice)
    {
        
        switch (choice) {
            case 1:
                return CoffeType.esspresso;
            case 2:
                return CoffeType.latte;
            case 3:
                return CoffeType.americano;
            case 4:
                return CoffeType.iced;
            default:
                return null;
        } 
    }
    
    public String HowMuchSugar(int choice)
    {   
        System.out.println("Choose your coffe type:"
                + "\n1: esspresso"
                + "\n2: latte"
                + "\n3: americano"
                + "\n4: with ice");
        
        switch (choice) {
            case 1:
                return "one cube";
            case 2:
                return "two cubes";
            case 3:
                return "three cubes";
            case 0:
                return "no cubes";
            default:
                return null;
        } 
    }
    
     public int useCoffe(CoffeType coffeUsed, int coffeCount)
    {     
        if(CoffeType.americano.equals(coffeUsed))
            return coffeCount - 10;
        if(CoffeType.esspresso.equals(coffeUsed))
            return coffeCount - 15;
        if(CoffeType.latte.equals(coffeUsed))
            return coffeCount - 5;
        if(CoffeType.iced.equals(coffeUsed))
            return coffeCount - 7;
        return 0;
    }
}
