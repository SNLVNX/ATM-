public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
	    int password,a,b,c;
		System.out.println("Hoş geldiniz, lütfen ATM'ye yerleştirdiğiniz kartın 4 haneli şifresini giriniz...");
		password = kb.nextInt();
		System.out.println("");
		System.out.println("");
		
		System.out.println("Hoş geldin Sinan Gülbaş, yapmak istediğin işlemi aşağıdan seçebilirsin.");
		System.out.println("");
		System.out.println("                                                                       Bakiyeniz : 77TL");
		System.out.println("PARA ÇEKME => İşlemi gerçekleştirmek için 1'e basınız.");
		System.out.println("PARA YATIRMA => İşlemi gerçekleştirmek için 2'ye basınız.");
		System.out.println("FATURA ÖDEME => İşlemi gerçekleştirmek için 3'e basınız");
		System.out.println("");
		System.out.println("");
		a = kb.nextInt();
		if (a == 1)
		    System.out.println("Çekmek istediğiniz tutar miktarını giriniz.");
		else
		    if (a == 2)
		        System.out.println("Yatırmak istediğinz tutar miktarını giriniz.");
		    else
		        if(a == 3)
		            System.out.println("Ödemek istediğinz tutar miktarını giriniz.");
		        else
		            System.out.println("Lütfen geçerli bir sayı değeri giriniz.");
		            
		
		
	}
}
