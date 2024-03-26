 class X extends Exception{

	 
	 
		  X(String meassege)
		  {
			 super(meassege);
			   
			  
		  }
	  
}

class UserExp
{
	 public static void main(String args[]) 
	 {
		 int x;int y;
		    y=200;x=1;
		   try
		   {
			   int r=x*y;
			   if(r>=100)
			   {
				   throw new X("You Are Right Person");
			   }
		   }
             catch(X e)
                {
		   
		   System.out.println("Exception is Caught");
		   System.out.println(e.getMessage());
        	 }
	 }
}
