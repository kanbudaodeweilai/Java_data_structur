package Java_data_structur.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={3,9,-1,10,99,2,20};
        bubbleSort(arr);
        for (int i:arr){
            System.out.println(i);
        }

    }
    public static void bubbleSort(int[] arr){
        int flag = 1;
        for (int i =0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }
}

