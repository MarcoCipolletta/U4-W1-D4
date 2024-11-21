package it.epicode.dipendente;

import java.util.ArrayList;

public class DipendenteMain {
    public static void main(String[] args) {
        Dipendente mario = new Dipendente("al3vs", 1600,Dipartimento.VENDITE);
        Dipendente luigi = new Dipendente("mr4s2", 2000,Dipartimento.AMMINISTRAZIONE);
        Dipendente andrea = new Dipendente("ae2rt", 1100,Dipartimento.PRODUZIIONE);

        ArrayList<Dipendente> dipendenti = new ArrayList<>();
        dipendenti.add(mario);
        dipendenti.add(luigi);
        dipendenti.add(andrea);

        for (int i = 0; i < dipendenti.size(); i++) {
            Dipendente dipendente = dipendenti.get(i);
            System.out.println("Dipendente: " +  dipendente.getMatricola());

        }
    }
}
