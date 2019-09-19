public class Employee {

      protected String name;
      protected double salary;

      public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
      }

      //addAumento()
      public boolean raiseSalary(double amount) {
            this.salary += amount;
            return true;
      }

      //ganhoAnual()
      public double anualEarnings() {
            return this.salary * 12;
      }

      @Override //exibeDados()
      public String toString() {
            return "Nome: " + this.name
            + "\nSalário: " + this.salary;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getName() {
            return this.name;
      }

      public void setSalary(double salary) {
            this.salary = salary;
      }

      public double getSalary() {
            return this.salary;
      }
}