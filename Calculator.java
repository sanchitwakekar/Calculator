public class Calculator
{	public int add(int a, int b)
	{
		return (a+b);
	}
	public  int substract(int a, int b)
	{
		return (a-b);
	}
<<<<<<< HEAD
	public int divide(int a,int b)
	{
		return (a/b);
	}	
=======
	public int multiplication(int a, int b)
	{
		return (a*b);
	}
>>>>>>> 3c6d39e160a7e08007ce7acadc4d8788e70ed7b1
	public static void main()
	{
		Calculator c = new Calculator();
		int add = c.add(10,20);
		int mul = c.mul(10,20);
	}
}
