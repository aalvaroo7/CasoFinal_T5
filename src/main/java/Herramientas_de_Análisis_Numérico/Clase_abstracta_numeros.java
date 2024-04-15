package Herramientas_de_Análisis_Numérico;

import java.util.List;

public interface Clase_abstracta_numeros {
    int sum(int n);
    List<Integer> listNumbers(int start, int end);
    int power(int base, int exponent); // Nueva función para calcular potencias
    int max(List<Integer> numbers); // Nueva función para encontrar el valor máximo
}