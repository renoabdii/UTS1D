import java.util.Scanner;

public class UTS {
    int jumlahplat = 5;
    static int totalplat = 55;
    public static String[] Kudus = new String[9];
    public static String[] Jakarta = new String[10];
    public static String[] Jogja = new String[11];
    public static String[] Karawang = new String[12];
    public static String[] Solo = new String[13];

    public static void PrintInfoPlat() {
        int totalKudus = 0;
        int totalSisaKuota = 0;
        for (int index = 0; index < Kudus.length; index++) {
            if (Kudus[index] != null) {
                totalKudus++;
            }
        }
        int totalJakarta = 0;
        for (int index = 0; index < Jakarta.length; index++) {
            if (Jakarta[index] != null) {
                totalJakarta++;
            }
        }
        int totalJogja = 0;
        for (int index = 0; index < Jogja.length; index++) {
            if (Jogja[index] != null) {
                totalJogja++;

            }
        }
        int totalKarawang = 0;
        for (int index = 0; index < Karawang.length; index++) {
            if (Karawang[index] != null) {
                totalKarawang++;

            }
        }
        int totalSolo = 0;
        for (int index = 0; index < Solo.length; index++) {
            if (Solo[index] != null) {
                totalSolo++;
            }

        }


        totalSisaKuota = totalplat - totalKudus - totalJakarta - totalJogja - totalKarawang - totalSolo;
        System.out.println("Total Plat Kudus: " + totalKudus + " | Total Plat Jakarta: " + totalJakarta + " | Total Plat Jogja: " + totalJogja + " | Total Plat Karawang: " + totalKarawang + " | Total Plat Solo" + totalSolo);
        System.out.println("Jumlah Seluruh Plat : " + totalplat + " | Total Sisa Kuota: " + totalSisaKuota);
        System.out.println();

    }

    public static void CheckIndexArray(String[] myArray, String plat) {
        int indexNow = 0;
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] != null) {
                indexNow = index + 1;
            }
        }

        if (indexNow < myArray.length) {
            myArray[indexNow] = plat;
        }
    }

    public static void simpanPlat(int pilih, String Plat) {
        switch (pilih) {
            case 1:
                CheckIndexArray(Kudus, Plat);
                System.out.println("Termasuk Plat Kudus");
                PrintInfoPlat();
                break;

            case 2:
                CheckIndexArray(Jakarta, Plat);
                System.out.println("Termasuk Plat Jakarta");
                PrintInfoPlat();
                break;

            case 3:
                CheckIndexArray(Jogja, Plat);
                System.out.println(("termasuk plat Jogja"));
                PrintInfoPlat();
                break;
            case 4:
                CheckIndexArray(Karawang, Plat);
                System.out.println(("termasuk plat karawang"));
                PrintInfoPlat();
                break;
            case 5:
                CheckIndexArray(Solo, Plat);
                System.out.println(("termasuk plat solo"));
                PrintInfoPlat();
                break;
        }
    }

    public static void inputPlat() {
        Scanner inputData = new Scanner(System.in);
        while (true) {
            System.out.println("Nama plat = ");
            String namaPlat = inputData.nextLine();


    }
}
