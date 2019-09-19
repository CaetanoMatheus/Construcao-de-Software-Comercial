public class TecnicalAssistent extends Assistent {

      private double bonus;

      public TecnicalAssistent(String name, double salary, long id, double bonus) {
            super(name, salary, id);
            this.bonus = bonus;
      }

      @Override
      public double anualEarnings() {
            return (this.salary + this.bonus )* 12;
      }

      @Override
      public String toString() {
            return "Nome: " + this.name
            + "\nSalário: " + this.salary
            + "\nMatrícula : " + this.id
            + "\nBonus : " + this.bonus;
      }

      public double getBonus() {
            return bonus;
      }

      public void setBonus(double bonus) {
            this.bonus = bonus;
      }
}