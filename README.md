**https://github.com/aalvaroo7/CasoFinal_T5.git**

Explicacion de los distintos metodos:

# Clases y Métodos

## Paquete: nummeros
### Clase: operaciones_numeros
- `sum(int n)`: Este método calcula la sumatoria de los números desde 1 hasta n.
- `listNumbers(int start, int end)`: Este método devuelve una lista de números desde start hasta end.
- `power(int base, int exponent)`: Este método calcula la potencia de un número. La base es base y el exponente es exponent.
- `max(List<Integer> numbers)`: Este método encuentra el número máximo en una lista de números.
- `sortLinesAlphabetically(String filePath)`: Este método ordena las líneas de un archivo alfabéticamente.
- `linearSearch(String filePath, String word)`: Este método realiza una búsqueda lineal de una palabra en un archivo.
- `binarySearch(String filePath, String word)`: Este método realiza una búsqueda binaria de una palabra en un archivo.

## Paquete: Analisis_genes
### Clase: contadorgenes
- `contadorgenes(String dna)`: Este es el constructor de la clase. Inicializa la clase con una cadena de ADN.
- `countGenes()`: Este método cuenta el número de genes en la cadena de ADN.

### Clase: CombinacionesGenetica
- `CombinacionesGenetica(List<String> initialGenes)`: Este es el constructor de la clase. Inicializa la clase con una lista de genes iniciales.
- `calculateCombinations(int generations)`: Este método calcula las combinaciones genéticas para un número dado de generaciones.

## Paquete: sort
### Clase: QuickSort
- `sort(T[] array)`: Este método implementa el algoritmo de ordenación QuickSort para ordenar un array en orden ascendente.

## Paquete: principal
### Clase: Main
- `main(String[] args)`: Este es el método principal que se ejecuta al iniciar el programa. Configura la interfaz de usuario y maneja las acciones del usuario.
