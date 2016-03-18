package softwareTest;
import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


	
	@RunWith(Parameterized.class)
	public class TestPara
	{
		private int input1;
		private int input2;
		private int input3;
		private String expected;
		private TriangleDetect t;
		public TestPara(int input1,int input2,int input3,String expected){
			this.input1 = input1;
			this.input2 = input2;
			this.input3 = input3;
			this.expected = expected;
			} 
		@Before
		public void setUp(){
			t = new TriangleDetect();
			}
		@Parameters
		public  static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
		{1,1,1,"equilateral"},
		{2,3,3,"isosceles"},
		{3,5,7,"scalene"}
		});
		}
		@Test
		public void testTri() {
			assertEquals(this.expected,t.test(input1, input2, input3));
			}
		
	}
	

