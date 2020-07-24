import java.util.*;
public class Calculadora {
    public static void main(String[] args){
        System.out.println("Bienvenido a la calculadora de funciones trigonometrica");
        System.out.println("sí desea calcular: sen, cos, y tan presiona 1");
        System.out.println("sí desea calcular: arcsen, arccos, y arctan presiona 2");
        System.out.println("sí desea calcular: senh, cosh, y tanh presiona 3");
        Scanner scanner=new Scanner(System.in);
        int scan = scanner.nextInt();
        boolean standar= scan==1;
        boolean arc= scan==(2);
        boolean complementarias= scan==(3);

        if (standar){
            Calculadora.standar();
        };


    }
    public static void standar(){
        System.out.println("hi");

    }
}
