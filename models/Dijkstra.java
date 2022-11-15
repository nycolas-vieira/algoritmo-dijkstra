package models;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {

  private List<Integer> estimativa;
  private List<Integer> caminho;
  private List<Vertice> precedentes;
  private Vertice verticeAtual;
  private Grafo grafo;

  public Dijkstra(Grafo grafo) {
    this.grafo = grafo;
    this.verticeAtual = grafo.getVertices().get(0);
    this.caminho = new ArrayList<Integer>();
    this.estimativa = new ArrayList<Integer>();
    this.precedentes = new ArrayList<Vertice>();
  }

  public List<Integer> getEstimativa() {
    return estimativa;
  }

  public void setEstimativa(List<Integer> estimativa) {
    this.estimativa = estimativa;
  }

  public List<Integer> getCaminho() {
    return caminho;
  }

  public void setCaminho(List<Integer> caminho) {
    this.caminho = caminho;
  }

  public List<Vertice> getPrecedentes() {
    return precedentes;
  }

  public void setPrecedentes(List<Vertice> precedentes) {
    this.precedentes = precedentes;
  }

  public Grafo getGrafo() {
    return grafo;
  }

  public void setGrafo(Grafo grafo) {
    this.grafo = grafo;
  }

  public Vertice getVerticeAtual() {
    return this.verticeAtual;
  }

  public void setVerticeAtual(Vertice verticeAtual) {
    this.verticeAtual = verticeAtual;
  }
}
