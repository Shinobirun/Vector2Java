package ej2vecjava;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //En un vector de 15 posiciones se almacenan las edades de 15 alumnos. Se desea un programa que sea capaz
        // de determinar cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes.


        //Creando vector y asignando valores


        int[] age = {18,22,17,23,45,52,20,21,26,44,24,19,50,42,31};

        //Mayor edad

        IntStream mayor = Arrays.stream(age);
        OptionalInt optionalInt = mayor.max();
        int mayVec=optionalInt.getAsInt();



        System.out.println("La mayor edad de los alumnos es de: "+ mayVec);

        //Menor edad

        IntStream menor=Arrays.stream(age);
        OptionalInt optionalInt1 = menor.min();
        int menVec=optionalInt1.getAsInt();

        System.out.println("La edad mínima es de: "+menVec);





    }
}