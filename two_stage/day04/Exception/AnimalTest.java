package two_stage.day04.Exception;

import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        AnimalCheck an = new AnimalCheck();
        try {
            an.check(a);
        } catch (AnimalException e) {
            e.printStackTrace();
        }
    }

}
