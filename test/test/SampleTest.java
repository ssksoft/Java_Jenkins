// 参考：http://teqspaces.com/JUnit/2

package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {
	@Test
	public void testAppendComma(){
		Sample sample = new Sample();
		String retValue = sample.appendComma("abc");
		assertEquals("abc,", retValue);
		//
	}

}
