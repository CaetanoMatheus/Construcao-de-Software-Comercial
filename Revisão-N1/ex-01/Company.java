public class Company {

      private String name;
      private final String CNPJ;
      private Department[] departments = new Department[10];

      public Company() {
            this.CNPJ = "00.000.000/0001-00";
      }

      public Company(String name, String CNPJ, Department[] departments) {
            this.name = name;
            this.CNPJ = CNPJ;
            this.departments = departments;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getName() {
            return this.name;
      }

      public String getCNPJ() {
            return this.CNPJ;
      }

      public void setDepartments(Department[] departments) {
            this.departments = departments;
      }

      public Department[] getDepartments() {
            return this.departments;
      }
}