/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.recursivite.suites.entier;

import exercices.core.Application;
import exercices.recursivite.suites.interfaces.RecursiviteInterface;

/**
 *
 * @author lunel10
 */
public class SuiteEntier extends Application implements RecursiviteInterface {

    @Override
    public void start() {
       //appelle la suite et l'initialise a 0
        suite(0);
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //initialise la valeur max a 300
    public int max = 300;
    @Override
    public int suite(int n) {
        //desincremente la valeur max
        max--;
        //affiche la valeur n
        System.out.println(n);
        //si la valeur max est sup a 0
        if (max > 0){
            //la valeur n prend 1
            suite(n+1);
        }
        //sinon affiche 0
        return 0;
    }
    
}
