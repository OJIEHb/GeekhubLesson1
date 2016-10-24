import java.util.Scanner;
/**
 * Created by andrey on 21.10.16.
 */
public class Main {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        boolean end = false;

        System.out.println("Enter a number:");

        while(!end){
            String number = reader.next();
            if (number.startsWith("+")){
                number = number.substring(1,number.length());
            }
            if(checkCountryCode(number)&&checkIsNumber(number)&&
                    checkLength(number)&&checkOperatorCode(number)){
                while(!(number.length()==1)){
                    int sum=0;
                    for(int i = 0; i < number.length();i++){
                        sum += Integer.parseInt(""+number.charAt(i));
                    }
                    number = ""+sum;
                }
                switch (Integer.parseInt(number)){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                end = true;
            }
        }

    }

    private static boolean checkLength(String s) {
        if(s.length()>9 && s.length() < 15){
            System.out.println("Length is correct");
            return true;
        }else{
            System.out.println("Length is not correct");
            return false;
        }
    }

    private static boolean checkOperatorCode(String s){
        String [] operatorCodes = new String[]{"050","063","066","067","068","093","095","096","097","098"};
        for(String code:operatorCodes ){
            if(s.startsWith(code,s.length()-10)){
                System.out.println("Operator code is correct");
                return true;
            }
        }
        System.out.println("Try again! Invalid operator code");
        return false;
    }

    private static boolean checkCountryCode(String s){
        String [] countryCodes = new String[]{"380","+380","0","80","00380"};
        for(String code:countryCodes ){
            if(s.startsWith(code)){
                System.out.println("Country code is correct");
                return true;
            }
        }
        System.out.println("Try again!");
        return false;
    }

    private static boolean checkIsNumber(String s){
        if(s.matches("[0-9]*")){
            System.out.println("It`s a number");
            return true;
        }else{
            System.out.println("It`s not a number: " + s);
            return false;
        }
    }

}
