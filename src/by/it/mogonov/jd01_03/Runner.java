package by.it.mogonov.jd01_03;


import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double[] array = InOut.getArray(str);
        InOut.printArray(array);
        InOut.printArray(array, "v", 3);

        Helper.findMin(array);
        Helper.findMax(array);
        Helper.sort(array);
        System.out.println();

    }


}