package HW11;
//Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа)
//При решение данной задачи я воспользовался вашей подсказкой из вебинара (Спасибо)
public class ArrayRevers {


    public static void main(String[] args) {
        String[] people = {"Andrey", "Roma", "Denis", "Vova"};
        Integer[] numbers = {1, 2, 4, 70};


        Printer.print(people);
        Printer.print(numbers);
    }

}

class Printer {

    public static <T> void print(T[] array) { //метод принимает массивы любого ссылочного типа
        T buf = array[0];
        array[0] = array[1];
        array[1] = buf;
        for (T t : array) {
            System.out.println(t + " ");
        }
        System.out.println();
    }


}
