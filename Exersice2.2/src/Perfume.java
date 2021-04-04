
public class Perfume {
	String Brand;
    String Model;
    int ML;
    String MadeIn;
    String Colour;
    
      void printPerfume(String B, String M, int m, String I, String C) {
    	  System.out.println("Brand > " + B);
    	  System.out.println("Model > " + M);
    	  System.out.println("ML > " + m + "ML" );
    	  System.out.println("Made in > " + I);
    	  System.out.println("Colour > " + C);  	  
      }
     void printDiscountprice(double d, double p, int precentage) {
    	  double discount = p * (d / precentage);
    	  System.out.println("Discount = RM " + discount);
      }
     void printTotalprice(double p, double d) {
    	 double Finalprice = p - d ;
    	 System.out.println("Final total price = RM " + Finalprice);
     }
     void printBehavior() {
  	  System.out.println("Open, Close, Spray, shake, refill");
	 }
}
