package project;

public class Diff {

public double variation(String s,Double e,String aut)
{
	
	if(s.equals("SM"))
	{
		return(1200*e);
	}
	else if(s.equals("ASM"))
	{
		return(1500*e);
	}
	else 
	{
		if(aut.equals("FAH"))
		{
			return(2500*e);
		}
		else
		{
			return(1800*e);
		}
		
	}
	
	
	
	
}
	
}
