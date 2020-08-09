import java.util.*;

import static java.lang.Math.PI;

public class Calculadora {
    public static void main(String[] args){
        System.out.println("Bienvenido a la calculadora de funciones trigonometricas");
        System.out.println("Sí desea calcular: seno, coseno, y tangente ingresa: 1");
        System.out.println("Sí desea calcular: arcoseno, arcocoseno, y arcotangente ingresa: 2");
        System.out.println("Sí desea calcular: senh, cosh, y tanh ingresa: 3");
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
            Calculadora.complementarias();
        }else{
            System.out.println("Por favor ingresa un numero valido");
            System.out.println("reiniciando");
            System.out.println(" ");
            Calculadora.main(null);
        }


    }
    public static void standar() {
        System.out.println("Dame el valor de angulo y te dare seno, coseno y tangente del angulo:");
        System.out.println("(Recuerda usar , para los decimales e introducirlo en grados)");
        double scan = Calculadora.numero();
        System.out.println("El angulo es: " + scan);
        scan = scan * PI / 180;
        System.out.println("El valor de Seno para este ángulo es :" + Math.sin(scan));
        System.out.println("El valor de Coseno para este ángulo es :" + Math.cos(scan));
        System.out.println("El valor de Tangente para este ángulo es :" + Math.tan(scan));
    }

    public static void arc(){
        System.out.println("Dame un valor y te dare Arcoseno, Arcocoseno y Arcotangente del valor:");
        System.out.println("(Recuerda usar , para los decimales)");
        double scan=Calculadora.numero();
        System.out.println("El valor es: "+scan);
        System.out.println("El valor en grados de Arcoseno es :"+(Math.asin(scan))* 180/PI);
        System.out.println("El valor en grados de Arcocoseno  es :"+(Math.acos(scan))* 180/PI);
        System.out.println("El valor en grados de Arcotangente es :"+(Math.atan(scan))* 180/PI);
    }

    public static void complementarias(){
        System.out.println("Dame el valor de angulo y te dare el Seno Hiperbólico, Coseno Hiperbólico y Tangente Hiperbólico del angulo:");
        System.out.println("(Recuerda usar , para los decimales e introducirlo en grados)");
        double scan=Calculadora.numero();
        System.out.println("El angulo es: "+scan);
        scan=scan * PI / 180;
        System.out.println("El valor del Seno Hiperbólico para este ángulo es :"+Math.sinh(scan));
        System.out.println("El valor de Coseno Hiperbólico para este ángulo es :"+Math.cosh(scan));
        System.out.println("El valor de Tangente Hiperbólico para este ángulo es :"+Math.tanh(scan));

    }
    public static double numero(){
        Scanner scanner=new Scanner(System.in);
        double scan = scanner.nextDouble();
        return scan;
    }
}

