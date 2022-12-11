import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість чисел Фібоначчі ");
        int n = sc.nextInt();
        int[] mas = new int[n];
        Fibonachi start = new Fibonachi();
        start.fillArrayFibonachi(mas);
        start.consoleArrayFibonachi(mas);
        start.checkFibonachiNumbers(mas);
    }
}