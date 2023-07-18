import java.util.Scanner;

public class DecimalToBase {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Decimal number !!!");
        int decimal=scanner.nextInt();

        System.out.println("Enter the base number !!!");
        int base=scanner.nextInt();

        String binary=getDecimal(decimal,base);

        System.out.println(binary);

    }

    private static String getDecimal(int decimal, int base) {
        String str=" ";
        while(decimal>0){
            str+=decimal%base;
            decimal/=base;
        }

        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}