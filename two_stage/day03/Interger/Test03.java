package two_stage.day03.Interger;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String s1="";
        // regex : " "   空格为分界线
        String[] arrstr = s.split(" ");
        int[] arr = new int[arrstr.length];
        for (int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(arrstr[i]);
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for (int i=0;i<arr.length;i++){
            arrstr[i] = String.valueOf(arr[i]);
            s1 = s1 + arr[i];
            s1= s1 +" ";
        }
        System.out.println(s1);





    }
}
