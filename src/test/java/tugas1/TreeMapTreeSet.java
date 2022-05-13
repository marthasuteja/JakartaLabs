package tugas1;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		TREE MAP
		- Diurutkan dari yang terkecil
		- Terdapat value dan key
		- Tidak bisa duplikasi key
		- Jika key sama key lama akan ditumpuk dengan yang baru
		*/
		
		TreeMap<Integer, String> noUrut = new TreeMap<>();
		noUrut.put(1, "Jaja");
		noUrut.put(3, "Jiji");
		noUrut.put(2, "Juju");
		noUrut.put(5, "Juju");
		noUrut.put(4, "Juju");
		noUrut.put(2, "Jojo");
		
		for (Integer key : noUrut.keySet()) {
			System.out.println("idAkun of " + noUrut.get(key) + " is " + key);
		}
		System.out.println();
		
		/*
		TREE SET
		- Diurutkan dari yang terkecil
		- Hanya terdapat value
		- Tidak bisa duplikasi 
		*/
		
		TreeSet<String> judulLagu = new TreeSet <>();
		judulLagu.add("Ghost");
		judulLagu.add("Somebody");
		judulLagu.add("Peaches");
		judulLagu.add("Lonely");
		judulLagu.add("Somebody");
		judulLagu.add("Anyone");
		
		for (String item : judulLagu) {
			System.out.println(item);
		}
	}

}
