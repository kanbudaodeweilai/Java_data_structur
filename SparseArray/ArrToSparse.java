package Java_data_structur.SparseArray;

public class ArrToSparse {
    public void arrTosparse(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int value=0;
        for (int[] i:arr){
            for (int j:i){
                if (j!=0){
                    value=value+1;
                }
            }
        }

        int[][] sparse=new int[value+1][3];
        int k=0;
        sparse[k][0]=row;
        sparse[k][1]=col;
        sparse[k][2]=value;
        k=k+1;
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (arr[i][j]!=0){
                    sparse[k][0]=i;
                    sparse[k][1]=j;
                    sparse[k][2]=arr[i][j];
                    k+=1;
                }
            }
        }

        System.out.println("转换完成");
        XingZhuang xz = new XingZhuang();
        xz.xingzhuang(sparse);
    }


}
