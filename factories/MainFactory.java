package factories;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Grafo;
import services.GrafoService;

public class MainFactory {
    
    private static Scanner scanner = new Scanner(System.in);
    private GrafoService grafoService = new GrafoService();

    public Grafo criaGrafo()  {
        System.out.println("O grafo sera direcionado? (S/N)");
        boolean direcionado = scanner.nextLine() == "S" ? true : false;

        List<String> vertices = criarListaVertices();

        try {
            return grafoService.criarGrafo(vertices, direcionado);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }

    public List<String> criarListaVertices() {
        List<String> vertices = new ArrayList<>();
        
        boolean maisVertice;
        do {
            System.out.print("Insira o nome do vertice:");
            vertices.add(scanner.nextLine());

            System.out.println("Deseja inserir mais um vertice? (S/N)");
            maisVertice = scanner.nextLine() == "S" ? true : false;
        } while (maisVertice);

        return vertices;
    }
 
}
