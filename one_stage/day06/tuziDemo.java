package one_stage.day06;

public class tuziDemo {
    public static void main(String[] args) {
        int month = 1;
        int tuziNum = 1;
        int[] arr= new int[7];
        arr[0]=1;
        arr[1]=2;
        //1 4 7 10 13 16 19
        for (int i = 2;i<7;i++){
            arr[i]=arr[i-2]+arr[i-1];


        }
        System.out.println(arr[6]);

    }
}
