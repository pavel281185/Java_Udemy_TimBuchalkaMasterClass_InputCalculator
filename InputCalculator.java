import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        boolean valid = true;
        while(valid){
            try{
                sum += Integer.parseInt(scanner.nextLine());
                count++;
            }catch(NumberFormatException e){
                System.out.println("SUM = " + sum + " AVG = " + Math.round((float)sum/count));
                valid = false;
            }
        }
    }
}
