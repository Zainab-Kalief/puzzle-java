import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Puzzle {
  public int sumAndGreaterThan(int[] arr) {
    int sum = 0;
    for(int val:arr) {
      sum += val;
    }
    return sum;
  }
  public ArrayList<Integer> sumAndGreaterThan(int[] arr, int y) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    for(int val:arr) {
      if(val > y) result.add(val);
    }
    return result;
  }
  public void shuffleAndLength(List<String> arr) {
    Collections.shuffle(arr);
    for(String val: arr) {
      System.out.println(val);
    }
  }
  public ArrayList<String> shuffleAndLength(List<String> arr, int num) {
    ArrayList<String> result = new ArrayList<String>();
    for(String val:arr) {
      if(val.length() > num) result.add(val);
    }
    return result;
  }
  public List<Character> alphabet(List<Character> arr) {
    Collections.shuffle(arr);
    return arr;
  }

  public ArrayList<Integer> randomNumbers(int val) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    int start = 0;
    while(start < val) {
      int randomNum = ThreadLocalRandom.current().nextInt(55, 100 + 1);
      result.add(randomNum);
      start ++;
    }
    return result;
  }
  public ArrayList<Integer> arraySorted(ArrayList<Integer> arr) {
    Collections.sort(arr);
    return arr;
  }
  public List<Integer> arrayMinAndMax(ArrayList<Integer> arr) {
    int min = arr.get(0); int max = arr.get(0);
    for(int val:arr) {
      if(val < min) min = val;
      if(val > max) max = val;
    }
    List<Integer> result = new ArrayList<>(Arrays.asList(min, max));
    return result;
  }
  public ArrayList<String> randomStrings(List<Character> arr) {
    int runner = 0;
    ArrayList<String> result = new ArrayList<String>();
    while(runner < 10) {
      int ind1 = ThreadLocalRandom.current().nextInt(0, arr.size());
      int ind2 = ThreadLocalRandom.current().nextInt(0, arr.size());
      int ind3 = ThreadLocalRandom.current().nextInt(0, arr.size());
      int ind4 = ThreadLocalRandom.current().nextInt(0, arr.size());
      int ind5 = ThreadLocalRandom.current().nextInt(0, arr.size());
      String word = String.format("%c%c%c%c%c", arr.get(ind1), arr.get(ind2), arr.get(ind3), arr.get(ind4), arr.get(ind5));
      result.add(word);
      runner ++;
    }
    return result;
  }

}
