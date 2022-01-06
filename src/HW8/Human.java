package HW8;

public class Human implements Runnable {
    public String name;
    public int runMax;
    public int jumpMax;

    public Human(String name, int jumpMax, int runMax) {
        this.name = name;
        this.jumpMax = jumpMax;
        this.runMax = runMax;
    }



    @Override
    public void run(int distance) {
        System.out.println(name + " прыгнул: " + distance);
    }

    @Override
    public void jump(int height) {
        System.out.println(name + " пробежал: " + height);
    }

    @Override
    public int getJumpMax() {
        return jumpMax;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRunMax() {
        return runMax;
    }
}
