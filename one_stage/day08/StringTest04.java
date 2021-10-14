package one_stage.day08;

public class StringTest04 {
    public static String arrToString(int[] arr){
        String s="";
        s +="[";
        for (int i =0;i<arr.length;i++){
           s = s + arr[i];
           s = s + ",";

        }
        s+="]";

    return s;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,21};
        String a = arrToString(arr);
        System.out.println(a);
        System.out.println(a.getClass().toString());
    }


}
