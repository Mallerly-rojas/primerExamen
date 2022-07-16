import java.util.Locale;

public class punto6 {
    public static void main(String[] args){
        //Escribir un programa que pregunte el nombre completo del
        // usuario y después muestre por pantalla el nombre completo
        // del usuario tres veces, una con todas las letras minúsculas,
        // otra con todas las letras mayúsculas y otra solo con la
        //primera letra del nombre y de los apellidos en mayúscula.
        // El usuario puede introducir su nombre combinando mayúsculas
        // y minúsculas como quiera.
        String nombre = "Mallerly Rojas Cardenas";
        nombre.toLowerCase();
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        String[] partes = nombre.split("");
        for (int i = 0; i<partes.length; i++)
        System.out.println(partes[i].toUpperCase().charAt(0)+ partes[i].substring(1, partes[i].length()));


    }
}
