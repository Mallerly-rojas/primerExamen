import javax.swing.*;

public class punto8 {
    public static void main(String[] args){
        //Escribir un programa que pida al usuario un número entero
        // positivo y muestre por pantalla la cuenta atrás desde
        // ese número hasta cero separados por comas.

        int numero =Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numer"));
        for (int i = numero; i>=0; i--){
            System.out.println(i+ ",");
            if (i == 0){
                System.out.println(i+ "");

            }else {
                System.out.println(i+ ",");
            }
        }
    }
}
