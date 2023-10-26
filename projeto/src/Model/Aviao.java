package Model;

public class Aviao extends Aeronave{
    public Passageiro[][] lugares;

    public Aviao(String modelo, int fileiras, int assentos){
        super(modelo);
        this.lugares = new Passageiro[fileiras][assentos];
    }
    public Passageiro getPassageiro(int x, int y){
        return lugares[x][y];
    }
    public boolean verificaLugarOcupado(int fileira, int assento){

        return this.lugares[fileira][assento] != null;
    }
    public void setPassageiro(int fileira, int assento, Passageiro passageiro){
        this.lugares[fileira][assento] = passageiro;
    }

    @Override
    public String toString() {
        return this.modelo;
    }
}
