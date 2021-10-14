package two_stage.day03.Arrays;

public class ArrayDemo01 {
    public static void main(String[] args) {

        int[] arr = {24,21,96,32,2,14,78,37};

        System.out.print("排序前：");
        arrToString(arr);
        System.out.println();


        for (int i =0;i<arr.length-1;i++){
            int temp = arr[0];
            for (int k = 0; k<arr.length-i-1;k++){
                if (arr[k]>arr[k+1]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        System.out.print("排序后：");
        arrToString(arr);

    }





    public static void arrToString(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");

        }
    }
}
