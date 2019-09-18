public class Main {

      public static void main(String[] args) {

            // Creating Employees
            Employee employee1 = new Employee("João", 3000, "17/07/2017");
            Employee employee2 = new Employee("Maria", 3200, "17/12/2014");
            Employee employee3 = new Employee("Carlos", 1400, "17/09/2014");
            Employee employee4 = new Employee("Pedro", 1000, "17/04/2016");
            Employee employee5 = new Employee("Bianca", 1900, "17/01/2017");
            Employee employee6 = new Employee("Larissa", 3600, "17/01/2010");
            Employee employee7 = new Employee("Caio", 2500, "17/02/2007");
            Employee employee8 = new Employee("Henrique", 5000, "17/07/2019");
            Employee employee9 = new Employee("Paulo", 2000, "17/01/2015");

            // Creating employees array
            Employee[] employees1 = { employee1, employee2, employee3 };
            Employee[] employees2 = { employee4, employee5, employee6 };
            Employee[] employees3 = { employee7, employee8, employee9 };

            // Creating Departments
            Department deparment1 = new Department("RH", employees1);
            Department deparment2 = new Department("TI", employees2);
            Department deparment3 = new Department("Vendas", employees3);

            // Creating departments array
            Department[] deparments = { deparment1, deparment2, deparment3 };

            // Creating company
            Company company = new Company("My Company", "12.123.123/0001.12", deparments);

            // Raise IT salary
            int auxFun = 0;
            while (auxFun < 3) {
                  company.getDepartments()[1].getEmployees()[auxFun].setSalary(
                        company.getDepartments()[1].raiseSalary(
                              company.getDepartments()[1].getEmployees()[auxFun], 10
                        )
                  );
                  auxFun++;
            }
      }
}