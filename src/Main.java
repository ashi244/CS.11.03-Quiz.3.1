public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if (grade >= 90){
            return 'A';
        }
        else if ((grade >= 80) && (grade <= 89)){
            return 'B';
        }
        else if ((grade >= 70) && (grade <= 79)){
            return 'C';
        }
        else if ((grade >= 60) && (grade <= 69)){
            return 'D';
        }
        else if ((grade >= 50) && (grade <= 59)){
            return 'E';
        }
        else{
            return 'F';
        }
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num){
        if ((num % 3) == 0){
            if ((num % 5) == 0){
                return "fizzbuzz";
            }
            return "fizz";
        }
        else if ((num % 5) == 0){
            return "buzz";
        }
        return "unlucky";
    }
    // Question 3 - frontBack
    public static String frontBack(String str){
        if (str.length() < 2){
            return str;
        }
        String firstTwo = str.substring(0,2);
        return firstTwo + str + firstTwo;
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if (((a + b) == c) || ((c + b) == a) || ((a + c) == b)){
            return true;
        }
        return false;
    }
    // Question 5 - endUp
    public static String endUp(String str){
        if (str.length() < 3){
            return str.toUpperCase();
        }
        String lastThree = str.substring(str.length() - 3, str.length());
        return str.substring(0, str.length() - 3) + lastThree.toUpperCase();
    }
}
