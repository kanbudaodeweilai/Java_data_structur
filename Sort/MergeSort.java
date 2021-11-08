package Java_data_structur.Sort;

public class MergeSort {

    public static void main(String[] args) {
         int[] arr = {8,4,5,7,1,3,6,2};
         int[] temp = new int[arr.length];
         mergeSort(arr,0,arr.length-1,temp);
        for (int i:arr){
            System.out.println(i);
        }
    }
    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        if (left<right){
            int mid = (left+right)/2;
            //向左递归
            mergeSort(arr,left,mid,temp);
            //向右递归
            mergeSort(arr,mid+1,right,temp);

            merge(arr,left,right,mid,temp);
        }
    }

    //合并，
    public static void merge(int[] arr,int left,int right,int mid,int[] temp){
        int i = left;
        int j = mid+1;
        int tempindex = 0;
        //比较 ，把小的放入temp数组
        while (i<=mid&&j<=right){
            if (arr[i]<arr[j]){
                temp[tempindex]=arr[i];
                tempindex++;
                i++;
            }else {
                temp[tempindex]=arr[j];
                tempindex++;
                j++;
            }
        }
        //i,j有一个到头了
        while (i<=mid){
            temp[tempindex] = arr[i];
            tempindex++;
            i++;
        }
        while (j<=right){
            temp[tempindex] = arr[j];
            tempindex++;
            j++;
        }
        //temp赋值给arr
        tempindex--;
        j--;
        while (j>=left){
            arr[j]=temp[tempindex];
            tempindex--;
            j--;
        }

    }
}
