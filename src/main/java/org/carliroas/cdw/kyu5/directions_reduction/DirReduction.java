package org.carliroas.cdw.kyu5.directions_reduction;

import java.util.List;
import java.util.ArrayList;

public class DirReduction {
	
	/*Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).*/
    public static String[] dirReduc(String[] arr) {
      
     List<String> directions = new ArrayList();
      
      for (int i=0; i < arr.length; i++){
        
        directions.add(arr[i]);
      }
        
	    int i = 0;
      
      while(directions.toString().contains("NORTH, SOUTH") || directions.toString().contains("SOUTH, NORTH")
           || directions.toString().contains("EAST, WEST") || directions.toString().contains("WEST, EAST"))
      {
      
          
          if( i + 1 < arr.length)
          {
            if(
              (directions.get(i).equals("WEST") && directions.get(i+1).equals("EAST") 
               || directions.get(i).equals("EAST") && directions.get(i+1).equals("WEST"))
              ||
              (directions.get(i).equals("NORTH") && directions.get(i+1).equals("SOUTH") 
               || directions.get(i).equals("SOUTH") && directions.get(i+1).equals("NORTH"))
            )
            {
                      
              directions.remove(i+1);
              directions.remove(i);
                              
              i = 0;             
              continue;
            }
          }
          
          if((i + 1) == arr.length)
          {
            i=0;
          }
          else
		      {
		        i++;
		      }
      }
      
      return directions.toArray(new String[directions.size()]);
    }
}