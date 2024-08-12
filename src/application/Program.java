package application;

import entitities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employees> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Emplyee #" + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            Employees emp = new Employees(id, name, salary);

            list.add(emp);
        }
        System.out.print("Enter the employee id that will ahve salary increase");
        int idsalary = sc.nextInt();
        if ( )
















        sc.close();
    }
}
