public class AdministrativeAssistent extends Assistent {

      private String shift;
      private double additional;

      public AdministrativeAssistent(String name, double salary, long id, String shift, double additional) {
            super(name, salary, id);
            this.shift = shift;
            this.additional = additional;
      }

      @Override
      public double anualEarnings() {
            return (this.salary * 12) + this.additional;
      }

      @Override
      public String toString() {
            return "Nome: " + this.name
            + "\nSalário: " + this.salary
            + "\nMatrícula : " + this.id
            + "\nTurno : " + this.shift
            + "\nAdicional noturno : " + this.additional;
      }

      public String getShift() {
            return this.shift;
      }

      public void setShift(String shift) {
            this.shift = shift;
      }

      public double getAdditional() {
            return this.additional;
      }

      public void setAdditional(double additional) {
            this.additional = additional;
      }
}