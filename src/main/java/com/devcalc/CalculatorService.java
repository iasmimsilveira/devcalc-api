package com.devcalc;

/**
 * Serviço de operações matemáticas básicas.
 * Esta classe não foi projetada para extensão.
 */
public final class CalculatorService {

    /**
     * Soma dois valores.
     * @param a primeiro valor
     * @param b segundo valor
     * @return resultado da soma
     */
    public double add(final double a, final double b) {
        return a + b;
    }

    /**
     * Subtrai dois valores.
     * @param a primeiro valor
     * @param b segundo valor
     * @return resultado da subtração
     */
    public double subtract(final double a, final double b) {
        return a - b;
    }

    /**
     * Multiplica dois valores.
     * @param a primeiro valor
     * @param b segundo valor
     * @return resultado da multiplicação
     */
    public double multiply(final double a, final double b) {
        return a * b;
    }

    /**
     * Divide dois valores.
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão
     * @throws ArithmeticException se b == 0
     */
    public double divide(final double a, final double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }
}
