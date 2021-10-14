package one_stage.day06;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        int temp = 0;
        for (int i =0;i<arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        //一种简单的遍历数组的方式
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
