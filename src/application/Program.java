package application;
import entities.Produtcs;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produtcs product = new Produtcs();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("product data: " + product);

        System.out.println();
        System.out.print("Enter the number products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.print("update data: " + product);

        System.out.println();
        System.out.print("Enter the number products to be remove in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.print("update data: " + product);

        sc.close();

    }
}
