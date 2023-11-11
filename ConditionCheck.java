package test;

public class ConditionCheck 
{
	void meth1()
	{
		System.out.println("implemention started..");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("loop come out");
	}

	public static void main(String[] args) 
	{
		new ConditionCheck().meth1();
	

	}

}
