import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        // Usuario y contraseña predefinidos
        String usuarioCorrecto = "usuario";
        String contrasenaCorrecta = "contrasena";

        // Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el nombre de usuario
        System.out.print("Ingrese su nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();

        // Solicitar al usuario que ingrese la contraseña
        System.out.print("Ingrese su contraseña: ");
        String contrasenaIngresada = scanner.nextLine();

        // Verificar las credenciales
        if (usuarioCorrecto.equals(usuarioIngresado) && contrasenaCorrecta.equals(contrasenaIngresada)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
        } else {
            System.out.println("Credenciales incorrectas. Por favor, inténtelo nuevamente.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
