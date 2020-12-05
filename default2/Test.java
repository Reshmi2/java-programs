package default2;

public class Test implements Left, Right {
	public void m1()
	{
		System.out.println("test class method");
	}
	public static void main(String s[])
	{
		Test t=new Test();
		t.m1();
	}

}
