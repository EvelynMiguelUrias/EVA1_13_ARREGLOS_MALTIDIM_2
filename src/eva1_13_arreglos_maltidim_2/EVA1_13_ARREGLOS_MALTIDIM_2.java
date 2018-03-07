/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_arreglos_maltidim_2;

/**
 *
 * @author Evelyn
 */
public class EVA1_13_ARREGLOS_MALTIDIM_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] aiMatriz = new int[3][];//SI NO SE DEFINE EL SEGUNDO CORCHETE CADA FILA PUEDE TENER DIFERENTES COLUMNAS
        System.out.println(aiMatriz);
        aiMatriz[0] = new int[2];//DAMOS VALOR AL SIGUINETE CORCHETE
        System.out.println(aiMatriz[0]);//IMPRIMIMOS DIRECCIONE
        System.out.println(aiMatriz[0][0]);
        aiMatriz[1] = new int[5];
        System.out.println(aiMatriz[1]);
        System.out.println(aiMatriz[1][3]);
        aiMatriz[2] = new int[10];
        System.out.println(aiMatriz[2]);
        System.out.println(aiMatriz[2][8]);
        for (int i = 0; i < aiMatriz.length; i++) {//FILAS 
            for (int j = 0; j < aiMatriz[i].length; j++) {//COLUMNAS
                System.out.println(aiMatriz[i][j]);
            }
        }
    }
}
