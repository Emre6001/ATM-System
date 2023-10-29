import java.util.Scanner;

public class Atm {
    public static void main(String[] args){
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3; 
        int balance = 1500;
        int select;

        while(right >0){
            System.out.print("Enter your username: ");
            userName = input.nextLine();

            System.out.print("Enter your password: ");
            password = input.nextLine();

            if(userName.equals("javaci") && password.equals("12345")){
                System.out.println("Welcome to the system " + userName);

                do{ 
            
                    System.out.println("1- Withdraw Money\n2- Deposit Money\n3- Check Balance\n4- Exit");
                    
                    System.out.print("Choose your transaction: ");
                    select = input.nextInt();

                    if(select == 1){
                        System.out.print("How much money do you want to withdraw: ");
                        int price = input.nextInt();
                        if(price > balance){
                            System.out.println(userName + " you dont have a enough money in your account.");
                        }
                        else{
                            balance -= price;
                            System.out.println("New balance: " + balance);
                        }
                    }
                    else if(select == 2){
                        System.out.print("How much money do you want to deposit: ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("New balance: " + balance);
                    }
                    else if(select == 3){
                        System.out.println("Your balance: " + balance);
                    }
                    
                }while(select != 4);
                System.out.println("See you later " + userName);
                break;
               
            }
            else{
                right--;
                System.out.println("Wrong username or password. Please try again.");
                System.out.println("You have " + right + " right(s) left.");
            }
        }
        input.close();
        


    }
}
