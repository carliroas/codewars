package org.carliroas.cdw.kyu5.human_readable_time;

import java.time.LocalTime;

/* DESCRIPTION:
* Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

* HH = hours, padded to 2 digits, range: 00 - 99
* MM = minutes, padded to 2 digits, range: 00 - 59
* SS = seconds, padded to 2 digits, range: 00 - 59
* The maximum time never exceeds 359999 (99:59:59)
* @param seconds
* 
* @return String
*/

public class HumanReadableTime {
	
   /* DESCRIPTION:
   * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

   * HH = hours, padded to 2 digits, range: 00 - 99
   * MM = minutes, padded to 2 digits, range: 00 - 59
   * SS = seconds, padded to 2 digits, range: 00 - 59
   * The maximum time never exceeds 359999 (99:59:59)
   * @param seconds
   * 
   * @return String
   */
	
  public static String makeReadable(int seconds) {
	  
    
    // create a LocalTime object
    LocalTime time = LocalTime.parse("00:00:00");
			
    LocalTime value = time.plusSeconds(seconds); 
    
    int hours =   seconds  / 3600;
    
    
    String humanTime = String.format("%02d:%02d:%02d",hours,value.getMinute(), value.getSecond());

        
    return humanTime;
	
    
  }
}