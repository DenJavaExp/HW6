package HW8;

public class Robot implements Runnable{
    public int id;
    public int runMax;
    public int jumpMax;

    public Robot(int id, int jumpMax, int runMax) {
        this.id = id;
        this.jumpMax = jumpMax;
        this.runMax = runMax;
    }

    @Override
    public void run(int distance) {
        System.out.println(id + " пробежал: " + distance);
    }

    @Override
    public void jump(int height) {
        System.out.println(id + " прыгнул: " + height);
    }

    @Override
    public int getJumpMax() {
        return jumpMax;
    }

    @Override
    public String getName() {
        return id + "";
    }

    @Override
    public int getRunMax() {
        return runMax;
    }
}
