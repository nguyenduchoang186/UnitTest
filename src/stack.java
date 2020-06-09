import java.util.ArrayList;
import java.util.List;

public class stack implements IStack {
	int top =-1;
	
	ArrayList<String> Stack = new ArrayList<String>();
	@Override
	public void Clear() {
		Stack = new ArrayList<>();
		// TODO Auto-generated method stub
	}

	@Override
	public boolean Contains(String value) {
		// TODO Auto-generated method stub
//		for (String string : Stack) {
//			if(string == value)
//				return true;
//		}
//		return false;
		try {
			if(IsEmpty()==true) {
				throw new Exception();
			}
			for (String string : Stack) {
				if(string == value)
					return true;
			}
			
		} catch (Exception e) {
			System.out.println("Stack is empty!");
		}
		return false;
	}

	@Override
	public String Peek() {
		Object StackArr[] = Stack.toArray();
		try {
			if(IsEmpty()==true) {
				throw new Exception();
			}
			String a = (String) StackArr[top];
		} catch (Exception e) {
			System.out.println("Stack is empty!");
		}
		return (String) StackArr[top];
	}

	@Override
	public void Push(String value) {
		Object StackArr[] = Stack.toArray();
		try {
			if(IsEmpty()==true) {
				throw new Exception();
			}
			++top;
			
	        StackArr[top] = value;
		} catch (Exception e) {
			System.out.println("Stack is empty!");
		}
	}

	@Override
	public String Pop() {
		Object StackArr[] = Stack.toArray();
		try {
			if(IsEmpty()==true) {
				throw new Exception();
			}
			
			--top;
		} catch (Exception e) {
			System.out.println("pop Stack is empty!");
		}
		return (String) StackArr[top];
	}

	@Override
	public boolean IsEmpty() {
		if(top == -1){
	        return true;
	    }else{
	        return false;
	    }
	}

}
