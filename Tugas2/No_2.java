public class No_2{
	public int totdetik = 13020180;
	private int detik = totdetik%60;
	private int menit = (totdetik/60)%60;
	private int totmenit = totdetik/60;
	private int jam = (totmenit/60)%24;
	
	public static void main(String[] args){
		No_2 Waktu = new No_2();
		System.out.println(Waktu.jam+":"+Waktu.menit+":"+Waktu.detik);
	}
}