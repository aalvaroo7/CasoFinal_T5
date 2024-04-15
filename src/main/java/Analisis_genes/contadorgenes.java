package Analisis_genes;

public class contadorgenes {
    private String dna;

    public contadorgenes(String dna) {
        this.dna = dna;
    }

    public int countGenes() {
        return countGenesHelper(dna);
    }

    private int countGenesHelper(String dna) {
        if (dna.isEmpty()) {
            return 0;
        } else if (dna.startsWith("ATG")) {
            return 1 + countGenesHelper(dna.substring(3));
        } else {
            return countGenesHelper(dna.substring(1));
        }
    }
}