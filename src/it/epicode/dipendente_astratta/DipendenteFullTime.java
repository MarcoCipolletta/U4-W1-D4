package it.epicode.dipendente_astratta;

import it.epicode.dipendente.Dipartimento;

public class DipendenteFullTime extends Dipendente{

    public DipendenteFullTime(String matricola, Dipartimento dipartimento) {
        super(matricola,1500 ,dipartimento);

    }

    @Override
    public double calculateSalary() {
        return getStipendio() ;
    }

    @Override
    public String toString() {
        return "Matricola: " + getMatricola() + "; Sezione: " + getDipartimento() + "; Paga: " + calculateSalary();
    }
}
