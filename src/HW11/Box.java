package HW11;
//Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
//        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }
    //Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    // вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    public float getWeight() {
        float sum = 0.0F;
        for (Fruit fruit : fruits) {
            sum += fruit.getWeight();
        }
        System.out.println("Вес коробки " + sum);
        return sum;
    }
//Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
// которую подадут в compare() в качестве параметра.
// true – если их массы равны, false в противоположном случае.
// Можно сравнивать коробки с яблоками и апельсинами;
    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
}