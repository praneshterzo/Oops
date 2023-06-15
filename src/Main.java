import java.util.HashMap;
import java.util.Scanner;
public class Main extends Exception {
    public static void accInfo(int accNo, int pin){
        int bal=10_000;
        System.out.println("Type 1 -> Balance enquiry\nType 2 -> Withdraw\nType 3 -> Change Pin\nType 4 -> Exit");
        Scanner UserInput = new Scanner(System.in);
        int res = UserInput.nextInt();
        if(res==1){
            System.out.println("Balance : "+bal);
            return;
        }
        else if(res==2){
            System.out.print("Enter amount : ");
            int amt = UserInput.nextInt();
            if(bal-amt>0){
                System.out.println("Taken Your Money from the below counter");
            System.out.println("Remaining balance is"+ (bal-amt));}
            else {
                System.out.println("Not available balance in your account Contact branch");
            }
            return;
        }
        else if(res==3){
            System.out.print("Enter the old pin");
            int old= UserInput.nextInt();
            int u=1;
            if(old==pin) {
                System.out.print("Enter your Mobile no");
                long mobileno = UserInput.nextLong();
                long OTP = (long) (Math.random() * 100000);
                System.out.println(OTP);
                System.out.println("Enter the OTP recieved to your mobile");
                long recieved = UserInput.nextLong();
                if (OTP == recieved) {
                    System.out.print("Enter the New Pin");
                    int pinnew = UserInput.nextInt();
                    System.out.println("Your Pin is Updated");
                } else {
                    System.out.println("You have entered Wrong OTP Try again after some time");
                }
            }
            else{
                System.out.println("You have entered wrong pin try again");}
            }
        else if(res==4){
             return;
        }
        else {
            System.out.println("For Other services Contact Branch Thank You");
        }
    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> Acc_no = new HashMap<>();
        Acc_no.put(7847, 9844);
        Acc_no.put(9432,4354);
        Acc_no.put(8764,3241);
        Scanner UserInput = new Scanner(System.in);
        String inPut ="";
        System.out.println("Enter your details:\n1)Sign Up\n2)Sign in");
        int h = UserInput.nextInt();
        int x=1;
        switch(h) {

            case 1:
                System.out.println("Enter your Name:");
                String AccountHolderName = UserInput.next();
                System.out.print("Enter your Account Number to register:");
                int accno = UserInput.nextInt();
                System.out.print("Enter your pin Don't forget:");
                int passcode = UserInput.nextInt();
                Acc_no.put(accno, passcode);
                while (x != 0) {
                    try {
                        System.out.print("Enter Account Number : ");
                        int accNo = UserInput.nextInt();
                        if (Acc_no.containsKey(accNo)) {
                            System.out.print("Enter Pin : ");
                            int pin = UserInput.nextInt();
                            if (pin == Acc_no.get(accNo)) {
                                accInfo(accNo, pin);
                                x = 0;
                                break;
                            }

                        }
                        System.out.println("Invalid Username or Password");
                        continue;
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        break;
                    }
                }
                break;
            case 2:
                while (x != 0) {
                    try {
                        System.out.print("Enter Account Number : ");
                        int accNo = UserInput.nextInt();
                        if (Acc_no.containsKey(accNo)) {
                            System.out.print("Enter Pin : ");
                            int pin = UserInput.nextInt();
                            if (pin == Acc_no.get(accNo)) {
                                accInfo(accNo, pin);
                                x = 0;
                                break;
                            }

                        }
                        System.out.println("Invalid Username or Password");
                        continue;
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        break;
                    }
                }
                break;
            default:
                System.out.println("Contact Branch");
        }
        System.out.println("Thank Yor Using Our ATM");
    }
}