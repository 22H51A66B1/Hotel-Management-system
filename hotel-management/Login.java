import java.util.*;

 class hotel{
    void hotels()
    {
    String name = "10-STAR HOTEL";
    String location="SECUNDERABAD";
    System.out.println(name);
    System.out.println(location);
}
 }
class Reservations {
    private String name;
    private String phone_no;
    private String AdhaarCard;
    private int NoOfDays;
    public void reservation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        this.name = sc.next();
        int n=0;
        while(n!=10){
        System.out.println("Enter your Phone Number:");
        this.phone_no = sc.next();
        n =phone_no.length();
        if(n!=10)
        {
           System.out.println("Enter correct phone number(10 digits)");
        }
        }
         System.out.println("Number of days to stay:");
        this.NoOfDays = sc.nextInt();
        int m=0;
        while(m!=12){
        System.out.println("Enter your Adhaar number:");
        this.AdhaarCard = sc.next();
        m=AdhaarCard.length();
        if(m!=12){
          System.out.println("Enter correct adhaar number(12 digits)");
    }
        }
    }
    public int getNoOfDays() {
        return NoOfDays;
    }
}
class rooms{
    public int NoOfPeople;
    void room(Reservations r){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of people staying:");
    this.NoOfPeople=sc.nextInt();
    if(NoOfPeople>3){
        SuiteRoom sr=new SuiteRoom();
        sr.multi(r);

    }
    else{
        SingleRoom se= new SingleRoom();
        se.single(r);
    }
    }
    }

class SingleRoom extends rooms{
    void single(Reservations r) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cost for single room is: 2,500 per day");
        int totalDays = r.getNoOfDays();
        int cost=2500;
        int totalCost = totalDays*cost;
        System.out.println("Total cost for Single Room is: "+totalCost);
    }
}


class SuiteRoom extends rooms{
     int cost=3500;
        Scanner sc = new Scanner(System.in);
        
        
void multi(Reservations r) {
    System.out.println("Cost for multiple rooms is: 3,500 per day");
        int totalDays = r.getNoOfDays();
        int totalCost = totalDays*cost;
        System.out.println("Total cost for Suite Room is: "+totalCost);
    }
}

class Booking{
    int netBanking;
    String upi;
    int cash;
   

    void bookings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the payment method:");
        System.out.println("1. Netbanking\n2. UPI\n3. Cash");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Payment Successful");
                break;
            case 2:
                System.out.println("Payment Successful");
                break;
            case 3:
                System.out.println("Payment Successful");
                break;
            default:
                System.out.println("Payment Failure");
                break;
        }
    }
}
public class Login{
public static void main(String[] args) {
    hotel obj = new hotel();
    obj.hotels();
    Reservations obj1 = new Reservations();
    obj1.reservation();
    rooms ob=new rooms();
    ob.room(obj1);
    Booking ob1=new Booking();
    ob1.bookings();
}
}

