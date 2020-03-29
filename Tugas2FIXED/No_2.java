import java.util.Scanner;

public class No_2{
	
	Scanner masukan = new Scanner(System.in);
	public int totdetik = masukan.nextInt();
	private int detik = totdetik%60;
	private int menit = (totdetik/60)%60;
	private int totmenit = totdetik/60;
	private int jam = (totmenit/60)%24;
	
	public static void main(String[] args){
		System.out.print("Masukan detik =");
		No_2 Waktu = new No_2();
		System.out.println(Waktu.jam+":"+Waktu.menit+":"+Waktu.detik);
	}
}