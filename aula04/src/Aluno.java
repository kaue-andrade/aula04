import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;
    private String turma;
    private Prova prova;

    Scanner ler = new Scanner(System.in);

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void mostrarDetalhes(){
        System.out.println("\nInformações do aluno: \n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Turma: " + turma);
    }

    public void presencaAluno(){
        System.out.print("O aluno " + nome + "está presente na aula (SIM - 1) (NÃO - 2)? ");
        int opc = ler.nextInt();

        if (opc == 2){
            System.out.println("1 falta contabilizada para o aluno" + nome);
        }
    }

    public void atestadoAluno(){
        System.out.print("\nO aluno apresentou atestado? (SIM - 1) (NÃO - 2)? ");
        int opc = ler.nextInt();

        if (opc == 1){

            System.out.print("\nData de falta: ");
            String data = ler.next();

            System.out.println("\nA falta do dia " + data + " foi justificada com sucesso!");
        } else{
            System.out.println("\nA falta não foi justificada! ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }
}
