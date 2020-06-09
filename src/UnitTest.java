import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class UnitTest extends TestCase {
	public void testIsEmpty() {
		stack st = new stack();
		boolean result = st.IsEmpty();
		assertTrue(result);
	}
	
	public void testClear() {
		stack st = new stack();
        st.Push("1");
        st.Clear();
        assertEquals(true,st.IsEmpty());
	}
	public void testPop1() {
		stack st = new stack();
		String result = st.Pop();
		assertEquals("4", result);
	}
	public void testPop2() {
		stack st = new stack();
		for (int i = 0; i < 10; i++){
			String s = String.valueOf(i);
            st.Push(s);
        }
        for (int i = 9; i >= 0; i--){
        	String s = String.valueOf(i);
            st.Pop();
            assertEquals(st.Pop(),i);
        }
	}
	
	public void testPush() {
		stack st = new stack();
		//test stack null
		assertNotNull(null, st);
		
	}
	
	public void testPeek1() {
		stack st = new stack();
		st.Push("1");
		st.Push("2");
		String result = st.Peek();
		assertEquals("1", result);
	}
	public void testPeek2() {
		stack st = new stack();
		String result = st.Peek();
		assertEquals("Stack is empty!", result);
	}
	
	public void testContains() {
		stack st = new stack();
		boolean result = st.Contains("5");
		assertFalse(result);
		
	}
	public static void main(String[] args) {
        junit.textui.TestRunner.run(new TestSuite(UnitTest.class));
    }
	
}
