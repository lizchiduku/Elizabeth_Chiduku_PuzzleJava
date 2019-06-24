import java.util.*;

public class PuzzleJava{
  
/*Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)*/
  
  public ArrayList<Integer> printSumAndGreaterThanTen(){
    int[] arr = {3,5,1,2,7,9,8,13,25,32};
    ArrayList<Integer> newArr1 = new ArrayList<Integer>();
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum = sum + i;
      if(arr[i] > 10){
        newArr1.add(arr[i]);
      }
    }
    System.out.println(sum);
    return newArr1;
  }
  
  /*Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.*/

  public ArrayList<String> printNames(){
    String[] arr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    ArrayList<String> newArr2 = new ArrayList<String>();
    Collections.shuffle(Arrays.asList(arr));

    for(int i = 0; i < arr.length; i++){
      if(arr[i].length() > 5){
        newArr2.add(arr[i]);
      }
    }
    System.out.println(Arrays.toString(arr));
    return newArr2;
  }
  
/* Creating an array that contains all 26 letters of the alphabet-26 values). Shuffle the array, display the first and last letter of the array. If the first letter in the array is a vowel, have it display a message.*/
  
  
  public ArrayList<Character> printAlphabet(){
    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    ArrayList<Character> alphabet = new ArrayList<Character>();
    for(int i = 0; i < letters.length; i++){
      alphabet.add(letters[i]);
    }
    ArrayList<Character> newArr3 = new ArrayList<Character>();
    Collections.shuffle(alphabet);

    char firstLetter = alphabet.get(0);
    System.out.println(firstLetter);

    char lastLetter = alphabet.get(25);
    System.out.println(lastLetter);

    String vowels = "aeiou";
    if(vowels.contains(Character.toString(firstLetter))){
      System.out.println("You've got a vowel!");
      newArr3.add(firstLetter);
      return newArr3;
    }
    else{
      newArr3.add(firstLetter);
      newArr3.add(lastLetter);
      return newArr3;
    }
  }
  
  /* Generate and return an array with 10 random numbers between 55-100*/

  public int[] generateRandom(){
    int[] arr;
    arr = new int[10];
    Random rand = new Random();
    for(int i = 0; i < 10; i++){
      int randomNum = rand.nextInt(45) + 55;
      arr[i] = randomNum;
    }
    return arr;
  }

  /*Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value*/
  
  public int[] sortedRandom(){
    int[] arr;
    arr = new int[10];
    Random rand = new Random();
    for(int i = 0; i < 10; i++){
      int randomNum = rand.nextInt(45) + 55;
      arr[i] = randomNum;
    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(arr[0]);
    System.out.println(arr[9]);
    return arr;
  }

  /*Create a random string that is 5 characters long*/
  
  public String randomString(){
      String letters = "abcdefghijklmnopqrstuvwzyz";
      ArrayList<Character> string = new ArrayList<Character>();
      Random rand = new Random();
      for(int i = 0; i < 5; i++){
        int randomNum = rand.nextInt(26);
        string.add(letters.charAt(randomNum));
      }
      String myString = "";
      for (Character c : string) {
        myString += c;
      }
      return myString;
    }
/*Generate an array with 10 random strings that are each 5 characters long*/
  
  public String[] fiveStrings(){
    String[] arr;
    arr = new String[10];
    for(int i = 0; i < 10; i++){
      String newString = randomString();
      arr[i] = newString;
    }
    return arr;
  }
}
