package programa;

public class logo {
	public static void triangulu1() {
		int linea = 4;
		int star = 7;
		
		for (int i = 0; i<linea; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k < star; k++) {
				System.out.print("*");
			}
			System.out.println();
			star = star -2;
		}
	}
	public static void triangulu2() {
		int linea = 3;
		int star = 3;
		
		for (int i = 0; i< linea; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			for (int k= 0; k<star; k++) {
				System.out.print("*");
			}
			System.out.println();
			star= star + 2;
		}
	}
	public static void flecha() {
		int linea = 4;
		int space = 0;
		
		for (int i = 0; i < linea; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 1; k < space; k++) {
				System.out.print(" ");
			}
			if ( i != 0) {
				System.out.print("*");
			}
			System.out.println();
			space = space + 2;
		}
	}
	public static void I() {
		int linea = 5;
		
		for (int i = 0; i < linea; i++) {
			if (linea == 1 || linea == 5) {
				for (int j = 0; j < 7; j++) {
				System.out.print("*");
				}
			}
			else {
				for (int k = 0; k < 3; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
				}
			System.out.println();
			}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangulu1();
		triangulu2();
		flecha();
		I();
		flecha();
	}

}
