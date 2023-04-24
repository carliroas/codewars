package org.carliroas.cdw.kyu5.prod_consecutive_fib_num;

import java.util.ArrayList;
import java.util.List;

public class ProdFib { // must be public for codewars	
	
	public static long[] productFib(long prod) {
    
    List<Long> fibo = new ArrayList<Long> ();
    long [] proFin = new long[3];
    
    
    long camp1 = 0;
    long camp2 = 1;
    
    fibo.add(camp1);
    fibo.add(camp2);

    int i=0;
    
    for(;  fibo.get(i) * fibo.get(i+1) < prod; i ++ )
    {
      fibo.add(fibo.get(i) + fibo.get(i+1));
    }
    
    proFin[0]=fibo.get(i);
    proFin[1]=fibo.get(i+1);
    
    proFin[2] = (fibo.get(i) * fibo.get(i+1)) == prod ? 1:0;
    
    
	return proFin;
   }
}

