package service;
public class NumericService {
    //=============== 3.1
    public static int getSumByTypes(int number) {
        int result = 0;
        String text = String.valueOf(number);
        //int [] myArr={6,42,3,1};
        //for (int x = 0; x < myArr.length; x++)
        //char [] text;


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