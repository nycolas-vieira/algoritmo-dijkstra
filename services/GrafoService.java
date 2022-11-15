package services;

import java.util.List;
import models.Grafo;

public class GrafoService {
    
    public Grafo criarGrafo(List<String> vertices, boolean direcionado) throws Exception {
        if (vertices == null || vertices.isEmpty()) {
            throw new Exception("ERRO - Insira ao menos 1 vertice");
        }
        
        return new Grafo(vertices, direcionado);
    }

}
