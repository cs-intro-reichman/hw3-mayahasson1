

public class Algebra {
	public static void main(String args[]) {
		

	   
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	public static int plus(int x1, int x2)
		{
		int result =x1;
		if(x2>=0)
		{
				while(x2>0)
				{
					result++;
					x2--;
				}
		}
		else
		{
			while(x2<0)
				{
				result--;
				x2++;
				}
		}
		return result;
	}

	
	public static int minus(int x1, int x2)
	{
		int result =x1;
		if(x2>=0)
		{
				while(x2>0)
				{
					result--;
					x2--;
				}
		}
		else
		{
			while(x2<0)
				{
				result++;
				x2++;
				}
		}
		return result;
	}
	public static int times(int x1, int x2) {
    int result = 0;
    boolean negative = false;
    if (x1<0) 
	{
        x1 = minus(0,x1);
        negative = !negative;
    }
    if (x2<0) 
	{
        x2 =minus(0,x2);
        negative = !negative;
    }

    while (x2>0) 
	{
        result=plus(result,x1);
        x2--;
    }

    if (negative) 
	{
        result= minus(0,result);
    }

    return result;
}


	public static int pow(int x, int n) {
		int result=1;
		if (n<0)
		 {
        return 0; 
    	}
		if(n==0)
		{
			return 1;
		}
		while(n>0) 
			{
				result=times(result,x);
				n--;
			}
		return result;
	}

	
	public static int div(int x1, int x2) {
    if (x2==0)
	 	{
        throw new ArithmeticException("Division by zero");
    	}
    int count = 0;
	boolean negative = false;
	if (x1 < 0) 
	{
        x1=minus(0,x1);
        negative = !negative;
    }
    if (x2 < 0)
	{
        x2=minus(0,x2);
        negative = !negative;
    }
    while (x1>= x2) 
		{
        x1= minus(x1,x2);
        count++;
    	}
		if(negative) 
		{
        count=minus(0,count);
    	}
    return count;
}

	
	public static int mod(int x1, int x2) {
		if(x2==0)
		{
			throw new ArithmeticException("Modulo by zero");
		}
		if(x1==0)
		{
			return 0;
		}
		if(x1<x2)
		{
			return x1;
		}
		else
		{
			while(x1>=x2)
			{
				x1=minus(x1,x2);
			}
		}
		return x1;
	}	

	
	public static int sqrt(int x) {
		int i=1;
		if (x<0) 
		{
        throw new ArithmeticException("Negative input");
    	}
		while(times(i,i)<=x)
		{
			i++;
		}
		i--;
		return i;
	}	  	  
}