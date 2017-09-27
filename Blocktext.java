import java.util.Scanner;

public class Blocktext {

    public static void main(String[] args) {
        Scanner inputSC = new Scanner(System.in);
        bank_account user1 = new bank_account();

        //-------------- account name -----------------------
        System.out.println("Please enter your name :");
        String inputCustName = inputSC.nextLine();

        user1.setCustomer_name(inputCustName);
        String custName = user1.getCustomer_name();

        //-------------- account email-----------------------
        System.out.println("Please enter your email address :");
        String inputEmail = inputSC.nextLine();

        user1.setEmail(inputEmail);
        String email = user1.getEmail();

        //-------------- phone number------------------------

        System.out.println("Please enter your phone number :");
        int inputPhone = inputSC.nextInt();

        user1.setPhone_no(inputPhone);
        int Phone = user1.getPhone_no();

        //-------------- account number----------------------

        System.out.println("Please enter your account number : (XXXXXX)");
        int inputAccNo = inputSC.nextInt();

        int setAccNO = user1.setAcc_no(inputAccNo);
        if (setAccNO == -1) {
            System.out.println("please enter your account number with 6 digit");
        } else {
            int finalSetAccNo = user1.getAcc_no();
            //-------------- balance-----------------------------

            System.out.println("Please enter your initial balance : ");
            int inputBal = inputSC.nextInt();

            user1.setBalance(inputBal);
            int inBal = user1.getBalance();

            //-------------- balance deposit --------------------

            System.out.println("Please enter the amount to be deposit : ");
            int incBalance = inputSC.nextInt();

            int increasedBal = user1.depBalance(incBalance);
            System.out.println("your new balance after deposit is : \n" + increasedBal);

            //-------------- balance withdraw -------------------

            System.out.println("Please enter the amount to be withdrawn : ");
            int decBalance = inputSC.nextInt();

            int decreasedBal = user1.withBalance(decBalance);
            if (decreasedBal <= 0) {
                System.out.println("insufficient balance to be withdraw");
                System.out.println();
                System.out.println();
                System.out.println("Your name is: " + custName + "\nyour email is: " + email + "\nyour phone number is: "
                        + Phone + "\nyour account number is: " + finalSetAccNo + "\nand your final balance is: " + increasedBal);
            } else {
                System.out.println("your new balance after withdraw is : \n" + decreasedBal);
                System.out.println();
                System.out.println();
                System.out.println("Your name is: " + custName + "\nyour email is: " + email + "\nyour phone number is: "
                        + Phone + "\nyour final account number is: " + finalSetAccNo + "\nand your final balance is: " + decreasedBal);
            }


        }


    }
}