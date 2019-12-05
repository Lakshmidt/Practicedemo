package practice;

interface I
{
	void add();
}
interface Id
{
	void disp();
}

public class B implements I,Id{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I i=new B();
		i.add();
		Id i1=(Id)i;
		i1.disp();
	}
	public void add() {
		System.out.println("hiih");
	}
	public void  disp()
	{
		System.out.println("Disp");
	}
}
