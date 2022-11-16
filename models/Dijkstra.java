package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dijkstra {

  private List<Vertice> menorCaminho = new ArrayList<Vertice>();
  private Vertice verticeCaminho = new Vertice(null);
  private Vertice atual = new Vertice(null);
  private Vertice vizinho;
  public List<Vertice> naoVisitados = new ArrayList<Vertice>();

  public List<Vertice> encontrarMenorCaminhoNDirecionado(Grafo grafo) {

    return null;
  }

  public List<Vertice> encontrarMenorCaminho(Grafo grafo) {
    Vertice v1 = grafo.getArestas().get(0).getVertice1();
    Vertice v2 = grafo.getArestas().get(grafo.getArestas().size() - 1).getVertice2();
    menorCaminho.add(v1);

    for (int i = 0; i < grafo.getVertices().size(); i++) {
      if (grafo.getVertices().get(i).getNome().equals(v1.getNome())) {
        grafo.getVertices().get(i).setDistancia(0);
      } else {
        grafo.getVertices().get(i).setDistancia(9999);
      }

      this.naoVisitados.add(grafo.getVertices().get(i));
    }
    Collections.sort(this.naoVisitados);

    while (!this.naoVisitados.isEmpty()) {
      this.atual = this.naoVisitados.get(0);

      for (int i = 0; i < atual.getArestas().size(); i++) {
        this.vizinho = atual.getArestas().get(i).getVertice2();
        if (!vizinho.verificarVisita()) {
          if (vizinho.getDistancia() > (atual.getDistancia() + atual.getArestas().get(i).getPeso())) {
            vizinho.setDistancia(atual.getDistancia() + atual.getArestas().get(i).getPeso());
            vizinho.setPai(atual);

            if (vizinho == v2) {
              menorCaminho.clear();
              verticeCaminho = vizinho;
              menorCaminho.add(vizinho);
              while (verticeCaminho.getPai() != null) {
                menorCaminho.add(verticeCaminho.getPai());
                verticeCaminho = verticeCaminho.getPai();
              }

              Collections.sort(menorCaminho);
            }
          }
        }
      }

      this.atual.visitar();
      this.naoVisitados.remove(this.atual);

      Collections.sort(this.naoVisitados);
      System.out.println("Nao foram visitados ainda:" + naoVisitados);
    }
    return this.menorCaminho;

  }

  // Get/Sets
  public List<Vertice> getMenorCaminho() {
    return menorCaminho;
  }

  public void setMenorCaminho(List<Vertice> menorCaminho) {
    this.menorCaminho = menorCaminho;
  }

  public Vertice getVerticeCaminho() {
    return verticeCaminho;
  }

  public void setVerticeCaminho(Vertice verticeCaminho) {
    this.verticeCaminho = verticeCaminho;
  }

  public Vertice getAtual() {
    return atual;
  }

  public void setAtual(Vertice atual) {
    this.atual = atual;
  }

  public Vertice getVizinho() {
    return vizinho;
  }

  public void setVizinho(Vertice vizinho) {
    this.vizinho = vizinho;
  }

}
