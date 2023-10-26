package br.com.ifsp.edu.model;

public class Voo {
    private Aviao aeronave;
    private int id;
    private String data;
    private String hora;

    public Voo(Aviao aeronave, int id, String data, String hora) {
        this.aeronave = aeronave;
        this.id = id;
        this.data = data;
        this.hora = hora;
    }

    public Aviao getAeronave() {
        return aeronave;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }
}
