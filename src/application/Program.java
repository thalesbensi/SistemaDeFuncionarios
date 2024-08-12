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
        System.out.print("Enter the employee id that will ha ve salary increase");
        int idsalary = sc.nextInt();
        //Employees emp  = list.stream().filter (x -> x.getId() == id).findFirst().orElse(null);
        int position = position(list, idsalary);
        if (position == -1){
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage");
            double percent = sc.nextDouble();
            list.get(position).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employees emp : list){
            System.out.println(emp);
        }

        sc.close();
    }

    public static int position(List<Employees> list, int id) {
        for(int i= 0; i<list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    
}
