import java.util.Scanner;

public class Prova {
    private double nota;
    private Disciplina disciplina;
    private int unidade;
    private String conteudo;

    Scanner ler = new Scanner(System.in);

    public Prova(double nota, int unidade) {
        this.nota = nota;
        this.unidade = unidade;
    }

    public void mostrarDetalhes(){
        System.out.println("Informações da prova: \n");
        System.out.println("Nota: " + nota);
        System.out.println("Unidade: " + unidade);
        System.out.println("Conteúdo: " + conteudo);
    }

    public void situacaoNota(){
        if (nota >= 6){
            System.out.println("\nO aluno foi aprovado! Sua nota foi " + nota);
        } else{
            System.out.println("\nO aluno foi reprovado! Sua nota foi " + nota);
        }
    }

    public void recuperarNota(){
        if(nota < 6){
            System.out.print("O aluno quis recuperar a nota (SIM - 1) (NÃO - 2)? ");
            int opc = ler.nextInt();

            if(opc == 1) {
                System.out.print("\nNota da recuperação: ");
                double nota = ler.nextDouble();

                if (nota >= 6.0) {
                    System.out.print("\nO aluno foi aprovado na recuperação!");
                } else {
                    System.out.print("\nO aluno foi reprovado na recuperação!");
                }
            }
        }
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }
}
