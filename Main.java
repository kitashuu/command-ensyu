import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("身長を入力してください (メートルで 1.75)");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("体重(キログラムで)");
        double weight = Double.parseDouble(scanner.nextLine());
        double BMI = 0;
        BMI = weight / (height * height);
        BMI = BMI * 100;
        int num  = (int)BMI;
        BMI = ((double)num/100);
        System.out.println(BMI);
    }
}
