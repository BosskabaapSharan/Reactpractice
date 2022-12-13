class sp1
{
	public static void main(String[] args) 
	{
		int n=10;
		int f1=0, f2=1, f3=0;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=1; i<=n-2; i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;

		
		System.out.println(f3);
		}
	}
}
