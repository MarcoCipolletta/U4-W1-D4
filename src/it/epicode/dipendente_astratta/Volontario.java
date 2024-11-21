package it.epicode.dipendente_astratta;

public class Volontario implements IPersona {
    private String nome;
    private int eta;
    private String CV;

    public Volontario(String nome, int eta, String CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println(nome + " entrerà alle ore 15:00");
    }
}
