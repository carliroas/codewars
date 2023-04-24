package org.carliroas.cdw.kyu5.rgb_to_hex_conversion;

public class RgbToHex {
	
	/* The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.

    * Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
  
    */
    public static String rgb(int r, int g, int b) {
      
      int rMod = r;
      int gMod = g;
      int bMod = b;
      
      if(r <0)
        rMod = 0;
      if(r> 255)
        rMod = 255;
      
      if(g <0)
        gMod = 0;
      if(g> 255)
        gMod = 255;
      
      if(b <0)
        bMod = 0;
      if(b> 255)
        bMod = 255;
      
            
      return String.format("%02X%02X%02X", rMod , gMod , bMod);
    }
}
