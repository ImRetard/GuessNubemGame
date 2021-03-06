package lesson_37;

import java.io.FileReader;
import java.util.Stack;

public class Expressions {
    public static void main(String[] args) {
        String expression = "(1+2)*4-3";
        System.out.println(evaluate(expression));;
    }

    public static int evaluate(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        //Insert blanks
        expression = insertBlanks(expression);

        String[] elements = expression.split(" ");

        //scan elements
        for (String item : elements) {
            //ignore blanks
            if (item.length() == 0) {
                continue;
            } else if (item.charAt(0) == '+' || item.charAt(0) == '-') {
                while (!operators.isEmpty() &&
                        (operators.peek() == '+' ||
                                operators.peek() == '-' ||
                                operators.peek() == '*' ||
                                operators.peek() == '/')) {
                    processAnOperator(operands, operators);

                }
                operators.push(item.charAt(0));
            } else if (item.charAt(0) == '*' || item.charAt(0) == '/') {
                while (!operators.isEmpty() &&
                        (
                                operators.peek() == '*' ||
                                        operators.peek() == '/')) {
                    processAnOperator(operands, operators);

                }
                operators.push(item.charAt(0));
            } else if (item.trim().charAt(0) == '(') {
                operators.push('(');
            } else if (item.trim().charAt(0) == ')') {
                while (operators.peek()!='('){
                    processAnOperator(operands, operators);
                }
                operators.pop();
            }else {operands.push(Integer.parseInt(item));}
        }

        while(!operators.isEmpty()){
            processAnOperator(operands, operators);
        }

        return operands.pop();

    }

    private static void processAnOperator(Stack<Integer> operands, Stack<Character> operators) {
        char operator = operators.pop();
        int op1 = operands.pop();
        int op2 = operands.pop();

        if (operator == '+') {
            operands.push(op1 + op2);
        } else if (operator == '-') {
            operands.push(op1 - op2);
        } else if (operator == '*') {
            operands.push(op1 * op2);
        } else if (operator == '/') {
            operands.push(op1 / op2);
        }


    }

    public static String insertBlanks(String exp) {
        StringBuilder resltLine = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            char current = exp.charAt(i);
            if (current == '(' || current == ')' || current == '+' || current == '-' || current == '*' || current == '/') {
                resltLine.append(" ");
                resltLine.append(current);
                resltLine.append(" ");
            } else resltLine.append(current);

        }
        return resltLine.toString();


    }
}
