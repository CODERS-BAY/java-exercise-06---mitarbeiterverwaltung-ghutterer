package application;

public class Employee {
  String firstName="Max";
  String lastName="Mustermann";
  int id=123;
  final Department dept;

  public Employee(String firstName, String lastName, int id, Department dept) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.dept = dept;
  }

  public Employee(Department dept){

    this.dept = dept;
  }


  public void print() {
    System.out.println("Der Mitarbeiter "+id+" "+firstName+" "+lastName+" arbeitet in der Abteilung "+ dept.name+" in "+dept.city);
    }
    public boolean isEquals(Employee other,Department other1) {
      return other.id == other1.id;
    }
  }

