package Analisis_genes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinacionesGenetica {
    private List<String> initialGenes;

    public CombinacionesGenetica(List<String> initialGenes) {
        this.initialGenes = initialGenes;
    }

    public List<String> calculateCombinations(int generations) {
        return calculateCombinationsHelper(initialGenes, generations);
    }

    private List<String> calculateCombinationsHelper(List<String> genes, int generations) {
        if (generations == 1) {
            return genes;
        } else {
            List<String> newGenes = new ArrayList<String>();
            for (String gene : genes) {
                newGenes.add(gene + "A");
                newGenes.add(gene + "a");
            }
            return calculateCombinationsHelper(newGenes, generations - 1);
        }
    }
}