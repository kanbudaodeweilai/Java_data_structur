package Java_data_structur.SparseArray;

public class XingZhuang {
    public void xingzhuang(int[][] arr){
        for (int[] a:arr){
            for (int b:a){
                System.out.printf("%d\t",b);
            }
            System.out.println();


        }
        Save s = new Save();
        s.save(arr);
        System.out.println("保存成功");
    }
}
