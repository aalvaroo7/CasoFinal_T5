package nummeros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class operaciones_numeros implements Clase_abstracta_numeros {

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

    public int power(int base, int exponent) { // Implementación de la función para calcular potencias
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public int max(List<Integer> numbers) { // Implementación de la función para encontrar el valor máximo
        if (numbers.size() == 1) {
            return numbers.get(0);
        } else {
            int otherMax = max(numbers.subList(1, numbers.size()));
            return numbers.get(0) > otherMax ? numbers.get(0) : otherMax;
        }
    }

    public void sortLinesAlphabetically(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        Collections.sort(lines);
        Files.write(Paths.get(filePath), lines);
    }

    public boolean linearSearch(String filePath, String word) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        for (String line : lines) {
            if (line.contains(word)) {
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch(String filePath, String word) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        Collections.sort(lines);
        int left = 0;
        int right = lines.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (lines.get(mid).equals(word)) {
                return true;
            } else if (lines.get(mid).compareTo(word) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }



}