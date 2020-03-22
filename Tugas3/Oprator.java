/* Contoh pengoperasian variabel bertype dasar */  
public class Oprator { 
 
 /**  
 * @param args  
 */ 

 public static void main(String[] args) {
   // TODO Auto-generated method stub
   /* Kamus */ 
 
     boolean Bool1, Bool2, TF ; int i,j, hsl ;
     float x,y,res;

   /* algoritma */
   System.out.println  ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output\n"); 
 
     Bool1 = true; Bool2 = false;
     TF = Bool1 && Bool2 ; /* Boolean AND */
     TF = Bool1 || Bool2 ; /* Boolean OR */
     TF = ! Bool1 ;  /* NOT */
     TF = Bool1  ^Bool2;  /* XOR */

     /* operasi numerik */
     i = 5; j = 2 ;  
     hsl = i+j; hsl = i - j; hsl = i / j; hsl = i * j;
     hsl = i /j ;  /* pembagian bulat */
     hsl = i%j ; /* sisa. modulo */

     /* operasi numerik */
     x = 5 ; y = 5 ;  
     res = x + y; res = x - y; res = x / y; res = x * y;

     /* operasi relasional numerik */ 
     TF = (i==j); TF = (i!=j);
     TF = (i < j); TF = (i > j); TF = (i <= j); TF = (i >= j);

     /* operasi relasional numerik */ 
     TF = (x != y);
     TF = (x < y); TF = (x > y); TF = (x <= y); TF = (x >= y); 
 
     System.out.println("Logika Boolean\n1. Boolean AND = "+ (Bool1 && Bool2)+"\n2. Boolean OR = "+ (Bool1 || Bool2)+"\n3. Boolean NOT = "+ (! Bool1)+"\n4. Boolean XOR = "+ (Bool1 ^Bool2));
     System.out.println("\nOperasi Numerik\n1. Hasil Jumlah = "+ (i + j) +"\n2. Hasil Kurang = "+ (i - j) +"\n3. Hasil Bagi = "+ ((float)i / (float)j) +"\n4. Hasil Kali = "+ (i * j) +"\n5. Hasil Bagi Bilangan Bulat = "+ (i / j) +"\n6. Hasil Sisa Bagi = "+ (i % j));
     System.out.println("\nOperasi Numerik\n1. Hasil Jumlah = "+ (x + y) +"\n2. Hasil Kurang = "+ (x - y) +"\n3. Hasil Kurang = "+ (x / y) +"\n4. Hasil Kali = "+ (x * y));
     System.out.println("\nOperasi Relasional Numerik\n1. " + (i == j) +"\n2. " + (i != j) +"\n3. " + (i < j) +"\n4. " + (i > j) +"\n5. " + (i <= j) +"\n6. " + (i >= j));
     System.out.println("\nOperasi Relasional Numerik\n1. " + (i != j) +"\n2. " + (i < j) +"\n3. " + (i > j) +"\n4. " + (i <= j) +"\n5. " + (i >= j));
 } 
 
}