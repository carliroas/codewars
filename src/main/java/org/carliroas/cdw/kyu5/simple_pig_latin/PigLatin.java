package org.carliroas.cdw.kyu5.simple_pig_latin;

public class PigLatin {
  
   /**
   *   
   * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
   * 
   * @param str
   * 
   * @return String
   */
    public static String pigIt(String str) {
      
        String[] cadenas = str.split("\\b");
    
        StringBuilder response = new StringBuilder();

        for (String cadena : cadenas)
        {			
            if(cadena.matches("\\w+"))
            {
                if(cadena.length() == 1)
                {
                    response.append(cadena + "ay");
               
                }
                else
                {
                    response.append(cadena.substring(1) + cadena.charAt(0) + "ay");
                }
            }
            else
            {
                response.append(cadena); 
            }
        }

        return response.toString();

    }
}