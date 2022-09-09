package trabalhoaed;

import java.util.Scanner;
import java.util.LinkedList;

public class ProgramaPrincipal {
    static LinkedList<Aluno> listaDeAlunos = new LinkedList<>();
    public static void main(String [] args) {
    menu();
    }
    public static void menu() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Deseja criar, alterar, exibir um aluno ou sair ?");
    String resposta = teclado.nextLine();
    if ("criar".equals(resposta)) {
      criarAluno();
    }
    if ("alterar".equals(resposta)) {
      alterarAluno();
    }
    if ("exibir".equals(resposta)) {
      exibirAluno();
    }
    if ("sair".equals(resposta)) {
      System.out.println("Adeus");
    }
   }
    public static void criarAluno() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Temos três tipos de alunos");
    System.out.println("1 - Aluno");
    System.out.println("2 - AlunoDeGraduacao");
    System.out.println("3 - AlunoDePosGraduacao");
    System.out.println("Escolha o aluno que você quer criar 1,2 ou 3?");
    int alunoEscolhido =  teclado.nextInt();
    switch (alunoEscolhido) {
      case 1 -> {
        System.out.println("Qual é o nome desse aluno?");
        String nome = teclado.next();
        System.out.println("Qual é a matricula desse aluno");
        int matricula = teclado.nextInt();
        System.out.println("Qual é o email deste aluno ?");
        String email = teclado.next();
        Aluno aluno = new Aluno(nome, matricula, email);
        listaDeAlunos.add(aluno);
        System.out.println("Aluno criado com sucesso");
            }
      case 2 -> {
        System.out.println("Qual é o nome desse aluno?");
        String nome = teclado.next();
        System.out.println("Qual é a matricula desse aluno");
        int matricula = teclado.nextInt();
        System.out.println("Qual é o email deste aluno ?");
        String email = teclado.next();
        System.out.println("Qual é o curso deste aluno ?");
        String curso = teclado.next();
        System.out.println("Qual é o ano de entrada deste aluno");
        int anoEntrada = teclado.nextInt();
        AlunoDeGraduacao aluno = new AlunoDeGraduacao(nome, matricula, email, curso, anoEntrada);
        listaDeAlunos.add(aluno);
        System.out.println("Aluno criado com sucesso");
        menu();
            }
      case 3 -> {
        System.out.println("Qual é o nome desse aluno?");
        String nome = teclado.next();
        System.out.println("Qual é a matricula desse aluno");
        int matricula = teclado.nextInt();
        System.out.println("Qual é o email deste aluno ?");
        String email = teclado.next();
        System.out.println("Qual é o curso deste aluno ?");
        String curso = teclado.next();
        System.out.println("Qual é o inicio de semestre deste aluno");
        int semestreInicio = teclado.nextInt();
        AlunoDePosGraduacao aluno = new AlunoDePosGraduacao(nome, matricula, email, curso, semestreInicio);
        listaDeAlunos.add(aluno);
        System.out.println("Aluno criado com sucesso");
        menu();
            }
      default -> System.out.print("Aluno nao existe");
    }
    }
    
    public static void alterarAluno() {
      Scanner teclado = new Scanner(System.in);
      if (listaDeAlunos.isEmpty()) {
        System.out.println("Lista de alunos vazia");
        menu();
      } else {
        System.out.println("Qual é número da matricula deste aluno?");
        int matricula = teclado.nextInt();
        for (Aluno aluno: listaDeAlunos) {
          if (aluno.getMatricula() == matricula) {
            aluno.alterarAluno();
          }
        }
        menu();
      } 
    }
    
    public static void exibirAluno() {
     Scanner teclado = new Scanner(System.in);
     if (listaDeAlunos.isEmpty()) {
       System.out.println("Lista de alunos vazia");
       menu();
     } else {
       System.out.println("Qual é número da matricula deste aluno?");
      int matricula = teclado.nextInt();
      for (Aluno aluno: listaDeAlunos) {
        if (aluno.getMatricula() == matricula) {
          System.out.println(aluno);
        }
      }
      menu();
     }
    }
}
