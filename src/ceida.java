import java.util.Scanner;

public class ceida {

	public static void main(String[] args) {
		Scanner puan = new Scanner(System.in);
		
		System.out.print("vize1 notunuzu giriniz. ");
		int vize1 = puan.nextInt();
		
		System.out.print("vize 2 notunuzu giriniz.");
		int vize2 = puan.nextInt(); 
		
		System.out.print("final notunuzu giriniz.");
		int finalNotu=puan.nextInt();
		
		double sonuc = (vize1*3)/10 + (vize2*3)/10 + (finalNotu*4)/10;
		if(sonuc>60) {
			System.out.println("Tebrikler, dersi geçtiniz. Ortalamanız: "+sonuc);
		}else {
			System.out.println("Üzgünüm, dersten kaldınız.Ortalamanız: "+sonuc);
		}

	}

}
