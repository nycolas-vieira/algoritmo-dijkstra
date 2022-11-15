package models;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private List<Vertice> vertices;

    private List<Aresta> arestas;

    private Boolean direcionado;

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
        this.direcionado = false;
    }

    public Grafo(Boolean direcionado) {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
        this.direcionado = direcionado;
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public Boolean getDirecionado() {
        return direcionado;
    }

    public void setDirecionado(Boolean direcionado) {
        this.direcionado = direcionado;
    }

    public void adicionarVertice(Vertice vertice) throws Exception {
        for (Vertice verticeAux : this.vertices) {
            if (verticeAux.getNome().equals(vertice.getNome())) {
                throw new Exception("ERRO - Vertice ja criado");
            }
        }
        this.vertices.add(vertice);
    }

    public void removerVertice(Vertice vertice) throws Exception {
        if (!this.vertices.contains(vertice)) {
            throw new Exception("ERRO - Vertice nao encontrado");
        }

        this.vertices.remove(vertice);
    }

    public void adicionarAresta(Aresta aresta) throws Exception {
        boolean hasVertice1 = false;
        boolean hasVertice2 = false;

        for (Vertice verticeAux : this.vertices) {
            if (verticeAux.getNome().equals(aresta.getVertice1().getNome())) {
                hasVertice1 = true;
            }

            if (verticeAux.getNome().equals(aresta.getVertice2().getNome())) {
                hasVertice2 = true;
            }
        }

        if (!hasVertice1 || !hasVertice2) {
            throw new Exception(
                    "ERRO - Vertice nao encontrado | Vertice 1: " + hasVertice1 + " - Vertice 2: " + hasVertice2);
        }

        this.arestas.add(aresta);
    }

    public void removerAresta(Aresta aresta) throws Exception {
        if (!this.arestas.contains(aresta)) {
            throw new Exception("ERRO - Aresta nao encontrada");
        }

        this.arestas.add(aresta);
    }

}
