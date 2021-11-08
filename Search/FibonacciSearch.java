package Java_data_structur.Search;

import java.util.Arrays;

public class FibonacciSearch {
    public static int maxsize=20;
    public static void main(String[] args) {
        int[] arr={1,8,10,89,1000,1234};
        System.out.println(fibonacciSearch(arr,89));

    }
    public static int[] fib(){
        int[] f= new int[maxsize];
        f[0]=1;
        f[1]=1;
        for (int i=2;i<f.length;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f;
    }

    public static int fibonacciSearch(int[] arr,int key){
        int low = 0;
        int high =arr.length-1;
        int k = 0;//斐波那契分割数值的下标记
        int mid = 0;//存放mid值
        int[] f = fib();//获取斐波那契数列
        while (high>f[k]-1){
            k++;
        }
        int[] temp = Arrays.copyOf(arr,f[k]);
        for (int i =arr.length;i<temp.length;i++){
            temp[i]=arr[arr.length-1];
        }
        while (low<=high){
            mid=low+f[k-1]-1;
            if (key<temp[mid]){
                high=mid-1;
                k--;
            }else if (key>temp[mid]){
                low=mid+1;
                k-=2;
            }else {
                if (mid<=high){
                    return mid;
                }else {
                    return high;
                }

            }
        }
        return -1;
    }
}
