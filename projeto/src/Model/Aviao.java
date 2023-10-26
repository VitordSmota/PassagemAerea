package Model;

public class Aviao {
    public Passageiro[][] lugares;

    public Aviao(String nome, int x, int y) {

    }
    public Passageiro getPassageiro(int x, int y){
        return lugares[x][y];
    }
    public boolean verificaLugarOcupado(int x, int y){

        return false;
    }
    public void setPassageiro(int x, int y, Passageiro passageiro){

    }
}
