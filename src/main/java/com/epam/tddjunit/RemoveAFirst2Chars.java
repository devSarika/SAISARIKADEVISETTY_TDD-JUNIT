package com.epam.tddjunit;

public class RemoveAFirst2Chars {

	public String removeA(String string) {
		// TODO Auto-generated method stub
		
		String temp="",result="";
		
			for(int count=0;count<2 && count<string.length();count++)
			{
				char first2chars=string.charAt(count);
				if(first2chars!='A')
					temp+=string.charAt(count);
			}
			for(int count=2;count<string.length() && count<string.length();count++)
			{
				result+=string.charAt(count);
			}
		
		
		return temp+result;
	}

}
