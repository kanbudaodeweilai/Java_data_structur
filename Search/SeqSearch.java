package Java_data_structur.Search;

public class SeqSearch {
    public static void main(String[] args) {
        int[] arr = {1,58,63,4,5,9,6,7};
        seqSearch(arr,6);
    }
    public static void seqSearch(int[] arr,int a){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==a){
                System.out.println(i);

            }
        }
    }


}
