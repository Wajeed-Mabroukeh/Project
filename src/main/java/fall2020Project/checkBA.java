package fall2020Project;

public class checkBA {

	private int runningTotal=0; 

	public void add(Integer int1, String string, int price) {
		// TODO Auto-generated method stub
		if(string =="banana")
		{
		   runningTotal+=int1.intValue()*price;
		}
		else if(string =="apple")
		{
			  runningTotal+=int1.intValue()*price;
		}
	}
	
	public int  Total()
	{
		return runningTotal;
	}

	
}
