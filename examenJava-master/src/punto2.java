import javax.swing.*;

public class punto2 {
    public static void main(String[] args){
        //Escribir un programa que pida al usuario un
        // número entero y muestre por pantalla un
        //triángulo rectángulo como el de más abajo.
        //
        // 1
        // 3 1
        // 5 3 1
        // 7 5 3 1

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingreseun numero"));

        int numeroImpar = 1;
        for (int i = 1; i <= numero; i++){
            for (int j = numeroImpar; j >= 1; j = j- 2){
                System.out.println(j+ " ");

            }
            numeroImpar = numeroImpar +2;
        }


    }
}
