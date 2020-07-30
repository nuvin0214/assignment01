object q3andq4{

	class Account(id: String, num: Int, bal: Double){
		 private val nic: String = id;
		 private val accNum: Int = num;
		 private var accBalance: Double = bal;

		 def getNIC = this.nic;
		 def getAccNum = this.accNum;
		 def getAccBalance = this.accBalance;

		 def deposit(amount: Double) = this.accBalance = this.accBalance + amount;
		 def withdraw(amount: Double) = this.accBalance = this.accBalance - amount;
		 def transfer(that: Account, amount: Double) = {this.withdraw(amount); that.deposit(amount);}
		 override def toString = nic + " : " + accNum.toString + " : Rs." + accBalance.toString;


	}

	def main(args: Array[String]): Unit = {
		println("-------------------------------------");
		println("question 03");
		println("-------------------------------------\n");

		val a1 = new Account("982648912V", 1000001, 134.5);
		val a2 = new Account("941143041V", 1000002, 432.75);
		printf("Account A1 = %s\nAccount A2 = %s\n\n", a1.toString, a2.toString);
		printf("Transfer Rs.100 from account 1000002  to account 1000001:\n");
		a2.transfer(a1, 100);
		printf("\t%s\n\t%s\n", a1.toString, a2.toString);

		println("-------------------------------------");
		println("question 04");
		println("-------------------------------------\n");

		//This list will be used repeatedly to test the functions
		var bank:List[Account] = List(
			a1,
			a2,
			new Account("960453581V", 1000003, -302.75),
			new Account("960450884V", 1000004, 14320.90),
			new Account("890453581V", 1000005, -50.23),
			new Account("800453581V", 1000006, 15900)
		);
		//Bank functions
		val overdraft = (b: List[Account]) => b.filter(x => x.getAccBalance < 0);
		val balanceSum = (b: List[Account]) => b.reduce((x, y) => new Account("Total Balance", 999999, x.getAccBalance + y.getAccBalance));
		val interest = (b: List[Account]) => b.map(x => if (x.getAccBalance < 0) new Account(x.getNIC, x.getAccNum, (x.getAccBalance * 1.1)) else new Account(x.getNIC, x.getAccNum, (x.getAccBalance * 1.05)));

		printf("\nBank functions will be tested on this list of accounts;\n\t%s\n", bank.mkString("\n\t"));
		printf("\nResult after filtering accounts with negetive values;\n\t%s\n", overdraft(bank).mkString("\n\t"));
		printf("\nResult after calculating total balance;\n\t%s\n", balanceSum(bank).toString);		
		printf("\nResult after applying interest;\n\t%s\n", interest(bank).mkString("\n\t"));

	}

}