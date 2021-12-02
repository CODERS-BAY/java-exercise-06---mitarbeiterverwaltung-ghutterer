package application;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

  static  Employee[] employees = new Employee[2];
  public static void main(String[] args) {

    Department dept= new Department();
    Employee emp= new Employee(dept);


    emp.print();
    System.out.println(emp.isEquals(emp,dept));
    application();

  }


   private static int generateID() {
     Random random= new Random();
     return random.nextInt(1000);
   }




  private static void application() {
    Scanner input =  new Scanner(System.in);
    String answer;

    int i=0;

    do{
    System.out.println("Bitte legen Sie eine Abteilung an");
      Department dept= new Department(input.nextLine(),generateID(),input.nextLine(),input.nextLine());
      System.out.println("Bitte legen Sie einen Mitarbeiter an:");
      Employee emp= new Employee(input.nextLine(),input.nextLine(),generateID(),dept);
      System.out.println("Sie haben folenden Mitarbeiter angelegt:");
      emp.print();
      addEmployeestoArray(emp,i);
      System.out.println("Möchten Sie noch einen Mitarbeiter anlegen? j für ja und n für nein");
      answer = input.nextLine();
      i++;
    }while(answer.equals("j"));

    System.out.println("Auf Wiedersehen!");
    for (int j = 0; j <employees.length; j++) {
      if(employees[j]!=null)
      employees[j].print();
    }
  }

  private static void addEmployeestoArray(Employee emp,int i) {

    if(i==(employees.length-1)){
      Employee[] employees1 = new Employee[employees.length*2];
      for (int j = 0; j < employees.length ; j++) {
        employees1[j]=employees[j];
      }
      employees = employees1;
      employees[i]=emp;
    }else {
      employees[i] = emp;


      }
    }





    }




