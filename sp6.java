class sp6 
{
	public static void main(String[] args) 
	{
		int num=1234;
		while (num!=0)
		{
			int d=num%10;
			if (d%2==0)
			System.out.println(d);
			num=num/10;
		}
	}
}
