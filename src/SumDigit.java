import service.NumericService;

public class SumDigit {


    public static void main(String[] args) {
        int result1 = NumericService.getSumByTypes(123456);
        int result2 = NumericService.getSumByMath(123456);

        System.out.println(result1);
        System.out.println(result2);


    }
}