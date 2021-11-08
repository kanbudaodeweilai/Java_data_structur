package Java_data_structur.Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,8,15,123,197,465,465,465,465,654,498849};
        int index = binarySearch(arr,0,arr.length,1);

        while (index>1&&arr[index]==arr[index-1]){
            index--;
        }
        int a = arr[index];
        while (arr[index]==a){
            System.out.println(index);
            index++;
        }

    }
    public static int binarySearch(int[] arr,int left,int right,int a){
        int mid =( left+right)/2;
        if (arr[mid]>a){
            return binarySearch(arr,left,mid-1,a);
        }else if (arr[mid]<a){
            return binarySearch(arr,mid+1,right,a);
        }else {
            return mid;
        }

    }
}
