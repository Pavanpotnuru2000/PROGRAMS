package banking_management_system;
public class Bmain
{
		private int id;
		private String account_holder;
		private int balance_amount;
		private String password; 
		public void setid(int id)
		{
			this.id = id;
		}
		public void set_account_holder(String name)
		{
			this.account_holder = name;
		}
		public void set_balance_amount(int a)
		{
			this.balance_amount = a;
		}
		public void set_password(String p)
		{
			this.password = p;
		}
		public String getname()
		{
			return account_holder;
		}
		public int getbalance()
		{
			return balance_amount;
		}
		public String getpassword() {
			return password;
		}
}
