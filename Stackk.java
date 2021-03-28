import java.util.Stack;

public class Stackk {

	public static void main (String args []) {
	
	Stack S = new Stack();

	S.push(7);

	S.push(4);

	System.out.println(S.empty());

	S.push(6);

	S.pop();

	System.out.println(S.search(4));

	System.out.println(S.search(6));

	System.out.println(S.empty());
}}
