public class Ejercicios {
    public Ejercicios(){
    }

    public int sumaConsecutivos(int num){  // 5
        // Caso Base (es la condición que finaliza el programa)
        System.out.println("El num es: " + num);
        if(num == 1)
            return num;
        // Parte Recursiva
        return num + sumaConsecutivos(num - 1);
    }
    
    public int sumaPasosConsecutivos(int num){  // 5
        // Caso Base (es la condición que finaliza el programa)
        System.out.println("El num es: " + num);
        if(num == 1)
            return num;
        // Parte Recursiva
        int resultadoRecursivo = sumaPasosConsecutivos(num - 1);
        int resultadoOperacion = num + resultadoRecursivo;
        System.out.println("ResultadoOp " + resultadoOperacion + " = " + num + " + " + "sumaConsecutivosPasos(" + resultadoRecursivo + ")");
        return resultadoOperacion;
    }


    // Potencia de un número: Escribe una función recursiva
    // que calcule la potencia de un número base elevado a un
    // exponente entero.
    // Por ejemplo, si base es 2 y exponente es 3,
    // la función debe devolver 2^3 = 8.

    public int getPotencia(int base, int exponente){
        if(exponente == 1)
            return base; // base ^ 1 = base
    // if (exponente == 0)
    //      return 0;
        return base * getPotencia(base, exponente - 1);
    }

    public int getPasosPotencia(int base, int exponente){  
        // Caso Base (es la condición que finaliza el programa)
        System.out.println("La base: " + base + ", El exponente: " + exponente);
        if(exponente == 1)
            return base;
        // Parte Recursiva
        int resultadoRecursivo1 = getPasosPotencia(base, exponente - 1);
        int resultadoOperacion1 = base * resultadoRecursivo1;
        System.out.println("ResultadoOp " + resultadoOperacion1 + " = " + base + " + " + "getPasosPotencia(" + resultadoRecursivo1 + ")");
        return resultadoOperacion1;
    }

    public int sumaDigitos(int num){ // 456
        // caso base
        if(num < 10)
            return num;

        // caso recursivo
        // 6 + sD(45)
        // 5 + sD(4)
        // r -> 4
        return (num % 10) + sumaDigitos(num/10);
    }

    public int sumaPasosDigitos(int num){  
        // Caso Base (es la condición que finaliza el programa)
       
        if(num < 10)
            return num;
        // Parte Recursiva
        int resultadoRecursivo2 = sumaPasosDigitos(num / 10);
        int resultadoOperacion2 = num + resultadoRecursivo2;
        System.out.println("Resultado suma: " + resultadoRecursivo2 + " = " + num + " + " + "sumaPasosDigitos(" + resultadoOperacion2 + ")");
        return (num % 10) + sumaDigitos(num/10);
    }

}