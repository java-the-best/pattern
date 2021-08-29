package pattern.interpreter;

import pattern.interpreter.interpreter.Exp;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InterpreterMain {

    public static void main() {
        String exp = "a + b";
        Exp parse = parse(exp);
        Map<String, Integer> context = new HashMap<>();
        context.put("a", 10);
        context.put("b", 3);
        int result =  parse.interpret(context);
        System.out.println(result);

        exp = "a - b";
        parse = parse(exp);
        context = new HashMap<>();
        context.put("a", 10);
        context.put("b", 3);
        result =  parse.interpret(context);
        System.out.println(result);
    }

    private static Exp parse(String exp) {
        ArrayDeque<Exp> stack = new ArrayDeque<>();
        Arrays.stream(exp.split(" ")).filter(token -> Character.isLetter(token.charAt(0))).forEach(token -> {
            stack.push(parseToken(token, stack));
        });
        Arrays.stream(exp.split(" ")).filter(token -> !Character.isLetter(token.charAt(0))).forEach(token -> {
            stack.push(parseToken(token, stack));
        });
        return stack.pop();
    }

    private static Exp parseToken(String token, ArrayDeque<Exp> stack) {
        Exp left, right;
        switch (token) {
            case "+":
                right = stack.pop();
                left = stack.pop();
                return Exp.plus(left, right);
            case "-":
                right = stack.pop();
                left = stack.pop();
                return Exp.minus(left, right);
            default:
                return Exp.variables(token);
        }
    }
}
