import factories.MainFactory;
import models.Aresta;
import models.Grafo;
import models.Vertice;
import util.LoadData;

public class Main {

    public static MainFactory factory = new MainFactory();

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        System.out.println("Deseja criar um grafo manulmente? (S/N)");
        if (factory.validarResposta()) {
            grafo = factory.criaGrafoManual();

            factory.criarListaVertice(grafo);
            factory.criarListaAresta(grafo);
        } else {
            grafo = LoadData.loadGrafo("./data.txt", grafo);
        }

        System.out.println("Direcionado: " + grafo.getDirecionado());

        System.out.println("\n");

        for (Vertice vertice : grafo.getVertices()) {
            System.out.println(vertice.getNome());
        }

        System.out.println("\n");

        for (Aresta aresta : grafo.getArestas()) {
            System.out.println("Vertice 1: " + aresta.getVertice1());
            System.out.println("Vertice 2: " + aresta.getVertice2());
            System.out.println("Peso: " + aresta.getPeso());
        }
    }

}
