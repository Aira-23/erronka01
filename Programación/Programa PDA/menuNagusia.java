package programa;

import java.util.Scanner;

public class menuNagusia {

	public static void main(String[] args) {
		

		//Scaner bat sortzen da erabiltzailerentzako.
		Scanner scanner = new Scanner(System.in);
		// beste kontsultza egiteko aldagaia inizializatzen da.
		String besteKontsulta = "ez"; 

	        do {
	            // Menu nagusia.
	            System.out.println("****************************");
	            System.out.println("*       MENU NAGUSIA       *");
	            System.out.println("****************************");
	            System.out.println("* 1. Langileen Informazioa *");
	            System.out.println("* 2. Bezeroen Informazioa  *");
	            System.out.println("* 3. Saioa ixi             *");
	            System.out.println("****************************");
	            System.out.println(" ");
	            
	            System.out.print("Zer egin nahi duzu? (1) Langilea, (2) Bezeroa edo (3) itxi saioa): ");
	            int erantzuna = scanner.nextInt();
	            

	            switch (erantzuna) {
	                case 1:
	                // Atzera joateko aldagaia inizializatzen dugu. 
	                    boolean atzeraJoan = true;
	                    // Erabiltzaileak 1. aukera hautatzen badu, Langileen azpimenu bat zabalduko da, hiru aukerarekin.
	                    // While bat erabiltzen da, azpimenua errepikatu ahal izateko, erabiltzaileak "Atzera joan" aukera hautatu arte.
	                    while (atzeraJoan) {
	                        System.out.println(" ");
	                        System.out.println("LANGILEAK");
	                        System.out.println(" ");
	                        System.out.println("    1. Kontsultatu langile baten informazioa.");
	                        System.out.println("    2. Nagusi baten langileen zerrenda erakutsi.");
	                        System.out.println("    3. Atzera joan.");
	                        System.out.println(" ");
	                        System.out.print("Ze eragiketa egin nahi duzu? (1/2/3): ");
	                        int eragiketaLangilea = scanner.nextInt();
	                        System.out.println(" ");
	                        

	                        switch (eragiketaLangilea) {
	                            case 1:
	                                // Erabiltzaileak 1. aukera hautatzen badu, langile baten kontsulta egingo du (Funtzio batekin).
	                                System.out.println("    1. Kontsultatu langile baten informazioa.");
	                                break;

	                            case 2:
	                                //  Erabiltzaileak 2. aukera hautatzen badu, nagusi baten zerrenda aterako da (Funtzio batekin).
	                                System.out.println("    2. Nagusi baten langileen zerrenda erakutsi.");
	                                break;

	                            case 3:
	                                // Erabiltzaileak 3. aukera hautatzen badu, aldagaia false aldatuko da eta menu nagusiara eramango dio.
	                                atzeraJoan = false; // Atzera joan
	                                break;

	                            default:
	                                System.out.println("Sartu aukera zuzen bat mesedez");
	                        }
	                    }
	                    break;

	                case 2:
	                    atzeraJoan = true;
	                    while (atzeraJoan) {
	                        // Lehenengo aukera aukeratzen badugu langileen azpimenua aterako da, atzera joan aukera aukeratu arte.
	                        System.out.println(" ");
	                        System.out.println("BEZEROAK");
	                        System.out.println(" ");
	                        System.out.println("    1. Bezeroaren kontaktuak kontsultatu.");
	                        System.out.println("    2. Bezeroen erosketa faktura.");
	                        System.out.println("    3. Atzera joan.");
	                        System.out.println(" ");
	                        System.out.print("Ze eragiketa egin nahi duzu? (1/2/3): ");
	                        int eragiketaBezero = scanner.nextInt();
	                        System.out.println(" ");

	                        switch (eragiketaBezero) {
	                            case 1:
	                                //Erabiltzaileak 3. aukera hautatzen badu, bezero baten Kontaktua aterako zaio (Funtzio batekin).
	                                System.out.println("    1. Bezeroaren kontaktuak kontsultatu.");
	                                break;

	                            case 2:
	                                //Erabiltzaileak 2. aukera hautatzen badu, erosketa baten faktura erakutsiko dio (Funtzio batekin).
	                                System.out.println("    2. Bezeroen erosketa faktura.");
	                                break;

	                            case 3:
	                
	                                atzeraJoan = false; // Atzera joan
	                                break;

	                            default:
	                                System.out.println("Sartu aukera zuzen bat mesedez");
	                        }
	                    }
	                    break;

	                case 3:
	                    // Erabiltzaileak saioa izteko aukera hautatzen duenean, Saioa itxi nahi badu galdetzen zaio (bai/ez).
	                    // Erabiltzaileak "bai" erantzuten badu, saioa itxi egingo da eta programa bukatuko da.
	                    System.out.println("Saioa itxi nahi duzu? (bai/ez)");
	                    besteKontsulta = scanner.next(); 
	                    break;

	                default:
	                    System.out.println("Sartu aukera zuzen bat mesedez");
	            }

	        } while (besteKontsulta.equalsIgnoreCase("ez"));

	        System.out.println("Saioa itxi da");
	        scanner.close(); 
	  
	
	}

}
