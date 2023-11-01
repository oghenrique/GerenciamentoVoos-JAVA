package br.senai.sp.jandira.Model;


public class VooAzul extends Voo {
    private int capacidadePassageiros = 34;

    public VooAzul(String numeroVoo, String origem, String destino, String dataPartida, String horaPartida, int capacidadePassageiros) {
        super("C3PO", "São Paulo", "Natal", "23-10-2023", "15h00");
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}


