package Service;

import java.util.Stack;

public class Calculator {
    private Stack<Double> history;
    private double currentResult;

    public Calculator() {
        history = new Stack<>();
        currentResult = 0;
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        history.push(currentResult);
        currentResult = result;
        return result;
    }

    public double subtract(double num1, double num2) {
        double result = num1 - num2;
        history.push(currentResult);
        currentResult = result;
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        history.push(currentResult);
        currentResult = result;
        return result;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        double result = num1 / num2;
        history.push(currentResult);
        currentResult = result;
        return result;
    }

    public void undo() {
        if (!history.isEmpty()) {
            currentResult = history.pop();
        }
    }

    public void redo() {
        //
    }

    public double getCurrentResult() {
        return currentResult;
    }
}
