package two_stage.day04.Exception;

public class ExceptionDemo01 {
    public static void main(String[] args) {

        System.out.println("start");
//        int[] arr = {1,2,3};
//        System.out.println(arr[3]);
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("你访问的不存在");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("end");

    }
}
