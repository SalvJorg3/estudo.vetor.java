package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          
        Scanner sc = new Scanner(System.in);
        
      int n = sc.nextInt();
      
      /* Definição do arranjo bidimensional (dois colchetes)
        instancia a matriz na memória */

      int[][] mat = new int[n][n];

      /* ler a matriz (dois for - um percorre as linhas 
      outro as colunas) */

      for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            mat[i][j] = sc.nextInt();
        }
      }
     
    /*Selecionando para impressão
     dos dados da diagonal principal
     (posição dos elementos na matriz na posição (0,0)
     (1,1) (2,2) - linha igual coluna)*/

     System.out.println("Main diagonal:");
     for(int i=0; i<n; i++) {
        System.out.print(mat[i][i] + " ");
     }
     System.out.println();

     /* Quantidade de números negativos */

     int count = 0;
     for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++){
            if (mat[i][j] < 0) {
                count ++;
            }
        }
     }
     System.out.println("Negative numbers= " + count);  

     sc.close();
   }
}
