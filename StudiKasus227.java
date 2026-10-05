import java.util.Scanner;
public class StudiKasus227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkat, statusPendanaan;

        System.out.print("Nama mahasiswa    : ");
        namaMahasiswa = sc.nextLine().trim();
        System.out.print("Jenis Kegiatan(BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA)  : ");
        jenisKegiatan = sc.nextLine().trim();


        if(jenisKegiatan.equalsIgnoreCase("BELMAWA")||jenisKegiatan.equalsIgnoreCase("MANDIRI")||jenisKegiatan.equalsIgnoreCase("BAKORMA")){
            System.out.print("Jumlah Dokumen  : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = sc.nextInt();

            if(peringkat>=1 && peringkat<=3) {
                if(jumlahDokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang "+kurang+" dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")){
            System.out.print("Jumlah Dokumen  : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPendanaan = sc.nextInt();

            if(statusPendanaan==1){
                if(jumlahDokumen==4){
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (tidak lolos pendanaan PKM).");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("Lainnya")){
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        } else {
            System.out.println("Status : Jenis kegiatan tidak valid.");
        }
        sc.close();
    } 
}