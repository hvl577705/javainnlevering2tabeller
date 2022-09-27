package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] i:matrise) {
			for(int y:i) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String a = "";
		for(int[] i:matrise) {
			for(int y:i) {
				a = a + y + " ";
			}
			a = a + "\n";
		}
		return a;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] newTab = new int[matrise.length][matrise[0].length];
		for(int i = 0; i<matrise.length; i++) {
			for(int y = 0; y<matrise[i].length; y++) {
				newTab[i][y] = matrise[i][y] * tall;
			}
		}
		return newTab;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
