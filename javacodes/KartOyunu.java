package faruk;

public class KartOyunu {
	public KartOyunu() {} 
	static String kartTur[]= {"Sinek","Maca","Karo","Kupa"};
	static String kartNo[]= {"As","Papaz","Kiz","Vale","10", "9", "8", "7","6", "5", "4", "3" ,"2"};
	
		
	public static void kartYazdir() {
			
		int a=1;
		for(int i=0;i<kartTur.length;i++) {
				
			for(int j=0;j<kartNo.length;j++) {
				System.out.println(a +". kart : " +kartTur[i]+ " "+kartNo[j]);
				a++;
			}
		}
	}
	public static void main(String[] args) {
		KartOyunu.kartYazdir();
	}
}	
	









/*public static class Kart{
		
		static String kartTur[]= {"Sinek","Maca","Karo","Kupa"};
		static String kartNo[]= {"As","Papaz","Kiz","Vale","10", "9", "8", "7","6", "5", "4", "3" ,"2"};
		int kartSayisi=52;
		
		
		public Kart() { }
		
		public static void kartYazdir() {
			int a=1;
			for(int i=0;i<kartTur.length;i++) {
				
				for(int j=0;j<kartNo.length;j++) {
					
					System.out.println(a +". kart : " +kartTur[i]+ " "+kartNo[j]);
					a++;
				}
			}
		}
	}
}*/

