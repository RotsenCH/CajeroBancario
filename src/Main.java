import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat de = new DecimalFormat("##.00");

        usuarioBanco newCuenta = new usuarioBanco();

        System.out.println("\n\t\tBienvenido a tu Banco en Linea");
        System.out.println("Ingresa tu nombre: ");
        newCuenta.setNombre(sc.nextLine());

        System.out.println("Ingresa tu número de cedula: ");
        newCuenta.setCedula(sc.nextLine());

        System.out.println("Bienvenido " + newCuenta.getNombre() + "!!!");

        int opcion;


        do {
            System.out.println("\n\t¿Qué accion desea realizar?");
            System.out.println("1. Ingresar dinero a mi cuenta");
            System.out.println("2. Retirar dinero de mi cuenta");
            System.out.println("3. Salir");
            System.out.println("Ingresa tu opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    float ingreso;
                    System.out.println(newCuenta.toString());

                    System.out.println("\n\n Cantidad que quieres ingresar a tu cuenta: ");
                    ingreso = sc.nextFloat();
                    newCuenta.setCantidad(ingreso + newCuenta.getCantidad());
                    System.out.println("Ingreso de " + ingreso + " dolares Realizado con éxito");

                    break;

                case 2:
                    float retiro;
                    System.out.println(newCuenta.toString());

                    System.out.println("\n\n Cantidad que quieres retirar de tu cuenta: ");
                    retiro = sc.nextFloat();

                    if (retiro > newCuenta.getCantidad()){
                        System.out.println("\n\t\tNo tienes suficiente dinero en tu cuenta!!!");
                    } else {
                        newCuenta.setCantidad(newCuenta.getCantidad() - retiro);
                        System.out.println("Retiro de " + retiro +  " dolares Realizado con éxito");
                    }

                    break;

                default:
                    System.out.println("\nOpcion no valida, prueba de nuevo");
                    break;
            }

        } while (opcion != 3);

        System.out.println("\n\n\t\tSaliendo del Sistema, vuelva pronto!!!");
    }
}