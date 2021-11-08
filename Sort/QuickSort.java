package Java_data_structur.Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,5,6,21,4,2,3,1};
        quickSort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.println(i);
        }

    }
    public static void quickSort(int[] arr,int left,int right){
        int l = left;
        int r = right;
        int p = arr[(r+l)/2];
        while (l<r){
            //找左边大的
            while (arr[l]<p){
                l++;
            }
            //找右边小的
            while (arr[r]>p){
                r--;
            }
            //不能过界
            if (l>r){
                break;
            }
            //前边大的和后边小的进行交换
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //递归操作
            if (l==r){
                l++;
                r--;
            }
            if (left<r){
                quickSort(arr,left,r);
            }
            if (right>l){
                quickSort(arr,l,right);
            }

        }
    }



}
