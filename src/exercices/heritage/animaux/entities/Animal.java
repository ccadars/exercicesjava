/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage.animaux.entities;

/**
 *
 * @author lunel10
 */
public abstract class Animal {
    public String son = "";
    public void emettreSon(){
            System.out.println("le " + this.getClass().getSimpleName() + " " + son);
}
}