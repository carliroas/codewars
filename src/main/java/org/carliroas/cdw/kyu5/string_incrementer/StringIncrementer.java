package org.carliroas.cdw.kyu5.string_incrementer;

public class StringIncrementer {
  public static String incrementString(String str) {
    
    String numeric = "";
    String noNumeric = "";
	
	  if (str.equals("") || !str.substring(str.length()-1, str.length()).chars().allMatch( Character::isDigit ))
	  {
		   return str +1;
	  }
    

    for(int i=0; i < str.length(); i++)
	  {
       if(str.substring(i, str.length()).chars().allMatch( Character::isDigit ))
       {
          numeric = str.substring(i, str.length());
          noNumeric = str.substring(0,i);
          break;
       }
    }

    
    
    StringBuilder sb = new StringBuilder();
    
    int q = 0;
    
    for(int p = numeric.length() -1; p > -1; p--)
    {
        char result = numeric.charAt(p);
              
        if( result < '9')
        {
          result++;
          sb.append(result);
          q = p;
          break;
        }
        else if( result == '9')
        {
          sb.append("0");
          
          if( p == 0)
          {
            sb.append("1");
          }
        }
        q = p;
    }
        
    return noNumeric + numeric.substring(0,q) + sb.reverse().toString();
  }
}