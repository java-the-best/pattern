package pattern.interpreter.interpreter;

import java.util.Map;

public interface Exp {

    int interpret(Map<String, Integer> context);

    static Exp plus(Exp left, Exp right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    static Exp minus(Exp left, Exp right) {
        return context -> left.interpret(context) - right.interpret(context);
    }

    static Exp variables(String name) {
        return context -> context.getOrDefault(name, 0);
    }
}
