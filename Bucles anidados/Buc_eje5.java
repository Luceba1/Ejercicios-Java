public class Buc_eje5
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 100000; i++)
        {
            String numero = String.format("%05d", i).replace('3', 'E');
            System.out.println(numero);
        }
    }
}
