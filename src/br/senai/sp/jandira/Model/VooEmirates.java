package br.senai.sp.jandira.Model;

import java.util.Date;


    public class VooEmirates extends Voo {
        private int capacidadePassageiros = 80;

        public VooEmirates(String numeroVoo, String origem, String destino, String dataPartida, String horaPartida, int capacidadePassageiros) {
            super("BB-8", "Congonhas", "Qatar", "12-09-2023", "12h47");
            this.capacidadePassageiros = capacidadePassageiros;
        }

        public int getCapacidadePassageiros() {
            return capacidadePassageiros;
        }

        public void setCapacidadePassageiros(int capacidadePassageiros) {
            this.capacidadePassageiros = capacidadePassageiros;
        }
}
