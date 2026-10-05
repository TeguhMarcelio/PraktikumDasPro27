import java.util.Scanner;
public class StudiKasus27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang yang dibayarkan: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if(totalHarga>=100000){
            diskon = (totalHarga *10)/100;
            totalBayar = totalHarga-diskon;
        } else {
            totalBayar = totalHarga-diskon;
        }
        
        System.out.println("Total harga adalah Rp. "+totalHarga);
        System.out.println("Anda mendapat diskon sebesar Rp. "+diskon);
        System.out.println("Total yang harus dibayarkan adalah Rp. "+totalHarga);

        if(uangBayar>=totalBayar){
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembaliannya adalah Rp. "+kembalian);
        } else {
            kurang = uangBayar - totalBayar;
            System.out.println("Uang tidak cukup, kurang Rp. "+ Math.abs(kurang));
        }
        
    }
}
