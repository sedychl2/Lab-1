import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class Labfirst
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c, int d)

    {
        int minimum = a < b ? a : b;
        minimum = minimum < c ? minimum : c;
        minimum = minimum < d ? minimum : d;
        return minimum;
    }
}
