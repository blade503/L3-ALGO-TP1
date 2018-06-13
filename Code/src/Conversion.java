
public class Conversion {

	public static double tauxFranc = 6.56957;

	public static double tauxDegre = 57.29;
	
	
	public static void main(String[] args) {
		System.out.println("bonjour et bienvenue dans ce logiciel de conversion");
		Conversion C = new Conversion();
                C.multi(6,9);
                
		/*C.euroToFranc(5);
		C.francToEuro(6.56);
		C.dollarToEuro(10, 0.92);
		C.euroToDollar(5, 1.11457);
		C.celsiusToFahrenheit(27);
		C.fahrenheitToCelsius(50);
		C.degreToRadian(70);
		C.radianToDegre(1.2217304763960306);*/
	}
        
        public void multi(int a, int b){
            int tempo=0;
            for (int i=0; i<a;i++){
            tempo = tempo + b;
            }
            System.out.println(tempo);
        }
	
	public void euroToFranc(double euro){
		double franc;
		franc = euro * tauxFranc;
		System.out.println("la conversion donne " + franc + " franc" );
	}
	
	public void francToEuro(double franc){
		
		double euro;
		euro = franc / tauxFranc;
		System.out.println("la conversion donne " + euro + " euro");
		
	}
	
	
	public void dollarToEuro(double dollar, double taux){
		
		double euro;
		euro = dollar / taux;
		System.out.println("la conversion donne " + euro + " euro");
		
	}
	
	public void euroToDollar(double euro, double taux){
		
		double dollar;
		dollar = euro * taux;
		System.out.println("la conversion donne " + dollar + " dollar" );
		
	}
	
	public void fahrenheitToCelsius(int farenheit){
		
		double celsius;
		celsius = (farenheit - 32) * (5/9); 
		System.out.println("la conversion donne " + celsius + " celsius");
		
	}

	public void celsiusToFahrenheit(int Celsius){
		
		double farenheit;
		farenheit = ((Celsius*9/5) + 32); 
		System.out.println("la conversion donne " + farenheit + " farenheit");
		
	}
	
			
	public void degreToRadian(double degre){
		double Radian;
		Radian = Math.PI * degre / 180;
		System.out.println("la conversion donne "+ Radian + " Radian");
		
	}
	
	public void radianToDegre(double radian){
		double degre;
		degre = 180 * radian / Math.PI;
		System.out.println(" la conversion donne " + degre + " degres");
	}
}
