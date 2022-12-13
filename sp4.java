class sp4 
{
	public static void main(String[] args) 
	{
		int d=1234;
		int x=0;
		while(d!=0)
		{
			int s=d%10;
			x=x+s;
			d=d/10;
		}
		System.out.println(x);

	}
}
