public class Calculator
{	public int add(int a, int b)
	{
		return (a+b);
	}
	public  int substract(int a, int b)
	{
		return (a-b);
	}
	public int multiplication(int a, int b)
	{
		return (a*b);
	}
	public static void main()
	{
		Calculator c = new Calculator();
		int add = c.add(10,20);
	}
}
