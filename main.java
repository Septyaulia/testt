import java.util.Scanner;
   
class DesimalBiner {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println();

        String nama, jurusan;

        System.out.print("Nama Mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Jurusan: ");
        jurusan = input.nextLine();

        System.out.println();
        System.out.println("Nama: " +nama);
        System.out.println("Jurusan: "+jurusan);
}
}