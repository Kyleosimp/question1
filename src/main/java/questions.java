import java.util.Arrays;

public class questions {
    // Question 1
    public static int getLastIndex(String[] names){
        System.out.println(names.length);
        return 0;
}
    // Question 2
    public static String getSecondToLastIndex(String[] names) {
        return names[names.length - 2];
    }
    // Question 3
    public static String getFirstElement(String[] names) {
        System.out.println(names[0]);
        return null;
    }
    //Question 4
    public static String getLastElement(String[] names) {
        System.out.println(names[names.length -1 ]);
        return null;
    }
    //Question 5
    public static String getSecondToLastElement(String[] names) {
        System.out.println(names[names.length - 2]);
        return null;
    }
    // Question 6
    public static int getSum(int[] ints) {
        System.out.println(ints[0] + ints[1] + ints[2] + ints[3] + ints[4] + ints[5] + ints[6] + ints[7] + ints[8]);
        return 0;
    }
    //Question 7
    public static int getAverage(int[] ints) {
        int sum = ints[0] + ints[1] + ints[2] + ints[3] + ints[4] + ints[5] + ints[6] + ints[7] + ints[8];
        int avg = sum/8;
        System.out.println(avg);
        return 0;
    }
    // Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String odd;
        odd = "";
        for (int numeros: numbers){
            if (numeros%2==1){
                odd = odd + numeros;
                odd = odd + ",";
            }
        }
        System.out.println(odd);
    return odd;
    }
    // Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String even = "";
        for (int numeros: numbers){
            if (numeros%2==0){
                even = even + numeros;
                even = even + ",";
            }
        }
        System.out.println(even);
        return null;
    }
    // Question 10
//        public static boolean contains(String[] names, String element) {
//        int length = -1 + names.length;
//        for (int i = 0; i <= length; i++) {
//            if (names[i].equals(element)) {
//            }
//        }
//        return true;
//    }
    // Question 11
//        public static int getIndexByElement(String[] names, String element) {
//            int length = -1 + names.length;
//            int answer = 0;
//            for (int i = 0; i <= length; i++)
//                if (names[i].equals(element)) answer += i;
//            System.out.println(answer);
//        return 0;
//    }
    //Question 13
    public static void printOddNumbersInRange(int start, int end){
        if (start%2==0){
            for (int i=1+start; i<end; i+=2){
                if (i==(i-1))
                    System.out.print(i);
                else
                    System.out.print(i+",");
//                System.out.print(21);
//                for (int i=1+start; i<end; i+=2){
//                    System.out.print(","+i);
            }
        }
    }
    //Question 14
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String deez = "";
        for (int i=0; i<n; i++){
            deez += str;
        }
        return deez;
    }
    //Question 15
    public static int wordsInAStringCounter(String str){
        return str.split(" ").length;
    }
    //Question 16 - A, E, I, O, U
    public static int vowelsCounter(String str){
        int length = str.length();
        int counter =0;
        for (int i=0; i<length; i++){
            if (str.charAt(i)=='A'||str.charAt(i)=='a') {
                counter += 1;
            }if (str.charAt(i)=='E'||str.charAt(i)=='e') {
                counter += 1;
            }if (str.charAt(i)=='I'||str.charAt(i)=='i') {
                counter += 1;
            }if (str.charAt(i)=='O'||str.charAt(i)=='o') {
                counter += 1;
            }if (str.charAt(i)=='U'||str.charAt(i)=='u'){
                    counter+=1;
            }
        }
        System.out.println(counter);
        return 0;
    }
    //Question 17

    public static String[] swap(String[] stringArray) {
        String[] solution = new String[stringArray.length];
        int x=stringArray.length-1;
        for (int i=0; i<stringArray.length; i++){
            solution[i] = stringArray[x];
            x--;
            if (x<0){
                break;
            }
        }
        System.out.println(Arrays.toString(solution));
        return  null;
    }
    //Question 18
    /**
     * Given the following legend
     *
     * f   >>   7
     * s   >>   $
     * 1   >>   !
     * a   >>   @
     *
     * your method should replace any character represented by a key in the legend, with its corresponding value.
     * Input  = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
     *
     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
     */
    public static String replaceCharacters(String str) {
        String newStringf = str.replace('f', '7').replace('s', '$').replace('1', '!').replace('a', '@');
        return newStringf;

    }

    public static void main(String[] args) {
        //namelist define
        String[] nameList = {"Kyle", "Yev", "John", "Luis", "Renne", "Kim", "Isaiah", "Emoni", "Luis"};
        //int define
        int[] intList = {2, 3, 4, 5, 6, 7, 8, 9, 19};
        //string farmer
        String farmer = "The Farmer went to the store to get 1 dollar's worth of fertilizer";
        //random number
        int favoriteNumber = 34;
        //random number 2
        int myAge = 22;
        //name
        String myName = "kyle ochate";
        //ArrayList random food
        String[] foodMenu = {"burgers", "fries", "milkshake", "fried chicken", "soda", "mashed potatoes"};


//        //Response 1
//        getLastIndex(nameList);
////        //Response 2
//        System.out.println(getSecondToLastIndex(nameList));
////        //Response 3
//        getFirstElement(nameList);
////        //Response 4
//        getLastElement(nameList);
////        //Response 5
//        getSecondToLastElement(nameList);
////        //Response 6
//        getSum(intList);
////        //Response 7
//        getAverage(intList);
////        //Response 8
//        extractAllOddNumbers(intList);
////        //Response 9
//        extractAllEvenNumbers(intList);
////        //Response 10
////        contains(nameList);
////        //Response 11
////        getIndexByElement(nameList);
//        //Response 13
//        printOddNumbersInRange(myAge, favoriteNumber);
//        //Response 14
//        System.out.println(printGivenStringTimesNumberGiven(myName, favoriteNumber));
        //Response 15
//        System.out.println(wordsInAStringCounter(farmer));
        //Response 16
//        vowelsCounter(farmer);
//        //Response 17
//        swap(foodMenu);
//        //Response 18
        System.out.println(replaceCharacters(farmer));



    }

    }
