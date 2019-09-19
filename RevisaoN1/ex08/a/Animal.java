public class Animal {

      protected String name;
      protected String breed;

      public Animal() {

      }

      public Animal(String name) {

      }

      public String walk() {
            return "Caminhando";
      }

      public String getName() {
            return this.name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getBreed() {
            return this.breed;
      }

      public void setBreed(String breed) {
            this.breed = breed;
      }    
}