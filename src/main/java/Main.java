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

        int n = 5;
        System.out.println("Sum of natural numbers up to " + n + ": " + calculateSum(n));

        int start = 1;
        int end = 10;
        System.out.println("Numbers from " + start + " to " + end + ": " + listNumbers(start, end));
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

    public static int calculateSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + calculateSum(n - 1);
        }
    }

    public static List<Integer> listNumbers(int start, int end) {
        if (start > end) {
            return new ArrayList<>();
        } else {
            List<Integer> numbers = listNumbers(start, end - 1);
            numbers.add(end);
            return numbers;
        }
    }
}