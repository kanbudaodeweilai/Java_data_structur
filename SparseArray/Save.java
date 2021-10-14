package Java_data_structur.SparseArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Save {
    public void save(int[][] arr){
        String path = "H:\\java_work\\src\\Java_data_structur\\SparseArray\\Data\\test.txt";

        //创建文件用，存在删除，存在创建
        File file3 = new File(path);
        if(file3.exists()){
            file3.delete();
        }else{
            try{
                file3.createNewFile();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        //打印到文件中
        try {
            PrintWriter pw = new PrintWriter(file3,"UTF-8");
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr[0].length;j++){
                    pw.print(arr[i][j]);


                }
                pw.println();
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
