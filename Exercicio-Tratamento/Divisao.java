public class Divisao {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Ocorreu uma exceção: Divisão por zero não é permitida.");
        }

        System.out.println("Programa continua após o tratamento de exceção.");
    }
}