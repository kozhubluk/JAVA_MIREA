package FirstWeek;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array1[i] = (int)(Math.random()*30);
            array2[i] = random.nextInt(30);
        }
        System.out.println("1ый массив " + Arrays.toString(array1));
        System.out.println("2ой массив " + Arrays.toString(array2));

    }
}
