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
public class ImplementMakeCoffe extends MakeCoffe{
    
    public ImplementMakeCoffe(CoffeType coffeType, CoffeInterface conffeIntefrace
            , String suggar)
    {
        super(coffeType, conffeIntefrace, suggar);
    }
    
    
    
    public void make()
    {
        conffeIntefrace.make();
    }
}
