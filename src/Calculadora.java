import java.util.*;

import static java.lang.Math.PI;

public class Calculadora {
    public static void main(String[] args){
        System.out.println("Bienvenido a la calculadora de funciones trigonometricas");
        System.out.println("Sí desea calcular: seno, coseno, y tangente ingresa 1");
        System.out.println("Sí desea calcular: arcoseno, arcocoseno, y arcotangente ingresa 2");
        System.out.println("Sí desea calcular: senh, cosh, y tanh ingresa 3");
        double scan= Calculadora.numero();
        int scanned=(int)scan;
        boolean standar= scanned==1;
        boolean arc= scanned==(2);
        boolean complementarias= scanned==(3);

        if (standar){
            Calculadora.standar();
        }
        else if (arc){
            Calculadora.arc();
        }
        else if (complementarias){
            Calculadora.standar();
        }else{
            System.out.println("Por favor ingresa un numero valido");
            System.out.println("reiniciando");
            System.out.println(" ");
            Calculadora.main(null);
        }


    }
    public static void standar(){
        System.out.println("Dame el valor de angulo y te dare seno, coseno y tangente del angulo:");
        System.out.println("(recuerda usar , para los decimales)");
        double scan=Calculadora.numero();
        scan=scan * PI / 180;
        System.out.println("El angulo es: "+scan);
        System.out.println("El valor de seno para este ángulo es :"+Math.sin(scan));
        System.out.println("El valor de coseno para este ángulo es :"+Math.cos(scan));
        System.out.println("El valor de tangente para este ángulo es :"+Math.tan(scan));

    }
    public static void arc(){
        System.out.println("Dame el valor de angulo y te dare arcoseno, arcocoseno y arcotangente del angulo:");
        System.out.println("(recuerda usar , para los decimales)");
        double scan=Calculadora.numero();
        System.out.println("El angulo es: "+scan);
        System.out.println("El valor de arcoseno para este ángulo es :"+Math.asin(scan));
        System.out.println("El valor de arcocoseno para este ángulo es :"+Math.acos(scan));
        System.out.println("El valor de arcotangente para este ángulo es :"+Math.atan(scan));
    }
    public static double numero(){
        Scanner scanner=new Scanner(System.in);
        double scan = scanner.nextDouble();
        return scan;
    }
}

