import javax.swing.*;
import java.util.Locale;

public class punto7 {
    public static void main(String[] args){
        //Escribir un programa que almacene la cadena de caracteres
        // contraseña en una variable, pregunte al usuario por la
        //contraseña e imprima por pantalla si la contraseña introducida
        // por el usuario coincide con la guardada en la variable sin
        //tener en cuenta mayúsculas y minúsculas.
        String pasword = "1234567";
        String pasword2= JOptionPane.showInputDialog(null, "ingrese la contraseña");
        if (pasword.toLowerCase().equals(pasword2.toLowerCase())){
            JOptionPane.showMessageDialog(null, "contraseña correcta");
        }else {
            JOptionPane.showMessageDialog(null, "contraseña correcta");

        }
    }
}
