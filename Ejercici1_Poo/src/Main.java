import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        //Se crea objeto cuenta1 sin parámetros
        //Se ejecuta el constructor por defecto
        Cuenta cuenta1 = new Cuenta();

        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Número de cuente: ");
        numero = sc.nextLine();
        System.out.println("Tipo de interes: ");
        tipo = sc.nextDouble();
        System.out.println("Saldo: ");
        importe = sc.nextDouble();

        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setTipoInteres(tipo);
        cuenta1.setSaldo(importe);

        //Se crea el objeto cuenta2 con los valores leídos por teclado
        //Se ejecuta el constructor con parametros
        Cuenta cuenta2 = new Cuenta("Justine Pulido", "654329876", 1.75, 900);

        //Se crea la cuenta3 de copia cuenta1
        //Se ejecuta el constructor copia
        Cuenta cuenta3 = new Cuenta(cuenta1);

        //mostrar los datos de cuenta1
        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombre());
        System.out.println("Numero de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Tipo de interes: " + cuenta1.getTipoInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        //Se realiza un ingreso en la cuenta1
        cuenta1.ingreso(4000);

        //mostrar el saldo de la cuenta1 despues del ingreso
        System.out.println("Saldo de: " + cuenta1.getNombre() + " es de: " + cuenta1.getSaldo());
        System.out.println("\n");

        //mostrar los datos de cuenta2
        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.getNombre());
        System.out.println("Numero de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Tipo de interes: " + cuenta2.getTipoInteres());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //mostrar los datos de cuenta3
        System.out.println("Datos de la cuenta 3");
        System.out.println("Nombre del titular: " + cuenta3.getNombre());
        System.out.println("Numero de cuenta: " + cuenta3.getNumeroCuenta());
        System.out.println("Tipo de interes: " + cuenta3.getTipoInteres());
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

        //Realizar una transferencia de 10$ desde cuenta3 a cuenta2
        cuenta3.transferencia(cuenta2, 10);

        //mostrar saldo de la cuenta2
        System.out.println("Saldo de la cuenta 2: " + cuenta2.getSaldo());
        System.out.println("de: " + cuenta2.getNombre());
        System.out.println();

        //mostrar saldo de la cuenta3
        System.out.println("saldo de la cuenta 3: " + cuenta3.getSaldo());
        System.out.println("de: " + cuenta3.getNombre());
        System.out.println();
    }

}
