import java.util.Scanner;

public class Matrices {
    String producto;
    int cantidadProducto;
    double precio;
    Scanner sc = new Scanner(System.in);

    public Matrices() {
       String producto = "";
        int cantidad = 0;
        int precio = 0;
    }

    public int[][] llenarMatrizEnteros(int cantidad) {

        int[][] matriz = new int[cantidad][cantidad];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 500 + 1);

            }
        }
        return matriz;
    }

    public void mostrarMatrizEntero(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " -.- ");

            }

        }
    }

    public Matrices[][] llenarMatrizObjetual(int cantidad) {

        Matrices[][] matrizObjetual = new Matrices[cantidad][cantidad];

        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {

                Matrices m = new Matrices();
                System.out.println("Ingrese el producto");
                m.setProducto(sc.next());
                System.out.println("ingrese la cantidad de producto");
                m.setCantidadProducto(sc.nextInt());
                System.out.println("ingrese el precio");
                m.setPrecio(sc.nextInt());
                matrizObjetual[i][j] = m;

            }
        }

        return matrizObjetual;
    }

    public void mostrarMatrizObjetual(Matrices[][] MatrizObjetual) {
        for (int i = 0; i < MatrizObjetual.length; i++) {
            for (int j = 0; j < MatrizObjetual.length; j++) {
                System.out.println("--" + MatrizObjetual[i][j].getProducto());
                System.out.println("--" + MatrizObjetual[i][j].getCantidadProducto());
                System.out.println("--" + MatrizObjetual[i][j].getPrecio());

            }
            System.out.println(" ");
        }
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}