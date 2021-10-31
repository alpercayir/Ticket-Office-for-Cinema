
import java.util.Objects;
import java.util.Arrays;
import java.util.Scanner;

public class sinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Salondaki sira sayisini veriniz:");
		Scanner aa = new Scanner(System.in);
		int sirasayisi = aa.nextInt(); 
		System.out.print("Salondaki her sirada koltuk sayisini veriniz:");
		int koltuksayisi = aa.nextInt();
		int ch1 = '*';
		int ch2 = '|';
		String[][] dizi1 = new String[sirasayisi][koltuksayisi];
		
			for (int j =0; j<koltuksayisi*2+2;j++) {
				System.out.print( "-" );}
		System.out.println( "-" );
		for (int i=0;i<sirasayisi;i++) {
			
			for (int j=0; j<koltuksayisi; j++) {
				dizi1[i][j] ="*" ;									
			}
		}
		for (int i=0;i<sirasayisi;i++) {
			System.out.print(sirasayisi-i + " - ");
			for (int j=0; j<koltuksayisi; j++) {
					
				System.out.print( dizi1[i][j] + " " );													
			}
			System.out.println();
			}		
		while(true) {
			System.out.print("Merhaba kacinci siradan yer istersiniz (cikmak icin 0) ? :");
			int ss = aa.nextInt();
			if((ss<sirasayisi) && (ss!=0)) {
				
				System.out.print("Kac kisilik yer istiyorsunuz? :");
				int sn = aa.nextInt();
				
				int sayac = 0;
				for (int k=0; k<koltuksayisi;k++ ) {
					if(dizi1[ss-1][k]=="*") {
						sayac++;
					}
					if((sn<sayac) && (ss!=0)) {
						  for (int v=0; v<sn; v++) {
							if(dizi1[sirasayisi-ss][v]=="*") {
									dizi1[sirasayisi-ss][v] ="|";
									
							
							}									
						  }
						  
					}
					
				
				} 
				int fiyat = sn*5; 
				System.out.println( "Ucretiniz" + fiyat +"tl" );
				if ((sn>=sayac) && (ss!=0)){
					System.out.print("Belirttiginiz sirada istediginiz kadar kisi icin yer kalmamistir. Lutfen baska bir sira seciniz.");
				}
				
				System.out.println( "Salon Düzeni" );
				for (int j =0; j<koltuksayisi*2+2;j++) {
					System.out.print( "-" );}
				System.out.println( "-" );
				
				for (int i=0;i<sirasayisi;i++) {
					  System.out.print(sirasayisi-i + " - ");
						for (int j=0; j<koltuksayisi; j++) {
										
						System.out.print( dizi1[i][j] + " " );													
						}
						System.out.println();
								}
				     
				if (ss==0) {
					break;
				}		  
				
				
				
				}
				
				
				
			}
			
			
		}
		
		
	}


