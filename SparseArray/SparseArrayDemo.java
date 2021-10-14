package Java_data_structur.SparseArray;

public class SparseArrayDemo {
    public static void main(String[] args) {
        int[][] arr = new int[11][11];
        arr[1][2]=1;
        arr[2][3]=2;
        XingZhuang xz = new XingZhuang();
        xz.xingzhuang(arr);

        ArrToSparse ats = new ArrToSparse();
        ats.arrTosparse(arr);


        int[][] sparse = new int[3][3];
        sparse[0][0]=10;
        sparse[0][1]=18;
        sparse[0][2]=3;
        sparse[1][0]=2;
        sparse[1][1]=3;
        sparse[1][2]=95;
        sparse[2][0]=8;
        sparse[2][1]=10;
        sparse[2][2]=88;

        SparseToArr st = new SparseToArr();
        st.sparseToArr(sparse);


    }


}
