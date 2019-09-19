import java.util.Scanner;
import java.util.Arrays;

public class Main {

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[10];
            int x = 0;
            int a;
            int counter = 0;

            while (counter < arr.length) {
                  System.out.print("Insira um número: ");
                  a = scanner.nextInt();
                  if (a <= 0) continue;
                  arr[counter] = a;
                  counter++;
            }

            System.out.println("Array = " + Arrays.toString(arr));

            while(x <= 0) {
                  System.out.print("\nInsira um valor válido para 'X' ");
                  x = scanner.nextInt();
            }

            System.out.println("X = " + x);
            System.out.println("\nArray ordenado de forma: " + ascending(arr));
            System.out.println("Maior que 'X': " + biggerThanX(x, arr));
            System.out.println("Menor que 'X': " + lessThanX(x, arr));
            System.out.println("Igual a 'X': " + equalsX(x, arr));
      }

      public static int biggerThanX(int x, int[] array) {
            int aux = 0;
            for (int a : array) {
                  if (a > x) aux++;
            }
            return aux;
      }

      public static int lessThanX(int x, int[] array) {
            int aux = 0;
            for (int a : array) {
                  if (a < x) aux++;
            }
            return aux;
      }

      public static int equalsX(int x, int[] array) {
            int aux = 0;
            for (int a : array) {
                  if (a == x) aux++;
            }
            return aux;
      }

      public static String descending(int[]array) {
            int aux = array[0];
            for (int i = 1; i < array.length; i++) {
                  if (!(aux > array[i])) return "Aleatório";
                  aux = array[i - 1];
            }
            return "Decrescente";
      }

      public static String ascending(int[] array) {
            int aux = array[0];
            for (int i = 1; i < array.length; i++) {
                  if (aux >= array[i]) return descending(array);
                  aux = array[i - 1];
            }
            return "Crescente";
      }

}   