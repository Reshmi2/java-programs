package lambdaex5;

public class Test {
	
		int x=21;
		public void m2()
		{
			Interf i=()->{
				int x=345;
				System.out.println(x);
				System.out.println(this.x);
			};
			i.m1();
			}
		public static void main(String[] args) 
		{
			Test t=new Test();
			t.m2();
	}

}
