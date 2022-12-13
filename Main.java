import java.util.Scanner;
class VegFoodPage 
{
static Scanner sc=new Scanner(System.in);
static int total;
	int dosa=50;
	int vegbiriyani=75;
	int idlivada=35;
	int quantity,ch;
	//vegDetails();
	//vegOrder();
	String again;
	boolean flag=true;


 public void vegDetails()
	{
	System.out.println("*********************** Welcom  to our Bakasura Hotel *********************** ");
	System.out.println("                ==========================================                    ");
	System.out.println("                        1.Dosa                50/-");
	System.out.println("                        2.VegBiriyani         75/-");
	System.out.println("                        3.IdliVada            35/-");
	System.out.println("                        4.Back");
	System.out.println("                ==========================================                    ");
	System.out.println("*********************** what do you want order today  *********************** ");
	}

	public void vegOrder()
	{
	while(flag){
		System.out.println("Enter the choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			{
			System.out.println("You have selected Dosa");
			System.out.println();
			System.out.println("Ener the desired quantity");
			quantity=sc.nextInt();
			total=total+quantity*dosa;
			}
		case  2:
					{
			System.out.println("You have selected Veg Biriyani");
			System.out.println();
			System.out.println("Ener the desired quantity");
			quantity=sc.nextInt();
			total=total+quantity*vegbiriyani;
			}break;
			case  3:
					{
			System.out.println("You have selected Idlivada");
			System.out.println();
			System.out.println("Ener the desired quantity");
			quantity=sc.nextInt();
			total=total+quantity*idlivada;
			}break;
		case 4:
			{
			flag=false;
			System.out.println("Thank you visit again");
		}break;

		}//switch
	}//while
	}//vegorder
}//class




class NonVegFoodPage 
{
static Scanner sc=new Scanner(System.in);
static int total;
int chickenbiriyani=250;
	int eggbiriyani=250;
	int muttonbiriyani=250;
	int quantity,ch;
	//vegDetails();
	//vegOrder();
	String again;
	boolean flag=true;

 public void nonVegDetails()
	{
	System.out.println("*********************** Welcom  to our Bakasura Hotel *********************** ");
	System.out.println("                ==========================================                    ");
	System.out.println("                        1.Chicken Biriyani     250/-");
	System.out.println("                        2.Egg Biriyani         150/-");
	System.out.println("                        3.Mutton Biriyani      350/-");
	System.out.println("                        4.Back");
	System.out.println("                ==========================================                    ");
	System.out.println("*********************** what do you want order today  *********************** ");
	}

	public void nonVegOrder()
	{
	while(flag){
		System.out.println("order dilecious food ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			{
			System.out.println("You have selected chicken biriyani");
			System.out.println();
			System.out.println("Ener the desired quantity");
			quantity=sc.nextInt();
			total=total+quantity*chickenbiriyani;
			}
		case  2:
					{
			System.out.println("You have selected Veg Biriyani");
			System.out.println();
			System.out.println("Ener the desired quantity");
			quantity=sc.nextInt();
			total=total+quantity*eggbiriyani;
			}break;
			case  3:
					{
			System.out.println("You have selected Idlivada");
			System.out.println();
			System.out.println("Ener the desired quantity");
			quantity=sc.nextInt();
			total=total+quantity*muttonbiriyani;
			}break;
		case 4:
			{
			flag=false;
			System.out.println("Thank you visit again");
		}break;

		}//switch
	}//while
	}//vegorder
}//class






class FoodPage 
{
static Scanner sc=new Scanner(System.in);
static NonVegFoodPage nv=new NonVegFoodPage();
//NonVegFoodPage nv1;
static VegFoodPage v=new VegFoodPage();
//VegFoodPage v;
static int total;
void foodPageOperation()
	{
	boolean flag=true;
System.out.println("1.Veg\n2.Non Veg\n3.Back\n Enter the choice");

	while(flag)
		{
		switch(sc.nextInt())
			{
			case 1:
				{
			System.out.println("Veg");
			v.vegDetails();
			v.vegOrder();
			}break;
			case 2:
				{
				System.out.println(" Non Veg");
			nv.nonVegDetails();
				nv.nonVegOrder();
			}break;
		case 3:
			{
			flag=false;
			System.out.println("Thank you visit again");
		}break;

		}//switch
	}//while
	}//foodoperation
}//class



class HomePage
{
	//static FoodPage f=new FoodPage();
static Scanner sc=new Scanner(System.in);
static FoodPage f1=new  FoodPage();
static int total;
void orderFood()
	{
 
System.out.println("1.Order Food\n2.Check biil amount\n3.Cancel the order\n4.Exit\n Enter the choice");
}
void remaining()
	{
boolean x=true;
while(x)
		{
	switch(sc.nextInt())
			{
		case 1:
				{
			f1.foodPageOperation();
			}
		case 2:
			{
		System.out.println();
        System.out.println("*********Thank you for ordering*********");
		System.out.println("Your total bill is : "+total);
			}break;
		case 3:
				{
		System.out.println("Cancel Order");
		total=0;
		}break;
		case 4:
				{
			x=false;
		System.out.println("Visit again");
		
		}break;
	
	}//s

}//w
}//r
}//c


class Bakasura
{
Scanner sc=new Scanner(System.in);
String name,email,pwd;
long phno;
static HomePage h1=new HomePage();
//HomePage h;

void signup()
	{
				System.out.println("Enter the name");
String name=sc.next();
System.out.println("Enter the email id");
String email=sc.next();
System.out.println("Enter the password");
String pwd=sc.next();
System.out.println("Enter the phone number");
long phno=sc.nextLong();
}//s

void login()
	{
System.out.println("Enter the email id");
String e1=sc.next();
System.out.println("Enter the password");
String p1=sc.next();
if(e1.equals(email)&&p1.equals(pwd))
		{
h1.remaining();
}
else
		{
	System.out.println("Invalid Password");
}

}//l

void operation()
	{
System.out.println("1.signup\n2.Login\n3.exit\n Enter the option");
boolean x=true;
while(x)
		{
	switch(sc.nextInt())
			{
		case 1:
				{
signup();
		
		}break;
		case 2:
				{
		login();
		h1.orderFood();
		}break;
		case 3:
				{
		x=false;
		System.out.println("Thank you");
		
		}break;
	}//s
		}//w
}//o

}//c



class Main
	{
public static void main(String[] args)
		{
	Bakasura sp=new Bakasura();
	sp.operation();
	sp.h1.remaining();
	sp.h1.f1.foodPageOperation();

}//p

}//c
