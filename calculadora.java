public class calculadora {
    public static double calcularMitjana(double[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }

        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }

        return suma / numeros.length;
    }
}

