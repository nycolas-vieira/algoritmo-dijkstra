package models;

public class Vertice {

  private String nome;
  private boolean fechado;

  public Vertice(String nome) {
    this.nome = nome;
    this.fechado = false;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public boolean getFechado() {
    return fechado;
  }

  public void setFechado(boolean estado) {
    this.fechado = estado;
  }

}
