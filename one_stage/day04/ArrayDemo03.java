package one_stage.day04;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arr = {10,25,39,462,54,61,77,8,955,100};
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("这个数组中的最大值为："+max);
    }
}
