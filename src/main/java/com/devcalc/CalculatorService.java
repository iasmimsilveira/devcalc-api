package com.devcalc;

/**
 * Serviço de operações básicas da calculadora.
 */
public final class CalculatorService {

    /**
     * Soma dois números.
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma
     */
    public double add(final double a, final double b)
    {
        return a + b;
    }

    /**
     * Subtrai dois números.
     * @param a minuendo
     * @param b subtraendo
     * @return resultado da subtração
     */
    public double subtract(final double a, final double b)
    {
        return a - b;
    }

    /**
     * Multiplica dois números.
     * @param a primeiro fator
     * @param b segundo fator
     * @return produto
     */
    public double multiply(final double a, final double b)
    {
        return a * b;
    }

    /**
     * Divide dois números.
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão
     * @throws ArithmeticException se divisor for zero
     */
    public double divide(final double a, final double b)
    {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }
}
