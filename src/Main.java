//Importar arraylist
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear un arraylist de enteros, agregar 50 numeros aleatorios entre (1-50) y mostrarlos
        //Definir arraylist
        ArrayList<Integer> lista = new ArrayList<Integer>();
        //Definir variable de numero aleatorio
        Random random = new Random();
        //For para añadir los numeros aleatorios a la lista
        for(int i=0;i<50;i++){
            int  num = random.nextInt(50)+1;
            //añadir el numero aleatorio a la lista
            lista.add(num);
        }
        //Mostrar la lista con los numeros aleatorios
        System.out.println("Los numeros aleatorios generados en la lista son: ");
        System.out.print(lista + " ");

        //Calcular la suma de los elementos de la lista
        //definir la variable de la suma
        int sum=0;
        //For para sumar los numeros aleatorios
        for(int i=0; i<lista.size();i++){
            sum+=lista.get(i);
        }
        //mostrar la suma
        System.out.println("La suma de los numeros de la lista es: ");
        System.out.print(sum);
        System.out.println();

        //Mostrar el numero mayor de la lista
        //definir la variable del numero mayor
        int may=0;
        System.out.println("El numero mayor de la lista es: ");
        //For para definir el numero mayor de la lista
        for(int i=0;i<lista.size();i++){
            if(may<lista.get(i)){
                may=lista.get(i);
            }
        }
        //mostrar el numero mayor
        System.out.println(may);

        //Buscar un numero en la lista e indicar si existe
        //definir variable del numero que desea buscar
        int numbus;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea buscar");
        numbus= lector.nextInt();
        //Buscar el numero
        //Indicar que el numero existe
        if(lista.contains(numbus)){
            System.out.println("El numero existe");
        }
        //Indicar que el numero no existe
        else{
            System.out.println("El numero no existe");
        }

        //Eliminar un elemento especifico de la lista
        //definir variable para almacenar el numero que desea eliminar
        int del;
        System.out.println("Escriba el numero que desea elminar de la lista");
        del = lector.nextInt();
        //eliminar el numero de la lista
        if(lista.contains(del)){
            lista.remove(Integer.valueOf(del));
            System.out.println("El elemento seleccionado se elimino de la lista");

        }
        else{
            System.out.println("El numero no existe en la lista");
        }
        //mostrar la lista
        System.out.println(lista);


        //Ordenar la lista de menor a mayor (sin funciones)
        //variable para almacenar el orden de la lista
        int orden;
        //For para ordenar la lista de menor a mayor
        for(int i=0;i< lista.size()-1;i++){
            for(int j=0;j< lista.size()-1-i;j++){
                if(lista.get(j)>lista.get(j+1)){
                    //se guarda el numero en la variable orden
                    orden=lista.get(j);
                    //se intercambia el valor de la derecha con el de la izquierda
                    lista.set(j,lista.get(j+1));
                    //se pone el valor guardado en la variable en la derecha
                    lista.set(j+1,orden);
                }
            }
        }
        //mostrar la lista ordenada
        System.out.println("La lista ordenada es: ");
        System.out.print(lista + " ");
        System.out.println();

        //Contar cuantos numeros son pares dentro de la lista
        //definir variable para almacenar la cantidad de numeros pares
        int pares=0;
        //for para contar los numeros pares que hay en la lista
        for(int i=0;i<lista.size();i++){
            //if para contar los numeros pares
            if(lista.get(i)%2==0){
                //contar la cantidad de numeros pares y almacenarloa en una variable
                pares++;
            }
        }
        //mostrar la cantidad de numeros pares que hay en la lista
        System.out.println("La cantidad de numeros pares que hay en la lista es: ");
        System.out.println(pares);
        System.out.println();

        //Crear CRUD basico usando ArrayList(agregar, listar, eliminar, actualizar)
        //crear menu de CRUD
        int opcion=1;
        while(opcion!=0){
            System.out.println("CRUD");
            System.out.println("1.Agregar");
            System.out.println("2.Listar");
            System.out.println("3.Actualizar");
            System.out.println("4.Eliminar");
            System.out.println("0.Salir");
            System.out.println("Elija una opcion");
            opcion=lector.nextInt();
            switch(opcion){
                //Agregar
                case 1:
                    System.out.println("Eligio la opcion 1.Agregar");
                    System.out.println("Escriba el numero que desea ingresar: ");
                    lista.add(lector.nextInt());
                    System.out.println("La lista quedo: ");
                    System.out.print(lista);
                    break;
                    //Listar
                case 2:
                    System.out.println("Eligio la opcion 2.Listar");
                    //For para listar
                    for(int i=0;i<lista.size();i++){
                        System.out.println(i + ": ");
                        System.out.println(lista.get(i));
                    }
                    break;
                    //Actualizar
                case 3:
                System.out.println("Eligio la opcion 3.Actualizar");
                System.out.println("Escriba la posicion que desea eliminar: ");
                //Definir variable para almacenar la posicion de la lista que desea eliminar
                int pos = lector.nextInt();
                //if para verificar que la posicion este en la lista
                    if(pos>=0 && pos<lista.size()){
                        System.out.println("Nuevo dato: ");
                        lista.set(pos, lector.nextInt());
                    }
                    System.out.println("La lista quedo: ");
                    System.out.print(lista);
                    break;

                    //Eliminar
                case 4:
                    System.out.println("Eligio la opcion 4.Eliminar");
                    System.out.println("Escriba la posicion que desea eliminar: ");
                    //Definir la variable para almacenar la posicion que desea eliminar
                    int del1=lector.nextInt();
                    //if para validar que la posicion este en la lista
                    if(del1>=0&&del1<lista.size()){
                        lista.remove(del1);
                    }
                    System.out.println("La lista quedo: ");
                    System.out.print(lista);
                    break;
                case 0:
                    System.out.println("Eligio la opcion 0.Salir");
                    break;
            }
        }


        //Crear una lista de objetos (ej: Estudiante con nombre y nota) y mostrar los datos
        //Crear clase estudiante (En lo que investigue fue la unica manera que encontre que sea mas eficiente)
        class estudiante{
            String nombre;
            double nota;
        }
        //Crear lista
        ArrayList<estudiante>estudiantes=new ArrayList<>();
        //Definir variable para almacenar la cantidad de estudiantes que desee ingresar
        System.out.println("Ingrese el numero de estudiantes que desea ingresar a la lista: ");
        int cantest= lector.nextInt();
        //For para definir la cntidad de estudiantes
        for(int i=0; i<cantest; i++){
            //Crear una variable para almacenar los datos de los estudiantes
            estudiante e = new estudiante();
            //Ingrear el nombre de los estudiantes
            System.out.println("Ingrese el nombre del estudiante " + (1+i));
            //Agrego dos lineas al final de .nextLine() porque segun lo que investigue, esto permite escribir los datos que se piden
            //No pude hacer que la lista quede con nombre, queda solo con numeros
            e.nombre=lector.nextLine();//
            System.out.println();
            //Ingresar la nota de los estudiantes
            System.out.println("Ingrese la nota del estudiuante: " + (1+i));
            e.nota=lector.nextDouble();
            System.out.println();
            //Agregar la variable e a la lista de estudiantes
            estudiantes.add(e);
        }
        //Mostrar la lista
        for(int i=0; i<estudiantes.size(); i++){
            System.out.println("La lista de estudiantes es: ");
            //Mostrar nombre - nota de los estudiantes utilizando lista.get(i).variable de clase
            System.out.println("Estudiante " + (1+i) + estudiantes.get(i).nombre + " - " + estudiantes.get(i).nota);
        }
    }
}