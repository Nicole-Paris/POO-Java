import java.util.Scanner;

public class ConvertidorDivisas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tasaUsdToMxn = 18.25;
        double tasaUsdToEur = 0.91;
        double tasaMxnToUsd = 0.055;
        double tasaMxnToEur = 0.050;
        double tasaEurToUsd = 1.10;
        double tasaEurToMxn = 20.00;

        while (true) {
            System.out.println("\nDivisas disponibles para la conversión:");
            System.out.println("1. USD -> MXN");
            System.out.println("2. USD -> EUR");
            System.out.println("3. MXN -> USD");
            System.out.println("4. MXN -> EUR");
            System.out.println("5. EUR -> USD");
            System.out.println("6. EUR -> MXN");
            System.out.println("7. Salir");

            System.out.print("Selecciona una opción (1-7): ");
            int opcion = scanner.nextInt();

            if (opcion == 7) {
                System.out.println("Gracias por usar el convertidor de divisas.");
                break;
            }

            System.out.print("Introduce la cantidad a convertir: ");
            double cantidad = scanner.nextDouble();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
                continue;
            }

            double resultado = 0;

            switch (opcion) {
                case 1:  
                    resultado = cantidad * tasaUsdToMxn;
                    System.out.printf("%.2f USD son %.2f MXN\n", cantidad, resultado);
                    break;
                case 2:  
                    resultado = cantidad * tasaUsdToEur;
                    System.out.printf("%.2f USD son %.2f EUR\n", cantidad, resultado);
                    break;
                case 3:  
                    resultado = cantidad * tasaMxnToUsd;
                    System.out.printf("%.2f MXN son %.2f USD\n", cantidad, resultado);
                    break;
                case 4:  
                    resultado = cantidad * tasaMxnToEur;
                    System.out.printf("%.2f MXN son %.2f EUR\n", cantidad, resultado);
                    break;
                case 5:  
                    resultado = cantidad * tasaEurToUsd;
                    System.out.printf("%.2f EUR son %.2f USD\n", cantidad, resultado);
                    break;
                case 6:  
                    resultado = cantidad * tasaEurToMxn;
                    System.out.printf("%.2f EUR son %.2f MXN\n", cantidad, resultado);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}

