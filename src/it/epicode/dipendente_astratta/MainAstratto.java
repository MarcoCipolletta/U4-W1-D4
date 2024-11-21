package it.epicode.dipendente_astratta;

import it.epicode.dipendente.Dipartimento;

import java.util.ArrayList;

public class MainAstratto {



    public static void main(String[] args) {
    Dipendente d1 = new DipendenteFullTime("Mario", Dipartimento.VENDITE);
    Dipendente d2 = new DipendenteFullTime("Franco", Dipartimento.PRODUZIIONE);
    Dipendente d3 = new DipendentePartTime("Ernesto", 123);
    Dipendente d4 = new DipendentePartTime("Carla", 37);
    Dipendente d5 = new DipendentePartTime("Erica", 66);
    Dipendente d6 = new Dirigente("Erica", 2000,450);
    Volontario v1 = new Volontario("Marco", 22,"AAAAAA");
    Volontario v2 = new Volontario("Carla", 40,"BBBBBB");
    Volontario v3 = new Volontario("Lara", 20,"DDDDDD");
    ArrayList<Dipendente> dipendenti = new ArrayList<>();
        dipendenti.add(d1);
        dipendenti.add(d2);
        dipendenti.add(d3);
        dipendenti.add(d4);
        dipendenti.add(d5);
        dipendenti.add(d6);

        ArrayList<IPersona> tutti = new ArrayList<>();
        tutti.add(d1);
        tutti.add(v1);
        tutti.add(v2);
        tutti.add(d2);
        tutti.add(d3);
        tutti.add(d4);
        tutti.add(d5);
        tutti.add(v3);
        tutti.add(d6);

        for (int i = 0; i < dipendenti.size(); i++) {
            Dipendente current = dipendenti.get(i);
            System.out.println(current);
        }

        for (int i = 0; i < tutti.size(); i++) {
            IPersona persona = tutti.get(i);
            persona.checkIn();
        }
    }

}
