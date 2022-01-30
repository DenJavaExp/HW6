package HW12;

public class Streaming {

    public static void arraySize(float[] arr) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long b = System.currentTimeMillis();
        System.out.println(b - a);

    }

    static final int size = 1_000_000;
    static final int helf = size / 2;


    public static void main(String[] args) {
        float[] arr = new float[size];
        arraySize(arr);

    }

}



