package JavaLibs;

import javax.swing.JOptionPane;
public class JavaLibs5026201021 {
	public static void main(String[] args){
	
	String Konfirmasi;
	String Nama;
	int Lahir;
	int Umur;
	double Tb;
	String Makanan;
	String Alamat;
	String Pendidikan;
	double Ipk;
	double Semester;
	int Semester1;
	int Bulan;

	Konfirmasi = JOptionPane.showInputDialog("Hai Selamat Datang,Bagaimana Kabarmu??");
	Nama = JOptionPane.showInputDialog ("Masukan Nama Anda");
	Lahir = Integer.parseInt(JOptionPane.showInputDialog ("Tanggal Lahir Anda"));
	Umur = Integer.parseInt(JOptionPane.showInputDialog("Masukan Umur Anda"));
	Tb = Integer.parseInt(JOptionPane.showInputDialog ("Masukan Tinggi Badan Anda"));
	Makanan = JOptionPane.showInputDialog ("Apa Makanan Favorit anda?");
	Alamat = JOptionPane.showInputDialog ("Masukan Alamat Anda");
	Pendidikan = JOptionPane.showInputDialog ("Masukan Status Pendidikan Anda");
	Ipk =  Double.parseDouble(JOptionPane.showInputDialog ("Masukan Ipk anda"));
	Semester = Double.parseDouble(JOptionPane.showInputDialog ("Masukan Semester Anda Sekarang"));
	Bulan = 12;
	Semester1 = 6; //1 semester 6 bulan;

	System.out.println("Hai Selamat Datang,Bagaimana Kabarmu?? --> "+Konfirmasi);
	System.out.println("Nama Saya "+Nama);
	System.out.println("Saya Lahir Pada "+Lahir);
	System.out.println("Umur Saya "+Umur+"Tahun");
	System.out.println("Tinggi Badan Saya "+Tb+"cm");
	System.out.println("Makanan Favorit Saya adalah "+Makanan);
	System.out.println("Saya Tinggal Di "+Alamat);
	System.out.println("Saya Saat Ini Masih Duduk Di Bangku"+Pendidikan);
	System.out.println("Ipk saya "+Ipk);
	System.out.println("Saya Masih Menjalani Kuliah Selama "+Semester*Semester1/Bulan+"Tahun");

	}
}

	