package Programa;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String ponerNombre = "";
        String ponerContraseña = "";

        String nombreUsuarioReal1 = "Saralith";
        String contraseñaUsuarioReal1 = "sari";

        String nombreUsuarioReal2 = "Ainara";
        String contraseñaUsuarioReal2 = "ain";

        String nombreUsuarioReal3 = "Alba";
        String contraseñaUsuarioReal3 = "alb";

        String nombreUsuarioReal4 = "Jon";
        String contraseñaUsuarioReal4 = "jo";

        do{
            System.out.println("Escribe tu nombre de usuario y contraseña para acceder");
            ponerNombre = lector.nextLine();
            ponerContraseña = lector.nextLine();

            if(ponerNombre.equalsIgnoreCase(nombreUsuarioReal1) && ponerContraseña.equalsIgnoreCase(contraseñaUsuarioReal1)
                    || ponerNombre.equalsIgnoreCase(nombreUsuarioReal2) && ponerContraseña.equalsIgnoreCase(contraseñaUsuarioReal2)
                    || ponerNombre.equalsIgnoreCase(nombreUsuarioReal3) && ponerContraseña.equalsIgnoreCase(contraseñaUsuarioReal3)
                    || ponerNombre.equalsIgnoreCase(nombreUsuarioReal4) && ponerContraseña.equalsIgnoreCase(contraseñaUsuarioReal4)){
                System.out.println("Inicio de sesión correcto");
                break; //<--- QUITA "break;" ESTO PARA QUE EL BUCLE SEA INFINITO Y NO PARE DE PREGUNTARTE POR USUARIO Y CONTRASEÑA
                //RESTO DEL CÓDIGO DEL PROGRAMA UNA VEZ INICADA LA SESIÓN
            }else{
                System.out.println("Usuario o contraseña incorrectos");
            }
        }while(!ponerNombre.equalsIgnoreCase(nombreUsuarioReal1) || !ponerContraseña.equalsIgnoreCase(contraseñaUsuarioReal1)
                || !ponerNombre.equalsIgnoreCase(nombreUsuarioReal2) || !ponerContraseña.equalsIgnoreCase(contraseñaUsuarioReal2)
                || !ponerNombre.equalsIgnoreCase(nombreUsuarioReal3) || !ponerContraseña.equalsIgnoreCase(contraseñaUsuarioReal3)
                || !ponerNombre.equalsIgnoreCase(nombreUsuarioReal4) || !ponerContraseña.equalsIgnoreCase(contraseñaUsuarioReal4));
        lector.close();
    }
}
