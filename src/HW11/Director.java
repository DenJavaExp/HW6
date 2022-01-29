package HW11;

import java.util.ArrayList;

public class Director {
    public static void main(String[] args) {
//Для хранения фруктов внутри коробки можно использовать ArrayList;
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple(1.0F, "Желтые", "Антоновка"));
        apples.add(new Apple(1.2F, "Зеленое", "Папировка"));
        apples.add(new Apple(1.5F, "Красный", "Травитта"));

        ArrayList<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange(1.5F, "Оранжевый", "Марокко"));
        oranges.add(new Orange(1.2F, "Желтый", "Верна"));
        oranges.add(new Orange(1.3F, "Красный", "Травитта"));

        Box<Apple> boxForApple = new Box<>();
        boxForApple.setFruits(apples);

        Box<Orange> boxForOrange = new Box<>();
        boxForOrange.setFruits(oranges);


        boxForApple.getWeight();
        boxForOrange.getWeight();
        System.out.println(boxForApple.compare(boxForOrange));


    }

}
