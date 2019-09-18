public class Department {

      private String name;
      private Employee[] employees = new Employee[100];

      public Department() {

      }

      public Department(String name, Employee[] employees) {
            this.name = name;
            this.employees = employees;
      }

      public double raiseSalary(Employee employee, double percent) {
            return ((employee.getSalary() * percent) / 100) + employee.getSalary();
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getName() {
            return this.name;
      }

      public void setEmployees(Employee[] employees) {
            this.employees = employees; 
      }

      public Employee[] getEmployees() {
            return this.employees;
      }
}