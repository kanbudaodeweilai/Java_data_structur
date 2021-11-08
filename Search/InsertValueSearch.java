package Java_data_structur.Search;

public class InsertValueSearch {
    public static void main(String[] args) {
        int[] arr =new  int[100];
        for (int i=0;i<100;i++){
            arr[i]=i+10;
        }
        System.out.println(insertValueSearch(arr,0,arr.length-1,20));

    }
    public static int insertValueSearch(int[] arr,int left,int right,int a){
        System.out.println("递归了");
        int mid =left+(right-left)*(a-arr[left])/(arr[right]-arr[left]);
        if (arr[mid]>a){
            return insertValueSearch(arr,left,mid-1,a);
        }else if (arr[mid]<a){
            return insertValueSearch(arr,mid+1,right,a);
        }else {
            return mid;
        }

    }

}
