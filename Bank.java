import java.util.Scanner;
class Bank
{
String branch;
String bankname;
int pincode;
Account a;
Bank(String branch,String bankname, int pincode)
{
this.branch=branch;
this.bankname=bankname;
this.pincode=pincode;
}

public void createaccount()
{
Scanner s= new Scanner(System.in);
System.out.println("enter the account holder name");
String d= s.next();
System.out.println("enter the account number");
long a1 =s.nextLong(); 
System.out.println("enter the ifsc");
int a2 =s.nextInt();
System.out.println("enter the balance");
double a3 =s.nextDouble();
this.a = new Account(d,a1,a2,a3);
System.out.println("Account is created");

}
public void Accountdetails()
{
System.out.println(a.acname);
System.out.println(a.acno);
System.out.println(a.ifsc);
System.out.println(a.balance);
}
public void deleteaccount()
{
this.a=null;
}
}
