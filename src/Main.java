public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Emanuel");
        pessoa1.setCpf("123");
        pessoa1.setAnoNascimento(1992);
        pessoa1.setAltura(1.77);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.calcularIdade() + " anos.");
        System.out.println("\n\n\n");

        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado("João", "Augusto", 5000.0 );

        empregado1.setSalarioMensal(-100.0);
        System.out.println(empregado1.getSalarioMensal());
        System.out.println(empregado2.getSalarioMensal());

        empregado1.forneceAumento();
        empregado2.forneceAumento();

        System.out.println("Salário de " + empregado1.getNome() + "\nR$" + empregado1.getSalarioMensal());
        System.out.println("Salário de " + empregado2.getNome() + "\nR$" + empregado2.getSalarioMensal());

    }
}
