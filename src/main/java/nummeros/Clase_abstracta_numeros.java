package nummeros;

import java.util.List;
import java.io.IOException;

public interface Clase_abstracta_numeros {
    int sum(int n);
    List<Integer> listNumbers(int start, int end);
    int power(int base, int exponent);
    int max(List<Integer> numbers);
    void sortLinesAlphabetically(String filePath) throws IOException; // Nueva función para ordenar líneas de un archivo
    boolean linearSearch(String filePath, String word) throws IOException;
    boolean binarySearch(String filePath, String word) throws IOException;
}