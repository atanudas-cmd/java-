//Define the local and Global variables with the same name and print both variables and understand the scope of the variables//


public class Var_logo
{
	static int x = 11;
	private int y = 33;
	public void method1(int x)
	{
		Var_logo t = new Var_logo();
		this.x = 22;
		y = 44;

		System.out.println("Var_logo.x: " + Var_logo.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
	}

	public static void main(String args[])
	{
		Var_logo t = new Var_logo();
		t.method1(5);
	}
}

