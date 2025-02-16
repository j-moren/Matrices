
import java.util.Scanner;

public class metodos {

    public int[][] solicitarDimension() {
        Scanner sc = new Scanner (System.in); // Crear objeto Scanner para  leer la entrada

        System.out.println("Ingrese el Número de filas de la Matriz: "); //Solicitar el Número de Filas
        int i = sc.nextInt(); // Lee el Número de filas

        System.out.println("Ingrese el Número de Columnas: "); // Solicitar el Número de Columnas
        int j = sc.nextInt(); // Lee el Número de Columnas

        int[][] matriz = new int[i][j]; // Crear la Matriz con las Dimensiones Ingresadas 
        
        return matriz;
        
    }
    public void llenarMatriz (int [][] matriz) {
        Scanner sc = new Scanner (System.in); // Crear objeto Scannner para leer la entrada 

        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz [i].length; j++) {
                System.out.println("Ingrese el valor para la posición ["+ i +"]["+ j +"]: ");
                matriz [i][j] = sc.nextInt(); // Leer un Valor y Almacenarlo en la Posición [i][j] de la Matriz
                
            }
        }
        sc.close();
    }
    public void MostrarMatriz (int [][] matriz) {
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+""); // Muestra el valor sin salto de lineas
            }
            System.out.println(); //Salto de Linea al final de cada fila 
        }
    }
    public void sumarFilas (int [][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz [i][j]; // Sumar elementos de la fila                
            }
            System.out.println("Suma de la Fila" +i+ ":"+sumaFila); // Imprimir la Suma
        }
    }
    public void sumarColumna (int [][] matriz) {

        for (int j = 0; j < matriz[0].length; j++) {
            int sumarColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumarColumna += matriz [i][j]; // Sumar Elementos de la Columna   
            }
            System.out.println("suma de la columna" +j+ ":" + sumarColumna);
        }
    }
}   
