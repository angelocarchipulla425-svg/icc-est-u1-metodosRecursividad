public class App {
    public static void main(String[] args) throws Exception {
        Ejercicios ejercicios = new Ejercicios();
        System.out.println("---Ejercicio 1---");
        int result1 = ejercicios.sumaConsecutivos(5);
        System.out.println(result1);

        System.out.println("---Impresión del Ejercicio 1---");
        int result2 = ejercicios.sumaPasosConsecutivos(5);
        System.out.println(result2);

        System.out.println("---Ejercicio 2---");
        int result3 = ejercicios.getPotencia(2,5);
        System.out.println(result3);

        System.out.println("---Impresión del Ejercicio 2---");
        int result4 = ejercicios.getPasosPotencia(2, 5);
        System.out.println(result4);

        System.out.println("---Ejercicio 3---");
        int result5 = ejercicios.sumaDigitos(456);
        System.out.println(result5);

        System.out.println("---Impresión del Ejercicio 3---");
        int result6 = ejercicios.sumaPasosDigitos(456);
        System.out.println(result6);
    }
}
