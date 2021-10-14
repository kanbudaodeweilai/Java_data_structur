package two_stage.day03.Arrays;

import java.util.Arrays;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arr = {24,21,96,32,2,14,78,37};
        System.out.println("排序前"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序前"+Arrays.toString(arr));
    }
}
