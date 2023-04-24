package org.carliroas.cdw.kyu5.weight_for_weight;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;


public class WeightSort {
	
	public static String orderWeight(String strng) {
    
    if(strng.equals(""))
    {
      return "";
    }
    
    String [] weights = strng.split(" ");
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    
    int [] sum2 = new int[weights.length];
    
    for(int i=0; i < weights.length; i ++)
    {
      int sum =0;
      
      for(int j=0; j < weights[i].length(); j++)
      {
        sum = sum + Integer.parseInt(String.valueOf(weights[i].charAt(j)));
      }
      
      int sums = sum;
 
      boolean found = Arrays.stream(sum2).anyMatch(n -> n == sums);
      
      if(!found)
      {
         sum2[i] = sum;
      }     
      list1.add(sum + ":" + weights[i]);
    }
    
    Collections.sort(list1);
    

    Arrays.sort(sum2);

    
    for(int k=0; k < sum2.length; k++)
    {
          
      
          for(String lis: list1)
          {
            String [] li = lis.split(":"); 

            
            if(sum2[k] == Integer.parseInt(li[0]))
            {            
              list2.add(li[1]);
            }
          }
    }
    
    String separatedNumbers = list2.stream()
     .map(i -> i.toString())
     .collect(Collectors.joining(" "));
    

    return separatedNumbers;
    
	}
}