import java.util.Scanner;

public class No_1{
	Scanner input = new Scanner(System.in);
	String nim,nama,jurusan,fakultas;

	public No_1(){
		System.out.print("Masukan NIM = ");
		nim = input.next();
		System.out.print("Masukan Nama = ");
		nama = input.next();
	}

	public No_1(String jurusan, String fakultas){
		System.out.print("Masukan Jurusan = ");
		this.jurusan = input.next();
		System.out.print("Masukan Fakultas = ");
		this.fakultas = input.next();
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