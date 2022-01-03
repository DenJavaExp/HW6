package HW7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[5];// содал массив из пяти обьектов типа Кот.
        catArray[0]  = new Cat("Barsik", 10);
        catArray[1]  = new Cat("Vaska", 7);
        catArray[2]  = new Cat("Pushok", 6);
        catArray[3]  = new Cat("Dymok", 11);
        catArray[4]  = new Cat("Druzhok", 3);
        Plate plate1 = new Plate(100); // создал общую тарелку с едой
        plate1.info();

        for (Cat cat : catArray) { //все коты поочереди едят из общей торелки
            cat.eat(plate1);
        }

        plate1.info(); // выводим информацию о тарелке
        plate1.supplement(50); // добавляем еду в тарелку
        plate1.info();
    }
}
