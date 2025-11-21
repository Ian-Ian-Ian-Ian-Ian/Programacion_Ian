package Tema3.Arrays;

public class PrimerArray {

    public static void showArray(int[] array){
        for (int repet = 0; repet < 10; repet++) {
            System.out.println(array[repet]);
        }
    }
    public static void main(String[] args){
        int[] diez = new int[]{0,2,4,6,8,10,12,14,16,18};
        showArray(diez);
    }
}
