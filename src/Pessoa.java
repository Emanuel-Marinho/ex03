public class Pessoa {
    private String nome;
    private String cpf;
    private int anoNascimento;
    private double altura;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getaltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome + "\nCpf: " + this.cpf + "\nAno de nascimento: " + this.anoNascimento + "\nAltura: " + this.altura);
    }

    public int calcularIdade() {
        return 2024 - this.anoNascimento;
    }
}
