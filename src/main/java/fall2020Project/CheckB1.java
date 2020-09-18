package fall2020Project;

public class CheckB1 {
	
	int priceTotal;
	public void  set(String SS, int P)
	{
		if(SS == "banana")
		{
			priceTotal=P;
		}
	}

	
	public int valueCheck()
	{
		return priceTotal;
	}
}
