public class Employee {

      private String name;
      private double salary;
      private String admission;

      public Employee() {

      }

      public Employee(String name, double salary, String admission) {
            this.name = name;
            this.salary = salary;
            this.admission = admission;
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

      private void setAdmission(String admission) {
            this.admission = admission;
      }

      private String getAdmission() {
            return this.admission;
      }
}