public class No_1{
	String nim,nama,jurusan,fakultas;

	public No_1(){
		nim = "13020180039";
		nama = "Achmad Novanto Catur Soemantri";
	}

	public No_1(String jurusan, String fakultas){
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public static void main(String[] args){
		No_1 data = new No_1();
		No_1 data2 = new No_1("Teknik Informatika","Ilmu Komputer");
		System.out.println("Nim = "+data.nim);
		System.out.println("Nama = "+data.nama);
		System.out.println("Jurusan = "+data2.jurusan);
		System.out.println("Fakultas = "+data2.fakultas);
	}
}