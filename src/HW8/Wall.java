package HW8;

public class Wall implements Competable {
    public int height;

    public Wall(int height) {
        this.height = height;
    }



    @Override
    public void competition(Runnable runners) {
        if (runners.getJumpMax() < height) {
            System.out.println("Участник " + runners.getName() + " не смог преодалеть препятсвие!");
        } else {
            System.out.println("Участник " + runners.getName() + " успешно преодалел препятсвие!");
        }
    }


}
