import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String dna = "ATGCGTATGAGCTAGCATG";
        System.out.println("Number of genes: " + countGenes(dna));

        int generations = 2;
        List<String> initialGenes = Arrays.asList("A", "a");
        List<String> combinations = calculateCombinations(initialGenes, generations);
        System.out.println("Genetic combinations for " + generations + " generations: " + combinations);
    }

    public static int countGenes(String dna) {
        if (dna.isEmpty()) {
            return 0;
        } else if (dna.startsWith("ATG")) {
            return 1 + countGenes(dna.substring(3));
        } else {
            return countGenes(dna.substring(1));
        }
    }

    public static List<String> calculateCombinations(List<String> genes, int generations) {
        if (generations == 1) {
            return genes;
        } else {
            List<String> newGenes = new ArrayList<String>();
            for (String gene : genes) {
                newGenes.add(gene + "A");
                newGenes.add(gene + "a");
            }
            return calculateCombinations(newGenes, generations - 1);
        }
    }
}