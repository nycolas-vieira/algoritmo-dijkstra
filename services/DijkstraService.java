package services;

import java.util.ArrayList;
import java.util.List;

import models.Aresta;
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

  public Aresta pegarArestasDisponiveis(Vertice verticeAtual, Grafo grafo) {
    List<Aresta> listaDisponiveis = new ArrayList<Aresta>();

    for (Aresta aresta : grafo.getArestas()) {
      if (aresta.getVertice1().equals(verticeAtual) && !aresta.getVertice2().getFechado()) {
        listaDisponiveis.add(aresta);
      }
    }
    return null;
  }

  public void avancarAresta(Grafo grafo) {

  }

}
