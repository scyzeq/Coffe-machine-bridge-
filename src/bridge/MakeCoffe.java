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
public abstract class MakeCoffe {
    protected CoffeInterface conffeIntefrace;
    protected CoffeType coffeType;
    protected String suggar;
//    protected int coffeCount;
    
    public MakeCoffe(CoffeType coffeType, CoffeInterface conffeIntefrace
            , String suggar)
    {
        this.coffeType = coffeType;
        this.conffeIntefrace = conffeIntefrace;
        this.suggar = suggar;
    }
    public MakeCoffe(){}
    
    public void setCoffeType(CoffeType coffeType) {
        this.coffeType = coffeType;
    }

    public void setConffeIntefrace(CoffeInterface conffeIntefrace) {
        this.conffeIntefrace = conffeIntefrace;
    }

    public String getSuggar() {
        return suggar;
    }
    
    public void setSuggar(String suggar) {
        this.suggar = suggar;
    }

    public CoffeType getCoffeType() {
        return coffeType;
    }
    
    public String show()
    {
        return coffeType + " " + suggar;
    }
    
    public abstract void make();
}
