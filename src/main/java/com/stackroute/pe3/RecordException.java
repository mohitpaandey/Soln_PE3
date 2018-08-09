package com.stackroute.pe3;

public class RecordException {

	public String testNPEx() {
		int[] data = null;
		try {
			int len = data.length;throw new NullPointerException("java.lang.NullPointerException");
		}
		catch(NullPointerException ex) {
			ex.getMessage();
		}
		return ("java.lang.NullPointerException");
	}
	public String testNPE() {
		 String ptr = null;
		try
        {
			 if (ptr.equals("gfg"))
            throw new NullPointerException("NullPointerException Occured");
        }
        catch(NullPointerException ex)
        {
        	return ex.getMessage();
          }
		return ("NullPointerException Occured");
	
	}
	public String testIOBE() {
		int[] arr = new int[4];
		try
        {
            int i = arr[4];
            throw new ArrayIndexOutOfBoundsException("IndexOutOfBoundsException Occured");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
        	return ex.getMessage();
        }
	}

	public String testNASE()throws NegativeArraySizeException{
	
		try {
			int dimension=-1;
			int arr[]=new int[dimension]; 
		if (arr.length<0)
			throw new NegativeArraySizeException("NegativeArraySizeException Occured");
		
	}
		catch(NegativeArraySizeException ex)
		{
			 return ex.getMessage();
		}	
		return ("NegativeArraySizeException Occured");
	}
}
