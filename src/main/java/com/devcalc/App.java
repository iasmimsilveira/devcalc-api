package com.devcalc;

/**
 * Classe principal da aplicação.
 */
public final class App {

    // Construtor privado para evitar instanciação
    private App() {
        throw new UnsupportedOperationException("Classe utilitária");
    }

    /**
     * Ponto de entrada da aplicação.
     * @param args argumentos de linha de comando
     */
    public static void main(final String[] args) {
        System.out.println("Servidor iniciado na porta 7001");
    }
}
