package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionCalculator;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionCalculator::divideAByB);

        System.out.println("Use Beautifier text:");
        PoemBeautifier poemBeautifier= new PoemBeautifier();
        poemBeautifier.beautify("Some example text.", (text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Some example text.", (text) -> toUpperCase(text));



    }
}
