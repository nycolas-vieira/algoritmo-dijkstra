package models;

public class Aresta {

    private Vertice vertice1;

    private Vertice vertice2;

    private Integer peso;

    public Aresta() {
        this.peso = Integer.MAX_VALUE;
    }

    public Aresta(Vertice vertice1, Vertice vertice2, Integer peso) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.peso = peso;
    }

    public Vertice getVertice1() {
        return this.vertice1;
    }

    public void setVertice1(Vertice vertice1) {
        this.vertice1 = vertice1;
    }

    public Vertice getVertice2() {
        return this.vertice2;
    }

    public void setVertice2(Vertice vertice2) {
        this.vertice2 = vertice2;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "v1: " + this.vertice1.getNome() + " | v2: " + this.getVertice2().getNome() + " | peso: "
                + this.getPeso();
    }

}
