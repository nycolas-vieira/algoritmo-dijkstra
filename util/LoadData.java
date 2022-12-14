package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import factories.MainFactory;
import models.Aresta;
import models.Grafo;
import models.Vertice;

public class LoadData {
  public static MainFactory factory = new MainFactory();

  public static Grafo loadGrafo(String nomeArquivo, Grafo grafo) {
    boolean direcionado = false;
    int numeroVertices;

    try {
      FileReader fileReader = new FileReader(nomeArquivo);
      BufferedReader buffer = new BufferedReader(fileReader);

      String linha = buffer.readLine();
      if (linha.equals("S") || linha.equals("s"))
        direcionado = true;

      linha = buffer.readLine();
      numeroVertices = Integer.parseInt(linha);

      // Lendo os vertices
      for (int i = 0; i < numeroVertices; i++) {
        factory.criarListaVerticeTxt(grafo, buffer.readLine());
      }

      // Lendo as arestas
      while (buffer.ready()) {
        linha = buffer.readLine();
        factory.criarListaArestaTxt(grafo, linha);
      }

      // Setar os vizinhos
      for (Vertice verticeAux : grafo.getVertices()) {
        for (Aresta arestaAux : grafo.getArestas()) {
          if (verticeAux.getNome().equals(arestaAux.getVertice1().getNome())) {
            verticeAux.getVizinhos().add(arestaAux.getVertice2());
            verticeAux.getArestas().add(arestaAux);
          }

          if (arestaAux.getVertice1().getNome().equals(verticeAux.getNome())) {
            arestaAux.setVertice1(verticeAux);
          }
          if (arestaAux.getVertice2().getNome().equals(verticeAux.getNome())) {
            arestaAux.setVertice2(verticeAux);
          }
        }
      }

      grafo.setDirecionado(direcionado);

      // Fechando os leitores
      buffer.close();
      fileReader.close();

      // Retornando o grafo criado pelo arquivo
      return grafo;

    } catch (IOException ex) {
      System.out.println(ex.getMessage());
      return null;
    }
  }

}