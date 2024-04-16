**https://github.com/aalvaroo7/CasoFinal_T5.git**
Explicacion de los distintos metodos:

QuickSort.java: Esta clase implementa el algoritmo de ordenamiento QuickSort. Los métodos en esta clase son:  
sort(T[] array): Este método implementa el Quick Sort genérico. Ordena el array en orden ascendente.
doSort(T[] array, int left, int right): Este es el proceso de ordenamiento. Ordena el array entre los índices left y right.
randomPartition(T[] array, int left, int right): Este método randomiza el array para evitar secuencias básicamente ordenadas. Devuelve el índice de partición del array.
partition(T[] array, int left, int right): Este método encuentra el índice de partición para un array.
less(T v, T w): Este método compara dos elementos y devuelve true si el primer elemento es menor que el segundo.
swap(T[] array, int i, int j): Este método intercambia dos elementos en un array.
GestionInformacionCientifica.java: Esta clase gestiona la información científica. Los métodos en esta clase son:  
GestionInformacionCientifica(): Este es el constructor de la clase. Inicializa la clase y configura la interfaz de usuario.
sortDates(String[] dateStrings): Este método ordena un array de fechas en formato "dd/MM/yyyy".
HerramientasAnalisisNumerico.java: Esta clase proporciona herramientas de análisis numérico. Los métodos en esta clase son:  
HerramientasAnalisisNumerico(): Este es el constructor de la clase. Inicializa la clase y configura la interfaz de usuario.
AnalisisGenomico.java: Esta clase realiza un análisis genómico. Los métodos en esta clase son:  
AnalisisGenomico(): Este es el constructor de la clase. Inicializa la clase y configura la interfaz de usuario.
operaciones_numeros.java: Esta clase implementa la interfaz Clase_abstracta_numeros y proporciona varias operaciones numéricas. Los métodos en esta clase son:  
sum(int n): Este método calcula la suma de los primeros n números naturales.
listNumbers(int start, int end): Este método devuelve una lista de números entre start y end.
power(int base, int exponent): Este método calcula la potencia de un número.
max(List<Integer> numbers): Este método encuentra el número máximo en una lista de números.
sortLinesAlphabetically(String filePath): Este método ordena las líneas de un archivo alfabéticamente.
linearSearch(String filePath, String word): Este método realiza una búsqueda lineal de una palabra en un archivo.
binarySearch(String filePath, String word): Este método realiza una búsqueda binaria de una palabra en un archivo.
contadorgenes.java: Esta clase cuenta los genes en una cadena de ADN. Los métodos en esta clase son:  
contadorgenes(String dna): Este es el constructor de la clase. Inicializa la clase con una cadena de ADN.
countGenes(): Este método cuenta el número de genes en la cadena de ADN.
CombinacionesGenetica.java: Esta clase calcula las combinaciones genéticas. Los métodos en esta clase son:  
CombinacionesGenetica(List<String> initialGenes): Este es el constructor de la clase. Inicializa la clase con una lista de genes iniciales.
calculateCombinations(int generations): Este método calcula las combinaciones genéticas para un número dado de generaciones.
Main.java: Esta es la clase principal que ejecuta el programa. Los métodos en esta clase son:  
main(String[] args): Este es el método principal que se ejecuta al iniciar el programa. Configura la interfaz de usuario y maneja las acciones del usuario.