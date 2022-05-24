import java.util.Scanner;

public class MatrizInversa {
    Scanner teclado = new Scanner(System.in);

    int primeraMatriz[][];
    int matrizTranspuesta[][];
    int f;
    int c;

    public MatrizInversa(int f, int c) {

        establecerF(f);
        establecerC(c);
    }

    public int optenerF() {
        return f;

    }

    public void establecerF(int f) {
        this.f = f;

    }

    public int optenerC() {
        return f;

    }

    public void establecerC(int c) {
        this.c = c;

    }

    public void pedirmatriz() {

        primeraMatriz = new int[f][c];// Definimos la matriz

        System.out.println("Digite los elementos de la primera matriz");
        for (int i = 0; i < optenerF(); i++) {
            for (int j = 0; j < optenerC(); j++) {
                System.out.print("Posicion [" + i + "][" + j + "] : ");
                primeraMatriz[i][j] = teclado.nextInt();
            }
        }
    }

    public void mostrarmatriz() {

        for (int i = 0; i < optenerF(); i++) {
            for (int j = 0; j < optenerC(); j++) {
                System.out.print(" [ " + primeraMatriz[i][j] + " ] ");
            }
            System.out.println("");
        }

    }

    public void matrizTranspuesta() {
        matrizTranspuesta = new int[f][c];

        for (int i = 0; i < optenerF(); i++) {
            for (int j = 0; j < optenerC(); j++) {
                matrizTranspuesta[i][j] = primeraMatriz[j][i];
            }
        }

    }

    public void matrizInversa() {

        System.out.println("La matriz inversa es :");

        for (int i = 0; i < optenerF(); i++) {
            for (int j = 0; j < optenerC(); j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
