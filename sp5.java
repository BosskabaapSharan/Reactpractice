class sp5 
{
	public static void main(String[] args) 
	{
		int num=1234;
		int x=1;
		while(num!=0)
		{
			int d=num%10;
			x=d*x;
			num=num/10;
		}
		System.out.println(x);
	}
}
