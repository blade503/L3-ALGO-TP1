import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class ConversionDate {
	
	private static long CONST_DURATION_OF_DAY = 1000 * 60 * 60 * 24;

	public static void main(String[] args) {
		int annee = 400;
		
		if (isBissextile(annee))
			System.out.println("L'année " + annee + " est bissextile.");
		else
			System.out.println("L'année " + annee + " n'est pas bissextile.");
		
		System.out.println(jourSemaine(1994, 8, 18));
		System.out.println("Le nombre de jour est : " + betweenTwoDays(7,9,2015,5,9,2015));
                System.out.println("le jour de la semaine d'une date " + dayyOfTheWeek(28,10,2015));
		
	}
	
	public static boolean isBissextile(int annee) {
		return (annee%4 == 0 && annee%100 != 0 || annee%400 == 0);
	}
	
	public static int jourSemaine(int annee, int mois, int jour){
		
		int codemois;
		
		if (mois == 1 || mois == 10)
			codemois = 0;
		else if (mois == 2 || mois == 3 || mois == 11)
			codemois = 3;
		else if (mois == 4 || mois == 7)
			codemois = 6;
		else if (mois == 5)
			codemois = 1;
		else if (mois == 6)
			codemois = 4;
		else if (mois == 8)
			codemois = 2;
		else
			codemois = 5;
		
		System.out.println("code mois : " + codemois);
		float numAnnee = (annee %100);
		System.out.println("deux derniers chiffres... : " + numAnnee);
		float quartAnnee = (numAnnee/4);
		int buf = (int) (quartAnnee * 10);
		quartAnnee = (float) buf /10;
		System.out.println("...divisé par 4 : " + quartAnnee);
		
		float resultat = (numAnnee + quartAnnee + jour + codemois)%7;
		
		if (isBissextile(annee) && mois < 3)
			resultat = resultat -1;
		if(annee >= 2000)
			resultat = resultat - 1;
		
		return (int)resultat;
		
	}
	
	
	public static int betweenTwoDays(int jour1, int mois1, int annee1, int jour2, int mois2, int annee2)
	{
				// date 1
				Calendar calendar1 = new GregorianCalendar();
				calendar1.set(Calendar.YEAR, annee1);
				calendar1.set(Calendar.MONTH, mois1);
				calendar1.set(Calendar.DAY_OF_MONTH, jour1);
				Date date1 = calendar1.getTime();
				//  date 2
				Calendar calendar2 = new GregorianCalendar();
				calendar2.set(Calendar.YEAR, annee2);
				calendar2.set(Calendar.MONTH, mois2);
				calendar2.set(Calendar.DAY_OF_MONTH, jour2);
				Date date2 = calendar2.getTime();
				// Différence
				long diff = Math.abs(date2.getTime() - date1.getTime());
				long numberOfDay = (long)diff/CONST_DURATION_OF_DAY;
				return (int) numberOfDay;
	}
	
	public static int dayyOfTheWeek(int jour, int mois, int annee){
            int c = (14 - mois)/12;
            int a = annee - c;
            int m = mois+(12*c)-2;
            int j = (jour + a + (a/4) - (a/100) + (a/400) + ((31*m)/12))%7;
            return j;
	}
}