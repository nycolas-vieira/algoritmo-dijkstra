package models;

import java.util.ArrayList;
import java.util.List;

import org.omg.CosNaming.NamingContextPackage.NotFound;

public class Grafo {
    
    private List<String> vertices;

    private List<Aresta> arestas;

    private Boolean direcionado;

    public Grafo(List<String> vertices, Boolean direcionado) {
        this.vertices = vertices;
        this.arestas = new ArrayList<>();
        this.direcionado = direcionado;
    }

    public Boolean getDirecionado() {
        return direcionado;
    }

    public void setDirecionado(Boolean direcionado) {
        this.direcionado = direcionado;
    }

    public void adicionarVertice(String vertice) throws Exception {
        if (this.vertices.contains(vertice)) {
            throw new Exception("ERRO - Vertice already created");
        }

        this.vertices.add(vertice);  
    }

    public void removerVertice(String vertice) throws Exception {
        if (!this.vertices.contains(vertice)) {
            throw new Exception("ERRO - Vertice not found");
        }

        this.vertices.remove(vertice);
    }

    public void adicionarAresta(Aresta aresta) {
        this.arestas.add(aresta);  
    }

    public void removerAresta(Aresta aresta) {
        this.arestas.add(aresta);  
    }

}
