package one_stage.day05;

public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {8,5,3,8,6,4,1,8,9,20,1};
        int max = getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] a){
        int max = a[0];
        for (int i=0;i<a.length;i++){
            max = max>a[i]?max:a[i];

        }
        return max;
    }
}
