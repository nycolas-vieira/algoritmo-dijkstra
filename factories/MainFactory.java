package factories;

import java.util.Scanner;

import models.Grafo;
import services.ArestaService;

public class MainFactory {
    
    private static Scanner scanner = new Scanner(System.in);
    private ArestaService arestaService = new ArestaService();

    public Grafo criaGrafo()  {
        System.out.println("O grafo sera direcionado? (S/N)");
        return new Grafo(scanner.nextLine() == "S" ? true : false);
    }

    public void criarListaVertice(Grafo grafo) throws Exception {        
        boolean maisVertice;
        do {
            System.out.print("Insira o nome do vertice:");
            grafo.adicionarVertice(scanner.nextLine());

            System.out.println("Deseja inserir mais um vertice? (S/N)");
            maisVertice = scanner.nextLine() == "S" ? true : false;
        } while (maisVertice);
    }

    public void criarListaAresta(Grafo grafo) throws Exception {
        boolean maisVertice;
        do {
            System.out.print("Insira a aresta no formato \"Vertice1, Vertice2, Peso\":");
            String arestaString = scanner.nextLine();

            grafo.adicionarAresta(arestaService.criarAresta(arestaString));

            System.out.println("Deseja inserir mais uma aresta? (S/N)");
            maisVertice = scanner.nextLine() == "S" ? true : false;
        } while (maisVertice);
    }
 
}
