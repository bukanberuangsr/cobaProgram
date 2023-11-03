import java.util.Scanner;

public class program6_23 {
    // Method utama
    public static void main(String[] args) {
        // Memasukkan Scanner dalam program
        Scanner scanner = new Scanner(System.in);
        
        // Judul Program
        System.out.println("Penghitung suatu huruf dari sebuah kalimat!");
        // Bagian ini digunakan untuk memerintah pengguna untuk memasukkan kalimat
        System.out.print("Masukkan Kalimat: ");
        String string = scanner.nextLine();

        // Bagian ini digunakan untuk memerintah pengguna untuk memasukkan karakter 
        System.out.print("Masukkan Karakter: ");
        char karakter = scanner.next().charAt(0);

        // Bagian ini digunakan untuk membuat program mendeteksi karakter dalam kalimat (tidak case-sensitive)
        string = string.toLowerCase();
        karakter = Character.toLowerCase(karakter);

        // Bagian ini digunakan sebagai output terakhir dari program berdasarkan data di Method count
        int kejadian = count(string, karakter);
        System.out.println("Jumlah Kejadian dari '" + karakter + "' dalam kalimat: " + kejadian);
        scanner.close();
    }

    // Method count
    public static int count(String str, char a) {
        
        // Mendeklarasikan variabel count
        int count = 0;
        
        // Looping for untuk menghitung jumlah karakter dalam kalimat
        for (int i = 0; i < str.length(); i++){
            // Sesuai dengan input karakter pengguna, program akan menghitung karakter tersebut pada kalimat
            if (str.charAt(i) == a){count++;}
        }
        // Mengembalikan data ke Method Utama
        return count;
    }
}

/*
 * Akhtar Hafiz Puliwarna
 * 235150707111013
 * Teknologi Informasi (A)
 * 6.23 - Occurrences of a specified character
 * 
 * Write a method that finds the number of occurrences of a 
 * specified character in a string using the following header:
 * 
 * public static int count(String str, char a);
 * 
 * For example, count("Welcome", 'e') returns 2. Write a test program that
 * prompts the user to enter a string followed by a character and displays 
 * the number of occurrences of the character in the string.
 */
