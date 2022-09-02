package trabalhoaed;

import java.util.Scanner;

public class AlunoDePosGraduacao extends Aluno {
  private String curso;
  private int semestreInicio;
  
  public AlunoDePosGraduacao(String nome, int matricula, String email,String curso, int semestreInicio) {
    super(nome, matricula, email);
    this.semestreInicio = semestreInicio;
    this.curso = curso;
  }
  
  public AlunoDePosGraduacao(String nome, int matricula, String email,String curso) {
    super(nome, matricula, email);
    this.curso = curso;
  }
  
  public AlunoDePosGraduacao(String nome, int matricula, String email, int semestreInicio) {
    super(nome, matricula, email);
    this.semestreInicio = semestreInicio;
  }
  
  public AlunoDePosGraduacao(String nome, int matricula, String email) {
    super(nome, matricula, email);
  }
  
  public String getCurso() {
    return this.curso;
  }
  
  public void setCurso(String curso) {
    this.curso = curso;
  }
  
  public int getSemestreInicio() {
    return this.semestreInicio;
  }
  
  public void setSemestreInicio(int semestreInicio) {
    this.semestreInicio = semestreInicio;
  }
  
@Override
  public String toString() {
    return "Nome: " + this.getNome() + 
    " Matricula: " + this.getMatricula() + 
    " Email: " + this.getEmail() +
    " Curso: " + this.getCurso() +
    " Inicio do semestre: " + this.getSemestreInicio();
  }
  
@Override
  public void alterarAluno() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Deseja alterar nome, email, curso e semestre ?");
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
    if("semestre".equals(resposta)) {
      System.out.println("Digite o novo semestre");
      int novoSemestre = teclado.nextInt();
      setSemestreInicio(novoSemestre);
    }
  }
}
