package it.epicode.dipendente_astratta;

import it.epicode.dipendente.Dipartimento;

public class Dirigente extends Dipendente{
    private double bonus;
    public Dirigente(String matricola, double stipendio, double bonus) {
        super(matricola, stipendio, Dipartimento.AMMINISTRAZIONE);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getStipendio() + bonus;
    }

    @Override
    public String toString() {
        return "Matricola: " + getMatricola() + "; Sezione: " + getDipartimento() + "; Paga: " + calculateSalary();
    }
}
