import java.util.*;
class Bank{
static Scanner sc=new Scanner(System.in);
double balance=0;
void deposit()
{
System.out.println("Enter the amount to deposit: ");
double deposit=sc.nextDouble();
balance=balance+deposit;
}
void withdraw()
{
System.out.println("Enter the amount to be withdraw: ");
double withdraw=sc.nextDouble();
if(balance>=withdraw)
{
balance=balance-withdraw;
System.out.println("Withdraw successfully completed");
}
else
System.out.println("The entered amount is not sufficient");
}
void balance()
{
System.out.println("the current balance in the account is: "+balance);
}
void exit()
{
System.out.println("Thank you for visiting state bank of india!");
}
public static void main(String args[])
{
System.out.println("***********************************");
System.out.println("Welcome to State bank of India");
System.out.println("***********************************");

System.out.println("Enter your name: ");
String name=sc.nextLine();
System.out.println("Enter your Adhar number: ");
String adhar=sc.nextLine();
System.out.println("Enter your pan number: ");
String pan=sc.nextLine();
System.out.println("Enter your age: ");
double age=sc.nextDouble();
System.out.println("Enter your mobile number: ");
long mobileno=sc.nextLong();
sc.nextLine();
System.out.println("Enter your emailId: ");
String email=sc.nextLine();
Random r=new Random();
int accno=1000000+r.nextInt(9000000);

System.out.println("The account number is successfully opened: "+accno);
System.out.println("***********************************");
System.out.println("Welcome"+" "+name+" "+"Account number: "+accno);
System.out.println("***********************************");

Bank b=new Bank();
int choice;
do{
System.out.println("\n1.Deposit");
System.out.println("2.Withdraw");
System.out.println("3.Balance");
System.out.println("4.exit");
System.out.println("Enter your choice: ");
choice=sc.nextInt();
switch(choice)
{
case 1:
b.deposit();
break;
case 2:
b.withdraw();
break;
case 3:
b.balance();
break;
case 4:
b.exit();
break;
default:System.out.println("Invalid choice");
}
}while(choice!=4);

}
}


