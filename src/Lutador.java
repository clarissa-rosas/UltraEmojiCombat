public class Lutador {

    //Atributos

    private String nome;
    private String pais;
    private int idade;
    private double peso;
    private double altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso <= 52.2) {
            categoria = "inválido";
        } else if (peso <= 70.3) {
            categoria = "leve";
        } else if (peso <= 83.9) {
            categoria = "médio";
        } else if (peso <= 120.2) {
            categoria = "pesado";
        } else {
            categoria = "inválido";
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

        public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    //Métodos principais


    public Lutador(String nome, String nacionalidade, int idade, double peso, double altura, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.pais = nacionalidade;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;

        setCategoria();
    }

    public void apresentar() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("CHEGOU A HORA!!! Apresentamos o lutador " + getNome() + ", de " + getPais() + ",");
        System.out.println(getIdade() + " anos, " + getAltura() + " m de altura e " + getPeso() + " kg, peso " + getCategoria() + ",");
        System.out.println("com " + getVitorias() + " vitórias, " + getDerrotas() + " derrotas e " + getEmpates() + " empates!");
    }

    public void status() {
        System.out.println("------------------------------------------------------------------");
        System.out.println(getNome() + " é um peso " + getCategoria() + " com " + getVitorias() + " vitórias, "
                + getDerrotas() + " derrotas e " + getEmpates() + " empates.");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
}
