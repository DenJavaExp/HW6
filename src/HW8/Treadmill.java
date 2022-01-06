package HW8;

public class Treadmill implements Competable {
    public int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void competition(Runnable runners) {

        if (runners.getRunMax() < distance) {
            System.out.println("Участник " + runners.getName() + " не смог преодалеть дистанцию!");
        } else {
            System.out.println("Участник " + runners.getName() + " успешно преодалел дистанцию!");
        }
    }




}


//for (Person value : persArray) {
//            System.out.println(value);