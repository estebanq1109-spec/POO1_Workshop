import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
    if (b >= c) return b;
    return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
    int[] resultado = new int[limite];
    for (int i = 1; i <= limite; i++) {
        resultado[i - 1] = numero * i;
    }
    return resultado;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0) {
        throw new IllegalArgumentException("El número no puede ser negativo");
    }
    int resultado = 1;
    for (int i = 1; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) return false;
    }
    return true;
}

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        if (n == 0) {
            return new int[0];
        }
        
        int[] fib = new int[n];
        if (n > 0) {
            fib[0] = 0;
        }
        if (n > 1) {
            fib[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        return fib;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        int suma = sumaElementos(arreglo);
        return (double) suma / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int num : arreglo) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        if (arreglo == null) {
            return null;
        }
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null) {
            return null;
        }
        int[] ordenado = arreglo.clone();
        java.util.Arrays.sort(ordenado);
        return ordenado;
    }

   // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        if (arreglo == null) {
            return null;
        }
        java.util.Set<Integer> set = new java.util.LinkedHashSet<>();
        for (int num : arreglo) {
            set.add(num);
        }
        int[] resultado = new int[set.size()];
        int i = 0;
        for (int num : set) {
            resultado[i++] = num;
        }
        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        if (arreglo1 == null && arreglo2 == null) {
            return null;
        }
        int l1 = (arreglo1 != null) ? arreglo1.length : 0;
        int l2 = (arreglo2 != null) ? arreglo2.length : 0;
        
        int[] resultado = new int[l1 + l2];
        
        if (arreglo1 != null) {
            System.arraycopy(arreglo1, 0, resultado, 0, l1);
        }
        if (arreglo2 != null) {
            System.arraycopy(arreglo2, 0, resultado, l1, l2);
        }
        
        return resultado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        if (arreglo == null || arreglo.length == 0) {
            return arreglo;
        }
        int n = arreglo.length;
        posiciones = posiciones % n;
        if (posiciones < 0) {
            posiciones = posiciones + n;
        }
        
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = arreglo[(i + posiciones) % n];
        }
        return resultado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        if (cadena == null) {
            return 0;
        }
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        if (cadena == null) {
            return null;
        }
        return new StringBuilder(cadena).reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        if (cadena == null) {
            return false;
        }
        String limpia = cadena.replaceAll("\\s+", "").toLowerCase();
        String invertida = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(invertida);
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        if (cadena == null) {
            return null;
        }
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        if (cadena == null) {
            return null;
        }
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        if (cadena == null || antiguaSubcadena == null) {
            return cadena;
        }
        return cadena.replace(antiguaSubcadena, nuevaSubcadena != null ? nuevaSubcadena : "");
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        if (cadena == null || subcadena == null) {
            return -1;
        }
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) {
            return false;
        }
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        return correo.matches(regex);
    }

    // Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return 0.0;
        }
        return lista.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }
// Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        if (eleccionUsuario == null) {
            return "Elección inválida";
        }
        
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String usuarioNormalizado = eleccionUsuario.trim();
        
        // Validar que la opción del usuario sea válida
        boolean valida = false;
        for (String op : opciones) {
            if (op.equalsIgnoreCase(usuarioNormalizado)) {
                usuarioNormalizado = op; // Mantener formato con mayúscula inicial
                valida = true;
                break;
            }
        }
        if (!valida) {
            return "Elección inválida";
        }

        // Computadora elige aleatoriamente
        String computadora = opciones[new java.util.Random().nextInt(opciones.length)];

        if (usuarioNormalizado.equals(computadora)) {
            return "Empate";
        }

        // Reglas de victoria del usuario
        boolean ganaUsuario = false;
        switch (usuarioNormalizado) {
            case "Piedra":
                ganaUsuario = computadora.equals("Tijera") || computadora.equals("Lagarto");
                break;
            case "Papel":
                ganaUsuario = computadora.equals("Piedra") || computadora.equals("Spock");
                break;
            case "Tijera":
                ganaUsuario = computadora.equals("Papel") || computadora.equals("Lagarto");
                break;
            case "Lagarto":
                ganaUsuario = computadora.equals("Spock") || computadora.equals("Papel");
                break;
            case "Spock":
                ganaUsuario = computadora.equals("Tijera") || computadora.equals("Piedra");
                break;
        }

        return ganaUsuario ? "Ganaste" : "Perdiste";
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock (versión con abreviaturas)
    public String pptls2(String[] game) {
        if (game == null || game.length < 2) {
            return "Empate";
        }
        
        String p1 = game[0] != null ? game[0].trim().toUpperCase() : "";
        String p2 = game[1] != null ? game[1].trim().toUpperCase() : "";
        
        if (p1.equals(p2)) {
            return "Empate";
        }
        
        // Reglas de victoria: Si p1 vence a p2
        // - Scissors cuts Paper (S vence a P)
        // - Paper covers Rock (P vence a R)
        // - Rock crushes Lizard (R vence a L)
        // - Lizard poisons Spock (L vence a V)
        // - Spock smashes Scissors (V vence a S)
        // - Scissors decapitates Lizard (S vence a L)
        // - Lizard eats Paper (L vence a P)
        // - Paper disproves Spock (P vence a V)
        // - Spock vaporizes Rock (V vence a R)
        // - Rock crushes Scissors (R vence a S)
        
        boolean p1Gana = false;
        
        switch (p1) {
            case "S": // Scissors
                p1Gana = p2.equals("P") || p2.equals("L");
                break;
            case "P": // Paper
                p1Gana = p2.equals("R") || p2.equals("V");
                break;
            case "R": // Rock
                p1Gana = p2.equals("L") || p2.equals("S");
                break;
            case "L": // Lizard
                p1Gana = p2.equals("V") || p2.equals("P");
                break;
            case "V": // Spock
                p1Gana = p2.equals("S") || p2.equals("R");
                break;
        }
        
        return p1Gana ? "Player 1" : "Player 2";
    }

    // Método que calcula el área de un círculo dado su radio
    public double areaCirculo(double radio) {
        if (radio < 0) {
            return 0.0;
        }
        return Math.PI * radio * radio;
    }

    // Método que calcula el signo del zodíaco según el día y el mes
    public String zoodiac(int day, int month) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return "Fecha inválida";
        }
        
        switch (month) {
            case 1:
                return (day <= 19) ? "Capricorn" : "Aquarius";
            case 2:
                return (day <= 18) ? "Aquarius" : "Pisces";
            case 3:
                return (day <= 20) ? "Pisces" : "Aries";
            case 4:
                return (day <= 19) ? "Aries" : "Taurus";
            case 5:
                return (day <= 20) ? "Taurus" : "Gemini";
            case 6:
                return (day <= 20) ? "Gemini" : "Cancer";
            case 7:
                return (day <= 22) ? "Cancer" : "Leo";
            case 8:
                return (day <= 22) ? "Leo" : "Virgo";
            case 9:
                return (day <= 22) ? "Virgo" : "Libra";
            case 10:
                return (day <= 22) ? "Libra" : "Scorpio";
            case 11:
                return (day <= 21) ? "Scorpio" : "Sagittarius";
            case 12:
                return (day <= 21) ? "Sagittarius" : "Capricorn";
            default:
                return "Fecha inválida";
        }
    }


}

