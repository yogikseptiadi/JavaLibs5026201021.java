package JavaLibs;

import javax.swing.JOptionPane;
public class JavaLibs5026201021 {
	public static void main(String[] args){
	
	String Konfirmasi = JOptionPane.showInputDialog("Hai Selamat Datang,Bagaimana Kabarmu??");
	String Nama = JOptionPane.showInputDialog ("Masukan Nama Anda");
	int Lahir = Integer.parseInt(JOptionPane.showInputDialog ("Tanggal Lahir Anda"));
	int Umur = Integer.parseInt(JOptionPane.showInputDialog("Masukan Umur Anda"));
	double Tb = Integer.parseInt(JOptionPane.showInputDialog ("Masukan Tinggi Badan Anda"));
	String Makanan =JOptionPane.showInputDialog ("Apa Makanan Favorit anda?");
	String Alamat = JOptionPane.showInputDialog ("Masukan Alamat Anda");
	String Pendidikan = JOptionPane.showInputDialog ("Masukan Status Pendidikan Anda");
	double Ipk =  Double.parseDouble(JOptionPane.showInputDialog ("Masukan Ipk anda"));
	double Semester = Double.parseDouble(JOptionPane.showInputDialog ("Masukan Semester Anda Sekarang"));
	int Semester1 = 6; //1 semester 6 bulan;
	int Bulan = 12;
	String Cerita1 = ("Haloo Perkenalkan!!\n"+"Nama Saya "+Nama+","+" Saya lahir pada "+Lahir);
	String Cerita2 = (", umur saya "+Umur+" tahun,"+" tinggi badan saya "+Tb+"cm,");
	String Cerita3 = (" makanan favorit saya adalah "+Makanan+"\n"+" saya tinggal di "+Alamat);
	String Cerita4 = (", saya saat ini masih duduk di bangku "+Pendidikan+", Ipk saya "+Ipk+", saya masih menjalani kuliah selama "+Semester*Semester1/Bulan+" tahun");


	JOptionPane.showMessageDialog (null,Cerita1+Cerita2+Cerita3+Cerita4);
	JOptionPane.showMessageDialog (null,"TERIMA KASIH!!!");
	}
}
