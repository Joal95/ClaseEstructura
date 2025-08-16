public class Array{
public int[] llenarArray(int dimension){
    int[] array = new int[dimension];

    for (int i = 0; i < array.length; i++) {
        array[i] = (int)(Math.random()*100+1);
    }
    return array;
}

public void mostrarArray(int[] vector) {

    for (int i = 0; i < vector.length; i++) {
        System.out.print(vector[i]+ ",");
    }
}


} 