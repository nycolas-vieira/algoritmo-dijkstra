import factories.MainFactory;
import models.Grafo;

public class Main {
    
    public static MainFactory factory = new MainFactory();

    public static void main(String[] args) {
        Grafo grafo = factory.criaGrafo();
        System.out.println(grafo);
    }

}
