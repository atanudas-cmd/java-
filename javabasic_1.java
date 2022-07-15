//How to create a class, object, method and its signature//

class Person{
	int age;
	String name;

	void value()
		{
		age=25;
		name="Atanu";
		}
	void value1()
	{
		System.out.println("Age is: "+age);	
		System.out.println("Name is: "+name);
	}
	public static void main(String a[])
	{
		Person obj=new Person();
		obj.value();
	}
}