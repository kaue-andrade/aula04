import java.util.Scanner;

public class Disciplina {
    private String nome;
    private int semestre;
    private int carga_horaria;
    private Professor professor;

    Scanner ler = new Scanner(System.in);

    public Disciplina(String nome, int semestre) {
        this.nome = nome;
        this.semestre = semestre;
    }

    public void mostrarDetalhes(){
        System.out.println("Informações da disciplina: ");
        System.out.println("Nome: " + nome);
        System.out.println("Semestre: " + semestre);
        System.out.println("Carga horária: " + carga_horaria + "\n");
    }

    public void todosConteudos(){
        System.out.print("\nTodos os assuntos foram aplicados na disciplina (SIM - 1) (NÃO - 2)? ");
        int opc = ler.nextInt();

        if (opc == 1){
            System.out.println("\nO professor e a turma tiveram um ótimo desempenho!");
        } else {
            System.out.println("\nÉ necessário revisar o desempenho para cumprir todos os assuntos devidos.\n");
        }
    }

    public void categoriaDisciplina(){
        System.out.print("A disciplina é técnica ou propedêutica? \n(TÉCNICA - 1) (PROPEDÊUTICA - 2) - ");
        int opc = ler.nextInt();

        if (opc == 1){
            System.out.println("\nA disciplina " + nome + " é uma disciplina técnica.");
        } else {
            System.out.println("\nA disciplina " + nome + " é uma disciplina propedêutica.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }
}
