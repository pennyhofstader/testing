package greatlearning.dsaLab.Question1;

import java.util.Stack;

class BalancedBrackets_Function {

	// checking if the input is balanced
	static boolean IsBalanced(String input) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			char x = input.charAt(i);

			if (x == '(' || x == '[' || x == '{') {

				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			default:
				System.out.println("Ibvalid Input");
				return false;
			}
		}

		return (stack.isEmpty());
	}

}
