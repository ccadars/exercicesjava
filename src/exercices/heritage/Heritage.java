/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage;

import exercices.core.Application;
import exercices.heritage.animaux.entities.Animal;
import exercices.heritage.animaux.entities.impl.Chat;
import exercices.heritage.animaux.entities.impl.Chien;
import exercices.heritage.meubles.entities.Meuble;
import exercices.heritage.meubles.entities.impl.Table;

/**
 *
 * @author lunel10
 */
public class Heritage extends Application{

    @Override
    public void start() {
        Animal chien = new Chien();
        Animal chat = new Chat();
        chien.emettreSon();
        chat.emettreSon();
        Meuble table = new Table();
        table.getNom();
        Tripoteur Francois = new Tripoteur();
        Francois.tripote(chat);
        chat.emettreSon();
    }

    @Override
    public void create() {
    }
}
