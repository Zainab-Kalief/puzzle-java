import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleTest {
  public static void main(String[] args) {
    Puzzle result = new Puzzle();
    int arr[] = {3,5,1,2,7,9,8,13,25,32};
    System.out.println(result.sumAndGreaterThan(arr));
    System.out.println(result.sumAndGreaterThan(arr, 10));
    List<String> arr2 = new ArrayList<>(Arrays.asList("Wura", "Dami", "Temi", "Kunmi"));
    result.shuffleAndLength(arr2);
    System.out.println(result.shuffleAndLength(arr2, 4));
    List<Character> arr3 = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
    System.out.println(result.alphabet(arr3));
    ArrayList<Integer> arr4 = result.randomNumbers(7);
    System.out.println(arr4);
    System.out.println(result.arraySorted(arr4));
    System.out.println(result.arrayMinAndMax(arr4));
    String randomWord = String.format("%c%c%c%c%c", arr3.get(0), arr3.get(1), arr3.get(2), arr3.get(3), arr3.get(4));
    System.out.println(randomWord);
    System.out.println(result.randomStrings(arr3));
  }
}
