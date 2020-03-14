package interfaceconcepts;

public class developing implements bankingclient,domain {
	public static void main(String[]args)
	{
		developing d =new developing();
		d.checkingbalance();
		d.paycreditcard();
		bankingclient dr =new developing();
		dr.checkingbalance();//runtime polymorphism
		domain ds = new developing();
		ds.investment();//runtime polymorphism
	}
	public void paycreditcard()
	{
		System.out.println("paid creditcard");
	}
	public void transferbalance()
	{
		System.out.println("transferedbill");

	}
	public void checkingbalance()
	{
		System.out.println("checkedbalance");

	}
	public void login()
	{
		System.out.println("logged in");

	}
	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println("invested");

	}

}

