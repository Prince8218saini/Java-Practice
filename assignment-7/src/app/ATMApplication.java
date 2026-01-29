//package app;
//
//import java.util.Scanner;
//import model.Account;
//import repository.BankRepository;
//import service.*;
//
//public class ATMApplication {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        BankRepository repo = new BankRepository();
//
//        System.out.println("===== Welcome to ATM =====");
//
//       
//        Account acc=null;
//        for(int i =2;i>=0;i--)
//        {
//        	 System.out.print("Enter Account Number: ");
//        	 int  accNo = sc.nextInt();
//        	 acc = repo.getAccount(accNo);
//             if (acc == null) {
//            	 if(i==0)
//            	 {
//            		 System.out.println("Your Account have Locked.");
//            		 return;
//            	 }
//             System.out.println("Invalid account number ,"+ "Only "+(i)+" Attempt left..");
//             }else {
//            	 break;
//             } 
//        }
//
//        System.out.print("Enter PIN: ");
//        int pin = sc.nextInt();
//
//        if (pin != acc.getPin()) {
//            System.out.println("Incorrect PIN");
//            return;
//        }
//
//        ATMService service = new ATMServiceImpl(acc);
//
//        while (true) {
//        	 System.out.println("\n1. My Profile");
//            System.out.println("2. Check Balance");
//            System.out.println("3. Deposit");
//            System.out.println("4. Withdraw");
//            System.out.println("5. Mini Statement");
//            System.out.println("6. Change PIN");
//            System.out.println("7. Exit");
//
//            System.out.print("Choose option: ");
//            int choice = sc.nextInt();
//
//            switch (choice) {
//            case 1 ->{  Account account = service.getProfile();
//             System.out.println("\nAccount : "+account.getAccNo());
//     	     System.out.println("Holder name : "+account.getName());
//     	     System.out.println("Pin : "+account.getPin());
//     	     System.out.println("Balance : "+account.getBalance());
//            }
//                case 2 -> service.checkBalance();
//                case 3 -> {
//                    System.out.print("Enter amount: ");
//                    service.deposit(sc.nextDouble());
//                }
//                case 4 -> {
//                    System.out.print("Enter amount: ");
//                    service.withdraw(sc.nextDouble());
//                }
//                case 5 -> service.miniStatement();
//                case 6 -> {
//                	System.out.print("Enter Old PIN: ");
//                	boolean flag = service.checkPin(sc.nextInt());
//                	int count = 1;
//                	while(flag==false) 
//                	{
//                		System.out.print("Please Enter Valid Old PIN: ");
//                    	flag = service.checkPin(sc.nextInt());
//                    	count++;
//                    	if(count==3)
//                    	{
//                    		System.out.println("You have Crossed limit..");
//                    		return;
//                    	}
//                    	 
//                	}
//                    System.out.print("Enter new PIN: ");
//                    service.changePin(sc.nextInt());
//                }
//                case 7 -> {
//                    System.out.println("Thank you for using ATM");
//                    System.exit(0);
//                }
//                default -> System.out.println("Invalid choice");
//            }
//        }
//    }
//}
package app;

import java.util.Scanner;
import model.Account;
import repository.BankRepository;
import service.*;
import util.ATMUI;

public class ATMApplication {

    public static void main(String[] args) {
        ATMUI ui = new ATMUI();
        Scanner sc = new Scanner(System.in);
        BankRepository repo = new BankRepository();
        ui.welcome();
        Account acc=null;
        for(int i =2;i>=0;i--)
        {
        	 System.out.print("Enter Account Number: ");
        	 int  accNo = sc.nextInt();
        	 acc = repo.getAccount(accNo);
             if (acc == null) {
            	 if(i==0)
            	 {
            		 ui.error("Your Account have Locked.");
            		 return;
            	 }
             ui.info("Invalid account number ,"+ "Only "+(i)+" Attempt left..");
             }else 
            	 break;
        }
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        if (pin != acc.getPin()) {
            ui.error("Incorrect PIN");
            return;
        }
        ATMService service = new ATMServiceImpl(acc);
        while (true) {
        	System.out.print("\n");
        	ui.loading();
        	ui.menu();
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
            case 1 -> {
                Account account = service.getProfile();

                System.out.println("""
                ╔════════════ 👤 MY PROFILE ════════════╗
                🏦 Account No   : %d
                👨 Holder Name  : %s
                🔐 PIN          : %d
                💰 Balance      : ₹%.2f
                ╚═══════════════════════════════════════╝
                """.formatted(
                        account.getAccNo(),
                        account.getName(),
                        account.getPin(),
                        account.getBalance()
                ));
            }

            case 2 -> {
                ui.info("Fetching your balance 💰...");
                service.checkBalance();
            }

            case 3 -> {
                System.out.print("💵 Enter deposit amount: ₹ ");
                double amount = sc.nextDouble();
                service.deposit(amount);
                ui.success("Amount credited successfully 💸");
            }

            case 4 -> {
                System.out.print("💸 Enter withdraw amount: ₹ ");
                double amount = sc.nextDouble();
                service.withdraw(amount);
            }

            case 5 -> {
                ui.info("Generating mini statement 🧾...");
                service.miniStatement();
            }

            case 6 -> {
                System.out.print("🔐 Enter Old PIN: ");
                boolean flag = service.checkPin(sc.nextInt());
                int count = 1;
                while (!flag) {
                    ui.error("Incorrect PIN ❌");
                    System.out.print("🔁 Re-enter Old PIN: ");
                    flag = service.checkPin(sc.nextInt());
                    count++;

                    if (count == 3) {
                        ui.error("PIN attempts exceeded 🔒 Account temporarily blocked");
                        return;
                    }
                }

                System.out.print("🆕 Enter New PIN: ");
                service.changePin(sc.nextInt());
                ui.success("PIN updated successfully 🔁🔐");
            }

            case 7 -> {
                ui.thankYou();
                System.exit(0);
            }

            default -> ui.error("Invalid choice ❗ Please select correct option");

            }
        }
    }
}
