import javax.swing.*;

public class punto10 {
    public static void main(String[] args){
        // Escribir un programa que almacene la cadena de
        // caracteres contraseña en una variable, pregunte al
        // usuario por la contraseña hasta que introduzca
        // la contraseña correcta.
        boolean incorrecpasw = true;
        String pasw = "2222";
        while (incorrecpasw){
            String importpasw = JOptionPane.showInputDialog(null, "ingrese su contraseña");
            if (importpasw.equals(incorrecpasw)){
                JOptionPane.showMessageDialog(null, "contraseña correcta");
                incorrecpasw = false;

            }else {
                JOptionPane.showMessageDialog(null, "contraseña incorrecta");

            }
        }
    }
}
