package services;

import models.Vertice;

public class VerticeService {

    public Vertice criarVertice(String verticeString) throws Exception {
        if (verticeString == null || verticeString.trim() == "") {
            throw new Exception("Formato para adicionar Vertice incorreto");
        }
        return new Vertice(verticeString);
    }

}
