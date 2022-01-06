package HW8;

public class Cat implements Runnable{
    public String nickname;
    public int runMax;
    public int jumpMax;

    public Cat(String nickname, int jumpMax, int runMax) {
        this.nickname = nickname;
        this.jumpMax = jumpMax;
        this.runMax = runMax;
    }

    @Override
    public void run(int distance) {
        System.out.println("Кошка ленивая и не хочет бежать!");
    }

    @Override
    public void jump(int height) {
        System.out.println(nickname + " прыгнула: " + height);
    }

    @Override
    public int getJumpMax() {
        return jumpMax;
    }

    @Override
    public String getName() {
        return nickname;
    }

    @Override
    public int getRunMax() {
        return runMax;
    }
}
