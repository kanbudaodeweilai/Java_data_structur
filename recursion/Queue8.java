package Java_data_structur.recursion;

public class Queue8 {
    int max = 8;
    int[] arr = new int[max];
    public static void main(String[] args) {

        Queue8 queue8 = new Queue8();
        queue8.check(0);

    }
    public void check(int n){
        if (n==8){
            print();
            return;
        }
        for (int i=0;i<max;i++){
            arr[n]=i;
            if (judge(n)){
                check(n+1);
            }
        }

    }
    public boolean judge(int n){
        for (int i = 0 ;i<n;i++){
            if (arr[n]==arr[i]||Math.abs(arr[n]-arr[i])==Math.abs(n-i)){
                return false;
            }
        }
        return true;
    }
    public void print(){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
