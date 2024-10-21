Algoritmo menu1
	
	//Aldagaiak definitzen dugu.
	Definir aukera, aukeraLangile, aukeraBezero Como Entero
	Definir saioaItxi, besteKontsulta Como Caracter
	Definir atzeraJoan Como Logico
	
	saioaItxi = "ez"
	
	Repetir
		// Menu nagusia.
		Escribir "*****************************"
		Escribir "*           MENUA           *"
		Escribir "*****************************"
		Escribir "* 1. Langileen informazioa  *"
		Escribir "* 2. Bezeroen informazioa   *"
		Escribir "* 3. Saioa Itxi             *"
		Escribir "*****************************"
		Escribir " "
		
		Escribir "Zer aukera aukeratu nahi duzu? (1/2/3)"
		Leer aukera
		
		Segun aukera Hacer
			Caso 1:
				// Atzera joateko aldagaia inizializatzen dugu
				AtzeraJoan = Verdadero
				// Erabiltzaileak 1. aukera hautatzen badu, Langileen azpimenu bat zabalduko da, hiru aukerarekin.
				// Mientras bat erabiltzen da, azpimenua errepikatu ahal izateko, erabiltzaileak "Atzera joan" aukera hautatu arte.
				Mientras atzeraJoan Hacer
					Escribir "LANGILEAK"
					Escribir "	   1. Kontsultatu langile baten informazioa. "
					Escribir "   2. Nagusi baten langileen zerrenda erakutsi. "
					Escribir "	   3. Atzera joan. "
					Escribir " "
					
					Escribir "Ze kontsulta egin nahi duzu? (1/2/3)"
					Leer aukeraLangile
					Escribir " "
					
					Segun aukeraLangile Hacer
						Caso 1:
							// Erabiltzaileak 1. aukera hautatzen badu, langile baten kontsulta egingo du (Funtzio batekin).
							Escribir "	Kontsultatu langile baten informazioa. "
							
						Caso 2:
							//  Erabiltzaileak 2. aukera hautatzen badu, nagusi baten zerrenda aterako da (Funtzio batekin).
							Escribir " Nagusi baten langileen zerrenda erakutsi. "
							
						Caso 3:
							// Erabiltzaileak 3. aukera hautatzen badu, aldagaia false aldatuko da eta menu nagusiara eramango dio.
							AtzeraJoan= Falso
						De Otro Modo:
							Escribir "Aukera zuzena sartu"
					Fin Segun
					
					
				Fin Mientras
				
			Caso 2:
				AtzeraJoan = Verdadero
				
				Mientras AtzeraJoan Hacer
					// Lehenengo aukera aukeratzen badugu langileen azpimenua aterako da, atzera joan aukera aukeratu arte.
					Escribir "BEZEROAK"
					Escribir "	   1. Bezeroaren kontaktuak kontsultatu. "
					Escribir "   2. Bezero batek egindako erosketa baten faktura sortu. "
					Escribir "   3. Atzera joan. "
					Escribir " "
					
					Escribir "Ze kontsulta egin nahi duzu? (1/2/3)"
					Leer aukeraBezero
					Escribir " "
					
					Segun aukeraBezero Hacer
						Caso 1:
							//Erabiltzaileak 3. aukera hautatzen badu, bezero baten Kontaktua aterako zaio (Funtzio batekin).
							Escribir "	Bezeroaren kontaktuak kontsultatu. "
						Caso 2:
							//Erabiltzaileak 2. aukera hautatzen badu, erosketa baten faktura erakutsiko dio (Funtzio batekin).
							Escribir " Bezero batek egindako erosketa baten faktura sortu. "
						Caso 3:
							AtzeraJoan= Falso
						De Otro Modo:
							Escribir "Aukera zuzena sartu mesedez"
					Fin Segun
				Fin Mientras
				
			Caso 3:
				// Erabiltzaileak saioa izteko aukera hautatzen duenean, Saioa itxi nahi badu galdetzen zaio (bai/ez).
				// Erabiltzaileak "bai" erantzuten badu, saioa itxi egingo da eta programa bukatuko da.
				Escribir "Saioa itxi nahi duzu? (bai/ez)"
				Leer saioaItxi
			De Otro Modo:
				Escribir "Aukera zuzen bat sartu mesedez"
		Fin Segun
		
	Hasta Que saioaItxi = ("bai") o saioaItxi=("Bai")
	Escribir "Saioa Itxi da"
	
FinAlgoritmo
