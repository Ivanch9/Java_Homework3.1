package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Vvedite massive chisel: ");
        Scanner scanner = new Scanner(System.in);
        String massive = scanner.nextLine();

        String [] array = massive.split(" ", 0);
        //for (int i=0; i<array.length; i++){
           // System.out.print(array[i]+" ");
        //}
        //System.out.println();
        for (int i = array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");
        }

    }
}
