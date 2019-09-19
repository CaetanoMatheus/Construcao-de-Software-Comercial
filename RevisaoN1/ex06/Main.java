public class Main {

      public static void main(String[] args) {
            System.out.println("Volume da piscina em:");
            System.out.println("Litros: " + BulkUnityConversion.mCubToL(1.890));
            System.out.println("Pés cúbicos: " + BulkUnityConversion.mCubToCubft(1.890));
            System.out.println("Centímeotros cúbicos: " + BulkUnityConversion.ltToCubCm(
                  BulkUnityConversion.mCubToL(1.890)));
      }
}