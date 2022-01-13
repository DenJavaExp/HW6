package HW7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void supplement(int n) {
        food+=n;
    }

    public void decreaseFood(int n) {
        food -= n;
        if(food < 0){
            food = 0;
        }
    }

    public void info() {
        System.out.println("plate: " + food);


    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
