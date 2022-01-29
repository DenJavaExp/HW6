package HW11;
//Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
public class Fruit {

    private float weight;
    private String color;
    private String sort;


    public Fruit(float weight, String color, String sort) {
        this.weight = weight;
        this.color = color;
        this.sort = sort;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getSort() {
        return sort;
    }


}
