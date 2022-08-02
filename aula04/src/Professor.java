import java.util.Scanner;

public class Professor {
    private String nome;
    private int matricula;
    private int idade;
    private String naturalidade;
    private String formacao;
    private Disciplina disciplina;

    Scanner ler = new Scanner(System.in);

    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void mostrarDetalhes(){
        System.out.println("\nInformações do professor: \n");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Idade: " + idade);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Formação: " + formacao + "\n");
    }

    public void apresentarAtestado(){

        System.out.print("Quantos dias de atestado? ");
        int opc = ler.nextInt();

        System.out.println("\nO atestado do professor " + nome + " apresentado com sucesso! O atestado foi estabelecido de " + opc + " dias");

    }

    public void aplicadorProva(){
        System.out.print("Quem aplicou a prova na turma (PROFESSOR - 1) (SUBSTITUTO - 2)? ");
        int opc = ler.nextInt();

        if (opc == 1){
            System.out.println("A prova foi aplicada pelo professor " + nome);
        } else {
            System.out.print("Nome do substituto: ");
            String nome_substituto = ler.next();

            System.out.println("A prova foi aplicada pelo substituto " + nome_substituto + " a comando do professor " + nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }
}
