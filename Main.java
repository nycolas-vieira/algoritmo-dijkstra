import factories.MainFactory;
import models.Aresta;
import models.Grafo;

public class Main {
    
    public static MainFactory factory = new MainFactory();

    public static void main(String[] args) {
        try {
            Grafo grafo = factory.criaGrafo();
            
            factory.criarListaVertice(grafo);
            factory.criarListaAresta(grafo);

            System.out.println("Direcionado: " + grafo.getDirecionado());

            System.out.println("\n");

            for (String vertice : grafo.getVertices()) {
                System.out.println(vertice);
            }

            System.out.println("\n");

            for (Aresta aresta : grafo.getArestas()) {
                System.out.println("Vertice 1: " + aresta.getVertice1());
                System.out.println("Vertice 2: " + aresta.getVertice2());
                System.out.println("Peso: " + aresta.getPeso());
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

}
