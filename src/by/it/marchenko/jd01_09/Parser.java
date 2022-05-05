package by.it.marchenko.jd01_09;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import static by.it.marchenko.jd01_09.MessageConst.*;

public class Parser {

    public Var calc(String inputString) {
        if (inputString != null) {
            String[] operands = inputString.split(OPERATOR_REGEX, MAXIMUM_ALLOWED_OPERANDS);
            Pattern operatorPattern = Pattern.compile(OPERATOR_REGEX);
            Matcher operatorMatcher = operatorPattern.matcher(inputString);

            String[] operator = new String[operands.length - 1];
            Var[] varOperands = new Var[operands.length];
            for (int i = 0; i < operands.length; i++) {
                varOperands[i] = Var.createVar(operands[i]);
                if (operatorMatcher.find()) {
                    operator[i] = operatorMatcher.group();
                }
            }
            Var tempResult = varOperands[0];
            for (int i = 0; i < operator.length; i++) {
                tempResult = switch (operator[i]) {
                    case "+" -> tempResult.add(varOperands[i + 1]);
                    case "-" -> tempResult.sub(varOperands[i + 1]);
                    case "*" -> tempResult.mul(varOperands[i + 1]);
                    case "/" -> tempResult.div(varOperands[i + 1]);
                    default -> null;
                };
            }
            return tempResult;
        }
        return null;
    }
}
