package it.epicode.dipendente_astratta;

import it.epicode.dipendente.Dipartimento;

public class DipendentePartTime extends Dipendente{
    public DipendentePartTime(String matricola, double oreLavorate) {
        super(matricola, oreLavorate * 11.86, Dipartimento.VENDITE);

    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }

    @Override
    public String toString() {
        return "Matricola: " + getMatricola() + "; Sezione: " + getDipartimento() + "; Paga: " + calculateSalary();
    }
}
