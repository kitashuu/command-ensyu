import java.util.Scanner;

public class Bmi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("身長を入力してください (メートルで 1.75)");
        double height1 = Double.parseDouble(scanner.nextLine());
        double height3 = Double.parseDouble(scanner.nextLine());
        System.out.println("体重(キログラムで)");
        double weight1 = Double.parseDouble(scanner.nextLine());
        double weight2 = Double.parseDouble(scanner.nextLine());
        double BMI1 = 0;
        double BMI2 = 0;
        BMI1 = weight1 / (height1 * height1);
        BMI2= weight2 / (height3 * height3);
        BMI1 = BMI1 * 100;
        BMI2 = BMI2 * 100;
        int num1 = (int)BMI1;
        int num2 = (int)BMI2;
        BMI1 = ((double)num1/100);
        BMI2 = ((double)num2/100);

        System.out.println(BMI1);
        System.out.println(BMI2);
    }
}
