package trabalhoaed;

import java.util.Scanner;

public class Aluno {
  private int matricula;
  private String nome;
  private String email;

  public Aluno(String nome, int matricula, String email) {
    if (nome.isEmpty()) {
      this.nome = "Ze mané";
    } else {
      this.nome = nome;
    }
    if (Integer.toString(matricula).length() != 7) {
      this.matricula = 9999999;
    } else {
      this.matricula = matricula;
    }
    if (email.matches("\\w+@\\w+\\.\\w{2,3}")) {
      this.email = email;
    } else {
      this.email = null;
    }
  }
  
  public Aluno(String nome, int matricula) {
    if (nome.isEmpty()) {
      this.nome = "Ze mané";
    } else {
      this.nome = nome;
    }
    if (Integer.toString(matricula).length() != 7) {
      this.matricula = 9999999;
    } else {
      this.matricula = matricula;
    }
  }
  
  public String getNome() {
    return this.nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public int getMatricula() {
    return this.matricula;
  }
  
  public String getEmail() {
    return this.email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  @Override
  public String toString() {
    return "Nome: " + this.getNome() + " Matricula: " + this.getMatricula() + " Email: " + this.getEmail();
  }
  
  public void alterarAluno() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Deseja alterar nome, email ?");
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
  }
}
