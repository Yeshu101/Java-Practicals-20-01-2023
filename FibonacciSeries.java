class FibonacciSeries
{
	public static void main(String[] arg)
	{
		int a=1;
		int b=2;
		int c;
		for(int i=0;i<=10;++i)
		{
			System.out.println(a);
			c=(a+b);
			a=b;
			b=c;
		}
	}
}