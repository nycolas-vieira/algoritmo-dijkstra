import factories.MainFactory;
import models.Grafo;

public class Main {
    
    public static MainFactory factory = new MainFactory();

    public static void main(String[] args) {
        try {
            Grafo grafo = factory.criaGrafo();
                        
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

}
