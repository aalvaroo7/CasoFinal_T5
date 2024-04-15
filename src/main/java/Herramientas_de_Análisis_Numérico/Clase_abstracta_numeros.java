package Herramientas_de_Análisis_Numérico;

import java.util.List;
import java.io.IOException;

public interface Clase_abstracta_numeros {
    int sum(int n);
    List<Integer> listNumbers(int start, int end);
    int power(int base, int exponent);
    int max(List<Integer> numbers);
    void sortLinesAlphabetically(String filePath) throws IOException; // Nueva función para ordenar líneas de un archivo
}