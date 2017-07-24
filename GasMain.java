package interfac;
import java.util.Scanner;


public class GasMain {
	
	private int regular1;
    private int diesel1;
    private int premium1;
    private String GasStationName1;
    private String LocationName1;
   
   
    private int regular2;
    private int diesel2;
    private int premium2;
    private String GasStationName2;
    private String LocationName2;
   
    private String FinalGasstationRegular;
    
   
    Scanner keyboard = new Scanner(System.in);
    int input=keyboard.nextInt();

    
   
    public void TakeInput(){
          Scanner keyboard = new Scanner(System.in);
          System.out.println("Please enter input for gas station name ");
          GasStationName1 = keyboard.next();
          System.out.println("Please enter input for regular");
          regular1 = keyboard.nextInt();
          System.out.println("Please enter input for diesel");
          diesel1 = keyboard.nextInt();
          System.out.println("Please enter input for premium");
          premium1 = keyboard.nextInt();

    }
      
    
         
         
          /*System.out.println("Please enter input for gas station name ");
          GasStationName2 = keyboard.next();
          System.out.println("Please enter input for regular");
          regular2 = keyboard.nextInt();
          System.out.println("Please enter input for diesel");
          diesel2 = keyboard.nextInt();
          System.out.println("Please enter input for premium");
          premium2 = keyboard.nextInt(); */
         
    //}
   
   
    public void Regularprice() {
          // TODO Auto-generated method stub
         
         
          if(regular1 < regular2 ){
                FinalGasstationRegular = GasStationName1;
          }
          else {
                FinalGasstationRegular = GasStationName2;
          }
         
    }

   
    public void Dieselprice() {
          // TODO Auto-generated method stub
         
    }

   
    public void Premiumprice() {
          // TODO Auto-generated method stub
         
    }

   
   
    public void DisplayOutput(){
          System.out.println(" Gas station name for minimum regular price is :");
          System.out.println(FinalGasstationRegular);
    }
}
