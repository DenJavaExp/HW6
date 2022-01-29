package HW11;
//Написать метод, который преобразует массив в ArrayList
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        ArrayList<Integer> arrayList = new ArrayList();
        for (int j : array) {
            arrayList.add(j);
        }
        System.out.println(arrayList);
    }
}