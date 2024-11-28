package Taller1;

import java.util.Scanner;

public class Proyecto {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenido Usuario");
        System.out.println("Que desea hacer?");
        op();
        int Opcion = scanner.nextInt();


        switch (Opcion) {
            case 1:
                crearEstudiantes();
                break;
                case 2:
                crearCuenta();
                break;
                case 3:
                crearLibro();
                break;
                case 4:
                System.out.println("Hasta la proxima");
                break;
            default:
                System.out.println("Opcion invalida");
        }

    }

    public static void op(){
        System.out.println("1.Crear Estudiante");
        System.out.println("2.Crear cuenta bancaria");
        System.out.println("3.Crear Libro");
        System.out.println("4.Salir");
    }

    public static void crearEstudiantes() {

        System.out.println("Ingrese el nombre del estudiante");
        String nombre = scanner.next();
        
        System.out.println("Ingrese la edad del estudiante");
        int edad = scanner.nextInt();
        
        System.out.println("Ingrese el curso del estudiante");
        String curso = scanner.next();
        
        Estudiantes estudiante = new Estudiantes(edad, nombre, curso);
        System.out.println("Detalles = " + estudiante);            
    }
    
    public static void crearCuenta() {
    
        System.out.println("Ingrese su numero de cuenta");
        int numeroCuenta = scanner.nextInt();
        
        System.out.println("Ingrese su saldo");
        float saldo = scanner.nextFloat();
        
        System.out.println("Ingrese su tipo de cuenta");
        String tipoCuenta = scanner.next();
        
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        System.out.println("Detalles = " + cuenta);
    }
    
    public static void crearLibro() {
    
        System.out.println("Ingrese el titulo");
        String titulo = scanner.next();
        
        System.out.println("Ingrese el numero de paginas");
        int paginas = scanner.nextInt();
        
        System.out.println("Ingrese el nombre del autor");
        String autor = scanner.next();
        
        Libro libro = new Libro(paginas, autor, titulo);
        System.out.println("Detalles = " + libro);
    }

}