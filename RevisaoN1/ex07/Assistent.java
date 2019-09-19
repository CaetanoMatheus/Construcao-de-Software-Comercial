public class Assistent extends Employee {

      protected long id; 

      public Assistent(String name, double salary, long id) {
            super(name, salary);
            this.id = id;
      }

      @Override
      public String toString() {
            return "Nome: " + this.name
            + "\nSalário: " + this.salary
            + "\nMatrícula : " + this.id;
      }

      public void setId(long id) {
            this.id = id;
      }

      public long getId() {
            return this.id;
      }
}