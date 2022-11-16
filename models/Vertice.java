package models;

import java.util.ArrayList;
import java.util.List;

public class Vertice implements Comparable<Vertice> {

  private String nome;
  private boolean fechado;
  private int distancia;
  private boolean visitado = false;
  private Vertice pai;
  private List<Aresta> arestas = new ArrayList<Aresta>();
  private List<Vertice> vizinhos = new ArrayList<Vertice>();

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

  public void visitar() {

    this.visitado = true;
  }

  public boolean verificarVisita() {

    return visitado;
  }

  public void setDistancia(int distancia) {

    this.distancia = distancia;
  }

  public int getDistancia() {

    return this.distancia;
  }

  public void setPai(Vertice pai) {

    this.pai = pai;
  }

  public Vertice getPai() {

    return this.pai;
  }

  public void setVizinhos(List<Vertice> vizinhos) {

    this.vizinhos.addAll(vizinhos);

  }

  public List<Vertice> getVizinhos() {

    return this.vizinhos;
  }

  public void setArestas(List<Aresta> arestas) {

    this.arestas.addAll(arestas);

  }

  public List<Aresta> getArestas() {

    return arestas;
  }

  public int compareTo(Vertice vertice) {
    System.out.println("THIS: " + this.getNome() + " - D: " + this.getDistancia());
    System.out.println("v: " + vertice.getNome() + " - D: " + vertice.getDistancia());
    if (this.getDistancia() < vertice.getDistancia())
      return -1;
    else if (this.getDistancia() == vertice.getDistancia())
      return 0;

    return 1;

  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Vertice) {
      Vertice vRef = (Vertice) obj;
      if (this.getNome().equals(vRef.getNome()))
        return true;
    }
    return false;
  }

  @Override
  public String toString() {
    return nome;
  }

}
