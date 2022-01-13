package HW9;

public class Array {
    public static String[][] array1 = {{"1", "2", "3"},{" ", " "}};
    public static String[][] array = {{"1", "3", "10", "5"},{"2", "8", "5", "1"},{"5", "12" , "H", "4"},{"1", "2", "3", "9"}};
    static void arrayTest(String array[][]) throws MyArraySizeExeption {
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if(array.length != 4 || array[i].length != 4 ){
                    throw new MyArraySizeExeption(array);
                }
            }
        }
        System.out.println(array);
    }
    public static void main(String[] args) throws MyArraySizeExeption {
        arrayTest(array1);

    }


}