package Java_data_structur.Sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ShellSort {
    public static void main(String[] args) {
//        int[] arr = {8,9,1,7,2,3,5,4,6,0};
        int[] arr = new int[8000000];
        for (int i=0;i<80000;i++){
            arr[i]=(int)(Math.random()*8000000);
        }
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(date1);
        System.out.println("排序前的时间"+date1Str);
        shellSort(arr);
        Date date2 = new Date();
        String date2Str = simpleDateFormat.format(date2);
        System.out.println("排序后的时间"+date2Str);
//        for (int i:arr){
//            System.out.println(i);
//        }

    }
//    //交换法（比较慢）
//    public static void shellSort(int[] arr){
//        int k = arr.length/2;
//        while (k>0){
//            int temp=0;
//            for (int i=k;i<arr.length;i++){
//                for (int j=i-k;j>=0;j-=k){
//                   if (arr[j]>arr[j+k]){
//                       temp = arr[j+k];
//                       arr[j+k]=arr[j];
//                       arr[j]=temp;
//                   }
//                }
//            }
//            for (int i:arr){
//                System.out.print(i+"  ");
//            }
//            System.out.println();
//            k=k/2;
//
//        }
//    }

    public static void shellSort(int[] arr){
        int k = arr.length/2;
        while (k>0){
            for (int i=0;i<k;i++){
                for (int j=i+k;j<arr.length;j+=k){
                    int insertValue = arr[j];
                    int insertIndex = j-k;
                    while (insertIndex>=0&&arr[insertIndex]>insertValue){
                        arr[insertIndex+k]=arr[insertIndex];
                        insertIndex = insertIndex - k;
                    }
                    arr[insertIndex+k]=insertValue;


                }
            }
            k=k/2;


            }


    }
}
