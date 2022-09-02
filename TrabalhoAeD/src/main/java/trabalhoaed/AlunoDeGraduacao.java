package trabalhoaed;

import java.util.Scanner;

public class AlunoDeGraduacao extends Aluno {
  String curso;
  int anoEntrada;
  
  public AlunoDeGraduacao(String nome, int matricula, String email, String curso, int anoEntrada) {
    super(nome, matricula, email);
    this.anoEntrada = anoEntrada;
    this.curso = curso;
  }
  
  public AlunoDeGraduacao(String nome, int matricula, String email, String curso) {
    super(nome, matricula, email);
    this.curso = curso;
  }
  
  public AlunoDeGraduacao(String nome, int matricula, String email) {
    super(nome, matricula, email);
  }
  
  public AlunoDeGraduacao(String nome, int matricula, String email, int anoEntrada) {
    super(nome, matricula, email);
    this.anoEntrada = anoEntrada;
  }
  
  public String getCurso() {
    return this.curso;
  }
  
  public void setCurso(String curso) {
    this.curso = curso;
  }
  
  public int getAnoEntrada() {
    return this.anoEntrada;
  }
  
  public void setAnoEntrada(int anoEntrada) {
    this.anoEntrada = anoEntrada;
  }
  
  @Override
  public String toString() {
    return "Nome: " + this.getNome() + 
    " Matricula: " + this.getMatricula() + 
    " Email: " + this.getEmail() +
    " Curso: " + this.getCurso() +
    " Ano de entrada: " + this.getAnoEntrada();
  }
  
  @Override
  public void alterarAluno() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Deseja alterar nome, email, curso e ano de entrada ?");
    String resposta = teclado.next();
    if ("nome".equals(resposta)) {
      System.out.println("Digite o novo nome");
      String novoNome = teclado.next();
      setNome(novoNome);
    }
    if("email".equals(resposta)) {
      System.out.println("Digite o novo email");
      String novoEmail = teclado.next();
      setEmail(novoEmail);
    }
    if("curso".equals(resposta)) {
      System.out.println("Digite o novo curso");
      String novoCurso = teclado.next();
      setCurso(novoCurso);
    }
    if("ano".equals(resposta)) {
      System.out.println("Digite o novo ano de entrada");
      int novoAnoDeEntrada = teclado.nextInt();
      setAnoEntrada(novoAnoDeEntrada);
    }
  }
}
