package banking_management_system;
import java.util.Scanner;

	public class Banking_Services {
		Scanner scan = new Scanner(System.in);
		String name,password,enname,enpassword,string_user1,string_user2;
		int id = 1000,balance_amount,dmoney,wmoney,string_money1,string_money2,option,j = 0;
		Bmain b[] = new Bmain[5];
		public void add_account()
		{
			Bmain o = new Bmain();
			System.out.println("please enter the name");
			name = scan.nextLine();
			System.out.println("please enter the password you want to set");
			password = scan.nextLine();
			System.out.println("please enter the min deposit for creating of bank account");
			balance_amount = scan.nextInt();
			o.set_account_holder(name);
			o.set_password(password);
			o.set_balance_amount(balance_amount);
			o.setid(id);
			b[j] = o;
			j++;
			id++;
			System.out.print("registered successfully");
		}
		public void add_balance()
		{
			System.out.println("please enter your bank account name");
			enname = scan.nextLine();
			Bmain o1 = new Bmain();
			for(int i = 0;i<5;i++)
			{
				o1 = b[i];
				string_user1 = o1.getname();
				string_user2 = o1.getpassword();
				if(string_user1.equals(enname)&&(string_user2.equals(enpassword)))
				{
					System.out.println("enter your deposit amount please");
					dmoney = scan.nextInt();
					string_money1 = o1.getbalance();
					string_money1 = string_money1 + dmoney;
					o1.set_balance_amount(string_money1);
					System.out.println("deposited succesfully");
				}
			}
		}
		public void withdraw_balance()
		{
			System.out.println("please enter your bank account name");
			enname = scan.nextLine();
			Bmain o1 = new Bmain();
			for(int i = 0;i<5;i++)
			{
				o1 = b[i];
				string_user1 = o1.getname();
				string_user2 = o1.getpassword();
				if(string_user1.equals(enname)&&(string_user2.equals(enpassword)))
				{
					System.out.println("enter your withdraw amount please");
					wmoney = scan.nextInt();
					string_money2 = o1.getbalance();
					if(string_money1 < wmoney)
					{
						System.out.println("sorry requested withdraw money is more than available balance");
					}
					else
					{
						string_money1 = string_money1 - wmoney;
						o1.set_balance_amount(string_money2);
						System.out.println("withdraw amount"+string_money2);
					}				
				}
			}
		}
		public void check_balance()
		{
			System.out.println("please enter your bank account name");
			enname = scan.nextLine();
			Bmain o1 = new Bmain();
			for(int i = 0;i<5;i++)
			{
				o1 = b[i];
				string_user1 = o1.getname();
				string_user2 = o1.getpassword();
				string_money1  = o1.getbalance();
				if(string_user1.equals(enname)&&(string_user2.equals(enpassword)))
				{
					System.out.println("your balance is"+string_money1);
				}
			}
		}
		public void delete_account()
		{
			System.out.println("enter the name of the account you want to delete");
			enname = scan.nextLine();
			Bmain o1 = new Bmain();
			for(int i = 0;i<5;i++)
			{
				o1 = b[i];
				string_user1 = o1.getname();
				if(enname == string_user1)
				{
					o1.set_account_holder(null);
					o1.set_password(null);
					o1.set_balance_amount(0);
					o1.setid(0);
				}
			}
		}
		public void menu()
		{
			System.out.println("-----------------------------------------");
			System.out.println("        welcome to PAVANBANK             ");
			System.out.println("-----------------------------------------");
			System.out.println("1) to register in our bank");
			System.out.println("2) to depositbalance in your account");
			System.out.println("3) to withdraw money from your account");
			System.out.println("4) to delete an account");
			System.out.println("5) to display account balance");
			System.out.println("6) to exit from our bank");
			do
			{
				System.out.println("please choose your option");
				int option =  scan.nextInt();
				switch(option)
				{
				case 1:
					add_account();
					break;
				case 2:
					add_balance();
					break;
				case 3:
					withdraw_balance();
					break;
				case 4:
					delete_account();
					break;
				case 5:
					check_balance();
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("please enter correct option");
				}
			}while(true);
		}
	}
