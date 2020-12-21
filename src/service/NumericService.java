package service;
public class NumericService {
    //=============== 3.1
    public static int getSumByTypes(int number) {
        int result = 0;
        String str = Integer.toString(number);
        char[] simvol = str.toCharArray();
        for (int i = 0; i < simvol.length; i++) {
            result = result + simvol[i];
        }
        return result;
    }

    //=============== 3.2
    public static int getSumByMath(int number) {
        int result = 0;

        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}