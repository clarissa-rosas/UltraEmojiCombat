import java.util.Objects;
import java.util.Random;

public class Luta {

    //Atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos acessores

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    //Métodos principais

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
            System.out.println("------------------------------------------------------------------");
            System.out.println("A luta entre " + l1.getNome() + " e " + l2.getNome() + " está marcada!");
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("------------------------------------------------------------------");
            System.out.println("A luta entre " + l1.getNome() + " e " + l2.getNome() + " não pode ser marcada!");
        }
    }

    public void lutar(int numeroLuta) {
        if (this.aprovada) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("### A LUTA " + numeroLuta + " VAI COMEÇAR! ###");
            System.out.println("------------------------------------------------------------------");
            System.out.println("### DESAFIANTE ###");
            desafiado.apresentar();
            System.out.println("------------------------------------------------------------------");
            System.out.println("### DESAFIADO ###");
            desafiante.apresentar();

            var aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            switch (vencedor) {
                case 0: //Empate
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("### RESULTADO ###");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Tivemos um empate!");
                    break;

                case 1: //Vitória do desafiante
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("===== RESULTADO DA LUTA =====");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("O vencedor é " + desafiante.getNome() + "!");
                    break;

                case 2: //Vitória do desafiado
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("===== RESULTADO DA LUTA =====");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("O vencedor é " + desafiado.getNome() + "!");
                    break;
            }

        } else {
            System.out.println("------------------------------------------------------------------");
            System.out.println("*** AVISO: A luta " + numeroLuta + " não pôde ser marcada e está cancelada. ***");
        }
    }
}
