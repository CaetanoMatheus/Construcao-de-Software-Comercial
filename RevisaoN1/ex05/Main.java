public class Main {

      public static void main(String[] args) {
            System.out.println("1 litro = " + BulkUnityConversion.ltToCubCm(1) + " centímetros cubicos.");
            System.out.println("1 metro cúbico = " + BulkUnityConversion.mCubToL(1) + " litros.");
            System.out.println("1 Cubic Meter = " + BulkUnityConversion.mCubToCubft(1) + " pés cúbicos.");
            System.out.println("1 galão americano = " + BulkUnityConversion.galToCubInch(1) + " polegadas cúbicas.");
            System.out.println("1 galão americano = " + BulkUnityConversion.galToLt(1) + " litros.");
      }
}