import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalPrice = 0;
        boolean yesNo = false;
        do {
            totalPrice += SafeInput.getRangedDouble(in, "Enter Item Price", 9.99, 0.50);
            yesNo = SafeInput.getYNConfirm(in, "Add more items");
        }while(!yesNo);
        System.out.println("Total Price: " + String.format("%.2f",totalPrice));
    }
}
