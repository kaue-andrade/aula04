// O documento .txt foi disponibilizado no AVA (Ambiente Virtual de Aprendizagem)

import java.util.Scanner;

public class EscolaMain {
    public static void main(String[] args) {

        System.out.println("\n=-=-= Escola =-=-=\n");

        System.out.println("Alunos: Antonio Carlos Borges de Souza\nKauê Andrade dos Santos\n");

        Scanner ler = new Scanner(System.in);

        Professor professor1 = new Professor("Heides", 456);

        System.out.println("# Professor #\n");

        System.out.println("Nome do professor e matrícula foram passados por meio do construtor.\n");

        System.out.print("Idade: ");
        int idade = ler.nextInt();

        System.out.print("Naturalidade: ");
        String naturalidade = ler.next();

        System.out.print("Formação: ");
        String formacao = ler.next();

        professor1.setIdade(idade);
        professor1.setNaturalidade(naturalidade);
        professor1.setFormacao(formacao);

        Disciplina d1 = new Disciplina("Matemática", 1);

        System.out.println("\n# Disciplina #\n");

        System.out.println("Nome da disciplina e semestre foram passados por meio do construtor.\n");

        System.out.print("Carga horária: ");
        int carga_horaria = ler.nextInt();

        System.out.print("Semestre: ");
        int semestre = ler.nextInt();

        d1.setCarga_horaria(carga_horaria);
        d1.setSemestre(semestre);

        Prova p1 = new Prova(5, 3);

        System.out.println("\n# Prova #\n");

        System.out.println("Nota da prova e unidade foram passados por meio do construtor.\n");

        System.out.print("Conteúdo: ");
        String conteudo = ler.next();

        System.out.print("Unidade: ");
        int unidade = ler.nextInt();

        p1.setConteudo(conteudo);
        p1.setUnidade(unidade);

        Aluno a1 = new Aluno("Antonio ", 123);

        System.out.println("\n# Aluno #\n");
        System.out.println("Nota da prova e unidade foram passados por meio do construtor.\n");

        System.out.print("Idade: ");
        int idade_aluno = ler.nextInt();

        System.out.print("Turma: ");
        String turma = ler.next();

        a1.setIdade(idade);
        a1.setTurma(turma);

        professor1.mostrarDetalhes();
        d1.mostrarDetalhes();
        p1.mostrarDetalhes();
        a1.mostrarDetalhes();

        System.out.println("\n# Professor #\n");

        professor1.apresentarAtestado();
        professor1.aplicadorProva();

        System.out.println("\n# Disciplina #");

        d1.todosConteudos();
        d1.categoriaDisciplina();

        System.out.println("\n# Prova #");

        p1.situacaoNota();
        p1.recuperarNota();

        System.out.println("\n# Aluno #\n");

        a1.presencaAluno();
        a1.atestadoAluno();
    }
}
