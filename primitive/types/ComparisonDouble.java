package primitive.types;

import java.util.Scanner;

public class ComparisonDouble {

  public static void main(String[] args) {
    System.out.println("""
        Операции над double/float
        1. Сравнить
        2. Округлить
        3. Отбросить дробную часть
        Укажите 1, 2 или 3""");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    switch (x) {
      case 1 -> {
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        float b = scanner.nextFloat();
        compare(a, b);
      }
      case 2 -> {
        System.out.println("Введите число:");
        float a = scanner.nextFloat();
        System.out.printf("Результат:\nОкругленное значение: %d", Math.round(a));
      }
      case 3 -> {
        System.out.println("Введите число:");
        float a = scanner.nextFloat();
        System.out.println("Результат:\nЧисло без дробной части: %d" + (long) a);
      }
      default -> System.out.println("Необходимо указать 1, 2 или 3");
    }
  }

  public static void compare(double a, float b) {
    if (Math.abs(a - b) < 0.0000001) {
      System.out.println("Результат:\nчисла равны");
    } else if (a > b) {
      System.out.println("Результат:\nчисла не равны. Больше первое число: " + a);
    } else {
      System.out.println("Результат:\nчисла не равны. Больше второе число: " + b);
    }
  }
}

