package BasicPrograms;

public class Prime {
	public static void main(String[] args) {
		int n=10;
		boolean flag= false;
		
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
        if(!flag)
        {
        	System.out.println(n+"prime number");
        }
        else
        {
        	System.out.println(n+"not prime number");
        }
	}

}
