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
public class amountLeft {
    
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
