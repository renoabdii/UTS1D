import java.util.Scanner;

public class method {
        public static void perkalian(){
            int a = 3;
            int b = 4;
            int hasil = a*b;
            System.out.println(hasil);
        }
        public static void cetakjudul(String kelas, String tittle){
            System.out.println(tittle + " " + kelas);
        }
        public  static void GanjilGenap(int angka ){
            if (angka%2==0){
                System.out.println("angka" + angka + " adalah genap ");
            }else {
                System.out.println("angka" + angka + " adalah ganjil ");
            }
        }

        public static void main(String[] args) {

            cetakjudul("1D", "Perkalian ");
            perkalian();
            cetakjudul("1D", "Ganjil Genap");
            Scanner aku = new Scanner(System.in);
            System.out.println("Masukan angka ");
            GanjilGenap(aku.nextInt());
            System.out.println("Masukan ");
}}
