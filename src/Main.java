import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static final int SIZE_ARRAY = 50;

    public static void main(String[] args) {
//        System.out.println("Przeszukiwanie z wartownikiem");
//        int[] cyfryTablicy = new int[50];
//        for (int i = 0; i < cyfryTablicy.length; i++) {
//            cyfryTablicy[i] = (int) (Math.random() * 100);
//            System.out.print(cyfryTablicy[i] + ", ");
//        }
        System.out.println("Podaj cyfrę, którą chcesz znaleźć");
        Scanner scanner = new Scanner(System.in);
        int lockedForNumber = scanner.nextInt();

        int result = findNumberInArraySentry(lockedForNumber, fillArray());

        if(result == SIZE_ARRAY){
            System.out.println("Podanej liczby nie ma w tablicy");
        }else{
            System.out.println("\nSzukana liczba jest w zbiorze pod indexem " + result);
        }
    }


    public static int[] fillArray() {
        int[] arrayNumbers = new int[SIZE_ARRAY];

        for (int i = 0; i < SIZE_ARRAY; i++) {
            if (i % 10 == 0) System.out.println();
            arrayNumbers[i] = (int) (Math.random() * 100);
            System.out.printf(arrayNumbers[i] + ", ");
        }
        return arrayNumbers;

    }

    public static int findNumberInArraySentry(int cyfraPodana, int[] arrayNumbers) {
        int[] arrayNumberWithSentry = new int[SIZE_ARRAY + 1];
        for (int i = 0; i < SIZE_ARRAY; i++) {
            arrayNumberWithSentry[i] = arrayNumbers[i];
        }

        arrayNumberWithSentry[SIZE_ARRAY] = cyfraPodana;
        int indexNumber = 0;
        for (int i = 0; i <= SIZE_ARRAY; i++) {
            if (arrayNumberWithSentry[i] == cyfraPodana) {
                indexNumber = i;
                break;
            }
        }
        return indexNumber;
    }

}
