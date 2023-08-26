import java.util.ArrayList;
import java.util.Scanner;

public class atm {
    int balance = 20000, Withdraw, Deposit;
    long acc_number;
    String acc_name;
    int acc_transfer;
    int flag;

    Scanner sc = new Scanner(System.in);
    ArrayList<String> history = new ArrayList<>();

    public void withdraw() {
        System.out.print("Enter the amount you want to withdraw : ");
        Withdraw = sc.nextInt();
        if (balance >= Withdraw) {
            balance = balance - Withdraw;
            System.out.println(
                    "Withdrawal successful for " + Withdraw + " amount from your account\n-----Collect your cash-----");
            String w = "Withdraw : " + Withdraw;
            history.add(w);
            flag += 1;
        } else {
            System.out.println("Insufficient balance in your account");
        }
    }

    public void deposit() {
        System.out.print("Enter the amount you want to deposit : ");
        Deposit = sc.nextInt();
        balance = balance + Deposit;
        System.out.println("You have successfully deposited " + Deposit + " amount");
        String d = "Deposit : " + Deposit;
        history.add(d);
        flag += 1;
    }

    void CheckBalance() {
        System.out.println("Your balance is : " + balance + "\nThank You");
    }

    void transfer() {
        System.out.println("-----Enter bank details-----");
        System.out.println("Account Number : ");
        acc_number = sc.nextLong();
        System.out.println("Enter amount : ");
        acc_transfer = sc.nextInt();

        if (acc_transfer > balance) {
            System.out.println("Insufficient balance in your account");
        } else {
            System.out.println("Account Holder's Name : ");
            acc_name = sc.next();
            balance -= acc_transfer;
            System.out.println("Transfer successful from your account");
            String t = "Transfer : " + acc_transfer;
            history.add(t);
            flag += 1;
        }
    }

    void Trans_history() {
        System.out.println("Your recent transactions are : ");
        for (int i = 0; i < flag; i++) {
            System.out.println(history.get(i));
        }
    }

    void exit() {
        System.out.println("---Thank you :)--- \n---Please visit again---");
        System.exit(0);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> customer = new ArrayList<>();
        customer.add(11111);
        customer.add(22222);
        customer.add(33333);
        customer.add(44444);
        customer.add(55555);

        ArrayList<Integer> pin = new ArrayList<>();
        pin.add(1234);
        pin.add(5678);
        pin.add(9100);
        pin.add(1112);
        pin.add(1314);

        while (true) {
            atm obj = new atm();
            System.out.println("\n");
            System.out.println("-----Welcome to PNB ATM :)-----\n-----Insert Your Card-----\n");
            System.out.print("Enter the account number : ");
            int acc_number = sc.nextInt();
            System.out.print("Enter the PIN : ");
            int atm_pin = sc.nextInt();

            for (int i = 0; i < 5;) {
                if (customer.get(i).equals(acc_number) && pin.get(i).equals(atm_pin)) {
                    while (true) {
                        System.out.println("\n");
                        System.out.println("----- LOGIN SUCCESSFUL -----");
                        System.out.println(
                                "1. Withdraw \n2. Deposit \n3. Check balance \n4. Account Transfer\n5. Transaction History\n6. Exit");
                        System.out.print("Choose the operation you would like to perform : ");
                        int num = sc.nextInt();
                        System.out.println("\n");

                        switch (num) {
                            case 1:
                                obj.withdraw();
                                break;
                            case 2:
                                obj.deposit();
                                break;
                            case 3:
                                obj.CheckBalance();
                                break;
                            case 4:
                                obj.transfer();
                                break;
                            case 5:
                                obj.Trans_history();
                                break;
                            case 6:
                                obj.exit();
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                    }
                } else {
                    System.out.println("Wrong password...User access denied!!");
                    break;
                }
            }
            sc.close();
        }
    }
}