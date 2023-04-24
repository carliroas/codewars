package org.carliroas.cdw.kyu5.prod_consecutive_fib_num;

public class ProdFibTest {

	@Test
	public void test1() {
		long[] r = new long[] {55, 89, 1};
		assertArrayEquals(r, ProdFib.productFib(4895));
	}
	@Test
	public void test2() {
		long[] r = new long[] {89, 144, 0};
		assertArrayEquals(r, ProdFib.productFib(5895));
	}
}