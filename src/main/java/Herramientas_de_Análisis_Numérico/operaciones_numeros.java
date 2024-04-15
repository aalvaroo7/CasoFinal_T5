package Herramientas_de_Análisis_Numérico;

import java.util.ArrayList;
import java.util.List;

public class operaciones_numeros implements ej1 {

    public int sum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }


    public List<Integer> listNumbers(int start, int end) {
        if (start > end) {
            return new ArrayList<>();
        } else {
            List<Integer> numbers = listNumbers(start, end - 1);
            numbers.add(end);
            return numbers;
        }
    }
}