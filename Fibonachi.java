public class Fibonachi
{
    public void fillArrayFibonachi(int[] mas)
    {
        int i;
        mas[0] = 0;
        mas[1] = 1;

        for (i = 2; i < mas.length; i++)
        {
            mas[i] = mas[i-1] + mas[i-2];
        }
    }
    public void consoleArrayFibonachi(int[] mas)
    {
        System.out.println("Масив чисел Фібоначчі:");
        for (int i = 0; i < mas.length; i++) System.out.print(mas[i] + " ");
    }
    public void checkFibonachiNumbers(int[] mas)
    {
        System.out.println(" ");
        double result = 0;
        for (int i = 0; i < mas.length; i++)
        {
            result = mas[i];
            result -= 1;
            result = Math.cbrt(result);
            if (result % 1 == 0) System.out.println("Це число " + mas[i] + " можна представити як w^3 + 1");
        }
    }

}
