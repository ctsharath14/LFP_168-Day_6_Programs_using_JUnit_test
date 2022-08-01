import java.util.Scanner;

public class VendingMachine {
        public static void main(String[] args) {

            int arr[] = {1000,500,100,50,10,5,2,1};
            int money, totalNotes=0, count=0;

            Scanner r = new Scanner(System.in);
            System.out.println("Enter Money: ");
            money = r.nextInt();

            int copy=money;

            for(int i=0;i<8;i++)
            {
                // counting number of notes.
                count=money/arr[i];
                if(count!=0) {
                    System.out.println(arr[i]+"   " +count+ "  "+arr[i]*count);
                }
                totalNotes=totalNotes+count;
                money=money%arr[i];
            }
            System.out.println("TOTAL= " +copy);
            System.out.println("Minimum Number of Notes required= " +totalNotes);
            r.close();
        }

    }