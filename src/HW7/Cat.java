package HW7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        satiety = p.getFood() >= appetite;
        System.out.println("Кот " + name + " сыт: " + satiety);
        p.decreaseFood(appetite);
    }


    public boolean isSatiety() {
        return satiety;
    }
}
