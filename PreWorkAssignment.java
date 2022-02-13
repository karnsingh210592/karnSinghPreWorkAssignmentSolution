import java.util.Scanner;

class PreWorkAssignment {
    public void checkPalindrome(){
        System.out.println("Enter number to check palindrom:");
        Scanner scanData = new Scanner(System.in);
        int number = scanData.nextInt(); 
        int remainder, sum=0, temp;
        temp = number;
        while(number > 0){
        remainder = number % 10;  
        sum=(sum*10)+remainder;    
        number=number/10; 
        }
        if(temp==sum)    
        System.out.println("palindrome number");    
        else    
        System.out.println("not palindrome"); 
    } 

    public void printPattern(){
        System.out.println("Enter number to print pattern:");
        Scanner scanData = new Scanner(System.in);
        int number = scanData.nextInt();
        for(int i=number-1; i>=0; i--){
            for(int k=0; k <= i; k++){
                System.out.print("*");
            }
            number--;
            System.out.println("");
        } 
    }

    public void checkPrime(){
        System.out.println("Enter number to check prime:");
        Scanner scanData = new Scanner(System.in);
        int number = scanData.nextInt();
        int count = 0;
        for(int i=1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count > 2){
            System.out.println("Not a prime number!");
        }else{
             System.out.println("Prime number!");
        }
    }

    public void printFibonacci(){
        System.out.println("Enter number to print Fibonacci series:");
        Scanner scanData = new Scanner(System.in);
        int number = scanData.nextInt();
        System.out.println("Fibonacci Series is:");
        int number1 = 0;
        int number2=1;
        int temp;
        System.out.print("01");
        for(int i=2; i<number; i++){
            temp = number1 + number2;
            number1 = number2;
            number2=temp;
            System.out.print(temp);
        }
    }

    public static void main(String[] s){
        int userInput;
        Scanner scanInput = new Scanner(System.in);
        PreWorkAssignment obj = new PreWorkAssignment();
        boolean exit = false;

        while(!exit){
        System.out.println("Welcome: Choose one of the options to continue");
        System.out.println("1. Check for palindrome number \n2. Prints the pattern of stars in decreasing order based on the input\n3. Check whether the input number is a prime number\n4. Print Fibonacci series of size n with first two numbers as 0, 1");
        userInput = scanInput.nextInt();

        switch(userInput){
            case 1: obj.checkPalindrome();
            break;
            case 2: obj.printPattern();
            break;
            case 3: obj.checkPrime();
            break;
            case 4: obj.printFibonacci();
            break;
            default: System.out.println("Wrong selection! Exiting."); 
            exit = true;
            break;
        }
        }
    }
}