package Java_data_structur.Sort;

public class InsertSort {
    public static void main(String[] args) {
        int arr[]={3,9,-1,10,99,2,20};
        insertSort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    // for循环的插入排序
//    public static void insertSort(int[] arr){
//        for (int i =1;i<arr.length;i++){
//            for (int j =0;j<i;j++){
//                if (arr[i]<arr[j]){
//                    int temp = arr[i];
//                    for (int k =i;k>j;k--){
//                        arr[k]=arr[k-1];
//                    }
//                    arr[j]=temp;
//                }
//            }
//        }
//
//    }

    //while循环的插入排序
//    public static void insertSort(int[] arr){
//        for (int i=1;i<arr.length;i++){
//            int j = 0;
//            int temp = 0;
//            while (j<i){
//                if (arr[j]>arr[i]){
//                    temp = arr[i];
//                    for (int k=i;k>j;k--){
//                        arr[k]=arr[k-1];
//                    }
//                    arr[j]=temp;
//                }
//                j++;
//            }
//        }
//    }

    public static void insertSort(int[] arr){
        for (int i =1;i<arr.length;i++){

            int insertValue = arr[i];
            int insertIndex = i-1;
            while (insertIndex>=0&&arr[insertIndex]>insertValue){
                arr[insertIndex+1]=arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1]=insertValue;

        }
        }

}
