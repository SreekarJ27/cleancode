package project;
import java.lang.*;
public class base {
	double amo,in,per;
	base(double amo,double in,double per)
	{
		this.amo=amo;
		this.in=in;
		this.per=per;
	}
	public double si()
	{
		return((amo*in*per));
	}
	public double ci()
	{
	return ((amo*(Math.pow(1+(in/100), per)))-amo);
	
		
		
	}
	
	}


