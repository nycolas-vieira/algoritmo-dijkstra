package services;

import java.util.ArrayList;
import java.util.List;

import models.Aresta;
import models.Dijkstra;
import models.Grafo;
import models.Vertice;

public class DijkstraService {

  public List<Vertice> getVerticesAbertos(Grafo grafo) {
    List<Vertice> vertices = new ArrayList<Vertice>();
    for (Vertice vertice : grafo.getVertices()) {
      if (!vertice.getFechado()) {
        vertices.add(vertice);
      }
    }

    return vertices;
  }

  public List<Aresta> getArestasDisponiveis(Vertice verticeAtual, Grafo grafo) {
    List<Aresta> listaDisponiveis = new ArrayList<Aresta>();

    for (Aresta aresta : grafo.getArestas()) {
      if (aresta.getVertice1().getNome().equals(verticeAtual.getNome()) && !aresta.getVertice2().getFechado()) {
        listaDisponiveis.add(aresta);
      }
    }
    return listaDisponiveis;
  }

  public void avancarAresta(Dijkstra dijkstra, Vertice proximaVertice) {

  }

}
