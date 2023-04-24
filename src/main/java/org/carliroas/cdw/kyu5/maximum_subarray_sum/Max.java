package org.carliroas.cdw.kyu5.maximum_subarray_sum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


/*The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of /*integers:

*Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
* should be 6: {4, -1, 2, 1}
*Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

*Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.*/

public class Max {
  public static int sequence(int[] arr) {
    
    List<Integer> sum = new ArrayList<Integer>();
    
    int suma1= 0;
    int suma2 = 0;
    
    for(int i=0; i < arr.length; i++)
    {
      
      //a la izquierda
      for(int j=i; j >= 0; j--)
      {
        suma1 = suma1 + arr[j];
          
        sum.add(suma1);
      }
      
      for(int k=i; k < arr.length; k ++)
      {
        suma2= suma2 + arr[k];
        
        sum.add(suma2);
      }
      
      suma1 =0;
      
      suma2 =0;
      
    }
    
    
    int maxim = 0;
    
    if(arr.length > 0)
    {
      maxim = sum.stream().max(Integer::compare).get();
    }
    
    if(maxim < 0)
    {
      maxim = 0;
    }
    
    return maxim;
  }
}