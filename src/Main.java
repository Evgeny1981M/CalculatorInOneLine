import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Введите выражение ");
        String virazhenie=scanner.nextLine();
        char [] symbols=new char[virazhenie.length()];
        for(int i=0;i<symbols.length;i++){
            symbols[i]=virazhenie.charAt(i);
        }
       int firstNum=Character.getNumericValue(symbols[0]);
       int secondNum=Character.getNumericValue(symbols[2]);
        if (symbols[1]=='+') {
            System.out.println(firstNum+secondNum);
        }
    }
}