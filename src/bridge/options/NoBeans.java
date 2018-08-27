/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.options;

import bridge.CoffeInterface;

/**
 *
 * @author AJuda
 */
public class NoBeans implements CoffeInterface{
    public void make()
    {
        System.out.println("No more coffe beans add more");
    }
}
