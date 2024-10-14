public class Buc_eje1
{
    public static void main(String[] args)
    {
        System.out.println("Números perfectos entre 1 y 1000:");
        for (int i = 1; i <= 1000; i++)
        {
            int sumaDivisores = 0;
            for (int j = 1; j < i; j++)
            {
                if (i % j == 0)
                {
                    sumaDivisores += j;
                }
            }
            if (sumaDivisores == i)
            {
                System.out.println(i);
            }
        }
    }
}
