import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        // declaracion de objetos
        Scanner sc = new Scanner(System.in);
        Array a = new Array();
        Matrices m = new Matrices();

        // declaracion de variables
        int cantidad = 0, opcion = 0, continuar = 0;
        boolean bandera = true;
        System.out.println("ingrese la dimension");
        cantidad = sc.nextInt();
        int[] vector = new int[cantidad];
        int[][] matrizEnteros = new int[cantidad][cantidad];
        Matrices[][] matrizObjetual = new Matrices[cantidad][cantidad];

        while (bandera) {

            System.out.println("opcion a ejecutar: 1) llenar vector, 2) llenar matriz, 3) llenar matriz objetual ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    vector = a.llenarArray(cantidad);
                    a.mostrarArray(vector);

                    break;
                case 2:
                    matrizEnteros = m.llenarMatrizEnteros(cantidad);
                    m.mostrarMatrizEntero(matrizEnteros);
                    break;

                case 3:
                    matrizObjetual = m.llenarMatrizObjetual(cantidad);
                    m.mostrarMatrizObjetual(matrizObjetual);
                    break;

                default:
                    System.out.println("la matriz no es valida ");
                    break;
            }
            System.out.println(
                    "\n ---------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\ndesea continuar con la ejecucion 1: 'SI' 2: 'NO'");
            continuar = sc.nextInt();

            if (continuar > 1) {
                bandera = false;
            }
        }

    }

}
