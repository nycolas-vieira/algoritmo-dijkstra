package models;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
    
    private List<String> vertices;

    private List<Aresta> arestas;

    private Boolean direcionado;

    public Grafo(Boolean direcionado) {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
        this.direcionado = direcionado;
    }

    public List<String> getVertices() {
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

    public void adicionarVertice(String vertice) {
        if (this.vertices.contains(vertice)) {
            System.err.println("ERRO - Vertice ja criado");
        }

        this.vertices.add(vertice);  
    }

    public void removerVertice(String vertice) {
        if (!this.vertices.contains(vertice)) {
            System.err.println("ERRO - Vertice nao encontrado");
        }

        this.vertices.remove(vertice);
    }

    public void adicionarAresta(Aresta aresta) {
        if (!this.vertices.contains(aresta.getVertice1()) 
                || !this.vertices.contains(aresta.getVertice2())) {
            System.err.println("ERRO - Vertice nao encontrado");
        }

        this.arestas.add(aresta);  
    }

    public void removerAresta(Aresta aresta) {
        if (!this.arestas.contains(aresta)) {
            System.err.println("ERRO - Aresta nao encontrada");
        }

        this.arestas.add(aresta);  
    }

}
