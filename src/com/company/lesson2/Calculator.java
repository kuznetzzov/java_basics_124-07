package com.company.lesson2;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public long sum(long a, long b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    // Если дальнейшая обработка не предполагается:
    public String divideLong(long a, long b) {
        LongDivision longDivision = new LongDivision(a / b, a % b);
        long quotient = longDivision.getQuotient();
        long remainder = longDivision.getRemainder();
        if (remainder == 0) {
            return String.valueOf(quotient);
        } else {
            return String.valueOf(divide((double) a, b));
        }
    }

    // Если работа с ответом планируется и через геттер нужно вернуть текущий тип данных
    public LongDivision divide(long a, long b) {
        return new LongDivision(a / b, a % b);
    }

    // Если дальнейшая обработка не предполагается:
    public String divideInteger(int a, int b) {
        IntegerDivision integerDivision = new IntegerDivision(a / b, a % b);
        int quotient = integerDivision.getQuotient();
        int remainder = integerDivision.getRemainder();
        if (remainder == 0) {
            return String.valueOf(quotient);
        } else {
            return String.valueOf(divide((double) a, b));
        }
    }

    // Если работа с ответом планируется и через геттер нужно вернуть текущий тип данных
    public IntegerDivision divide(int a, int b) {
        return new IntegerDivision(a / b, a % b);
    }
}
