
public class Main {

	public static void main(String[] args) {
		Perfume V = new Perfume();//create first new object V
		V.printPerfume("Victori'as Secret", "Victori'as secret BombShell New York edp", 100, "U.S.A", "Black and pink" );
		V.printBehavior();
		V.printDiscountprice(230, 20, 100);
		V.printTotalprice(230, 46);
		
		System.out.println();
		
		Perfume YSL = new Perfume();//create second new object YSL
		YSL.printPerfume("Yvessaintlaurent(YSL)", "YSL Mon Paris", 90, "France", "Black, pink, and white" );
		YSL.printBehavior();
		YSL.printDiscountprice(500, 30, 100);
		YSL.printTotalprice(500, 150);

	}

}
