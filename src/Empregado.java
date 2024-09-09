public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado() {
        this.nome = "Não consta";
        this.sobrenome = "Não consta";
        this.salarioMensal = 0.0;
    }

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(double salario) {
        if(salario < 0 ) {
            this.salarioMensal = 0.0;
            System.out.println("Não pode salário negativo");
        } else {
            this.salarioMensal = salario;

        }
    }

    public void forneceAumento() {
        this.salarioMensal += this.salarioMensal * 0.10;
        System.out.println("Aumento atribuído com sucesso!");
    }


}
