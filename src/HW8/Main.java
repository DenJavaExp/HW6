package HW8;

public class Main {
    public static void main(String[] args) {

        Runnable[] runners = new Runnable[3];
        runners[0] = new Human("Олег",2, 3000);
        runners[1] = new Cat("Барсик",3, 0);
        runners[2] = new Robot(256,50, 40000);

        Competable[] competables = new Competable[2];
        competables[0] = new Treadmill(1000);
        competables[1] = new Wall(1);

        for(int i = 0; i < runners.length; i++) {
            for (int j = 0; j < competables.length; j++ ){
                competables[j].competition(runners[i]);
            }
        }



    }

}
