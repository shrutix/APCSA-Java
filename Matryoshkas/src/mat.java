//Shruti J period 3
public class mat
{
	private mat insideDoll;
	private boolean nextExist;	//inside doll exists
	
	public mat()
	{
		insideDoll = null;
		nextExist = false;
	}
	
	public void add(mat a)
	{
		insideDoll = a;
		nextExist = true;
	}
	
	public int numberOfMats()
	{
		int i = 1;
		int j = 0;
		mat c = insideDoll.insideDoll;
		while(c.nextExist == true)
		{
			mat b = insideDoll.insideDoll;
			{
				while(b.nextExist  = true)
				{
					i++;
				}
			}
		}
		return i;
		
	}

}
