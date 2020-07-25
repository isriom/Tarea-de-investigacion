import java.util.*;

import static java.lang.Math.PI;

public class Calculadora {
    public static void main(String[] args){
        System.out.println("Bienvenido a la calculadora de funciones trigonometrica");
        System.out.println("sí desea calcular: sen, cos, y tan ingresa 1");
        System.out.println("sí desea calcular: arcsen, arccos, y arctan ingresa 2");
        System.out.println("sí desea calcular: senh, cosh, y tanh ingresa 3");
        double scan= Calculadora.numero();
        int scanned=(int)scan;
        boolean standar= scanned==1;
        boolean arc= scanned==(2);
        boolean complementarias= scanned==(3);

        if (standar){
            Calculadora.standar();
        }
        else if (arc){
            Calculadora.standar();
        }
        else if (complementarias){
            Calculadora.standar();
        }else{
            System.out.println("Por favor ingresa un numero valido");
            System.out.println("reiniciando");
            System.out.println("");
            Calculadora.main(null);
        };


    }
    public static void standar(){
        System.out.println("Dame el valor de angulo y te dare sen, cos y tan del angulo:");
        System.out.println("(recuerda usar , para los decimales)");
        double scan=Calculadora.numero();
        scan=scan * PI / 180;
        System.out.println("el angulo es"+scan);
        System.out.println("El valor de sen para este ángulo es :"+Math.sin(scan));
        System.out.println("El valor de cos para este ángulo es :"+Math.cos(scan));
        System.out.println("El valor de tan para este ángulo es :"+Math.tan(scan));

    }
    public static double numero(){
        Scanner scanner=new Scanner(System.in);
        double scan = scanner.nextDouble();
        return scan;
    }
}

