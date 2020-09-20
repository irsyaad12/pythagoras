//coded by irsyaadul ibaad
import java.util.*;
class Pythagoras{
	public static void main(String[] args){
		int kuadrat = 2;

		Scanner nomor = new Scanner(System.in);

		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		Scanner d = new Scanner(System.in);

		System.out.println("1.) Hipotenusa");
		System.out.println("2.) Alas/Tinggi");
		System.out.print("Sisi yang ingin Diketahui : ");

		int pilih = nomor.nextInt();
		System.out.println();

		if(pilih == 1){

			System.out.print("Masukkan nilai Alas : ");

			double alas = c.nextDouble();

			System.out.print("Masukkan nilai Tinggi : ");

			double tinggi = d.nextDouble();

			System.out.println("Hipotenusa = " + Math.sqrt(Math.pow(alas, kuadrat) + Math.pow(tinggi, kuadrat)));
			
			System.out.println("Luas = " + alas * tinggi / 2);

		} else if(pilih == 2){

			System.out.print("Masukkan nilai Hipotenusa : ");

			int hipotenusa = a.nextInt();

			System.out.print("Masukkan nilai Alas/Tinggi : ");

			int anggi = b.nextInt();

			double hasil = Math.sqrt(Math.pow(hipotenusa, kuadrat) - Math.pow(anggi, kuadrat));

			System.out.println("Alas/Tinggi = " + hasil );

			System.out.println("Luas = " + hasil * anggi / 2);

		} else {
			System.out.println();
			System.out.println("Pilihan salah");
		}
	}
}