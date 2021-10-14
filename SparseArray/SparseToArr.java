package Java_data_structur.SparseArray;

public class SparseToArr {
    public void sparseToArr(int[][] sparse){
        int[][] arr =new int[sparse[0][0]][sparse[0][1]];
        for (int i=1;i<sparse[0][2];i++){
            arr[sparse[i][0]][sparse[i][1]]=sparse[i][2];

        }
        System.out.println("转换成功");
        XingZhuang xz = new XingZhuang();
        xz.xingzhuang(arr);
    }
}
