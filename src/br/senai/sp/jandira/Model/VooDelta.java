package br.senai.sp.jandira.Model;


    public class VooDelta extends Voo {
        private int capacidadePassageiros = 102;

        public VooDelta(String numeroVoo, String origem, String destino, String dataPartida, String horaPartida, int capacidadePassageiros) {
            super("R2D2", "Guarulhos", "Paris", "17-11-2023", "08h00");
            this.capacidadePassageiros = capacidadePassageiros;
        }

        public int getCapacidadePassageiros() {
            return capacidadePassageiros;
        }

        public void setCapacidadePassageiros(int capacidadePassageiros) {
            this.capacidadePassageiros = capacidadePassageiros;
        }
    }

