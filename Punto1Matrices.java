//Realice un algoritmo que almacene números en una matriz de 6 * 6. Imprimir la suma de los números almacenados en la matriz



public class Punto1Matrices {

        public static void main (String[] args) {
            metodos Metodos = new metodos(); // Crear objeto de la Clase Métodos

            int[][] matriz = Metodos.solicitarDimension(); //Llamar al Método solocitar dimensión y almacenar el resultado

            Metodos.llenarMatriz(matriz); //llamar al método llenar Matriz recién creada

            Metodos.MostrarMatriz(matriz); //Llamar al Método Mostrar Matriz para Imprimir Matriz

            Metodos.sumarFilas(matriz); // Llamar al Método Sumar Filas
            
            Metodos.sumarColumna(matriz); // Llamar al Método sumar Matriz
        }

        
}