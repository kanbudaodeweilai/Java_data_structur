package Java_data_structur.Sort;

public class RadixSort {
    public static void main(String[] args) {
        int arr[]={53,3,542,748,14,214,1213213};
        radixSort(arr);
        for (int i:arr){
            System.out.println(i);
        }

    }
    public static void radixSort(int[] arr){
        int max = arr[0];
        for (int i:arr){
            if (max<i){
                max = i;
            }
        }
        int maxlength = (max+"").length();

        int T=0;
        for (int m = 0;m<maxlength;m++){
            //需要两个辅助数组；temp用来存放arr里的内容；tempElementCounts用来存放temp二维中的索引
            int[][] temp = new int[10][arr.length];
            int[] tempElementCounts = new int[10];
            for (int i:arr){
                //单独取各个位上的数字
                T=i/(int) Math.pow(10,m)%10;

                temp[T][tempElementCounts[T]++]=i;
            }
            int k=0;
            //temp赋值到arr
            for (int[] i:temp){
                for (int j:i){
                    if (j!=0){
                        arr[k]=j;k++;
                    }
                }
            }
        }

    }
}
