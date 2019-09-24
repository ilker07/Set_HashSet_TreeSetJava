import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


class BuyuktenKucugeSiralaPlayer implements Comparator<Player>
{

	@Override
	public int compare(Player p0, Player p1) {
		
		if(p0.getId()>p1.getId())
		{
			return -1;//Art� herhangi bir say� olabilir.
		}
		else if(p0.getId()<p1.getId())
		{
			return 1;//Eksi herhangi bir say� olabilir.
		}
		return 0;
	}
	
}

class BuyuktenKucugeStringSiralaPlayer implements Comparator<Player>
{

	@Override
	public int compare(Player p1, Player p2) {
		
		
		return -p1.getIsim().compareTo(p2.getIsim());
	}
	
}

class Player implements Comparable<Player>
{
	private String isim;
	private int id;
	public Player(String isim, int id) {
		
		this.isim = isim;
		this.id = id;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Id :" +id+" �sim:" +isim;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((isim == null) ? 0 : isim.hashCode());
		return result;
	}
	
	///2 tane e�it nesne varsa 1 tanesini yazmamak i�in.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		if (isim == null) {
			if (other.isim != null)
				return false;
		} else if (!isim.equals(other.isim))
			return false;
		return true;
	}
	@Override
	public int compareTo(Player player) {
		
		
		if(this.id>player.id)
			return 1;
		else if(this.id<player.id)
			return -1;
		return 0;
	}
	
	
	
	
}



public class Hepsi {

  
		
	
	public static void mapYazdir(Map<Integer,String> map)
	{
		map.put(10, "C++");
		map.put(20, "C");
		map.put(30, "PHP");
		map.put(50, "Pyhton");
		
		
		/*for(Map.Entry<Integer,String> deger:map.entrySet())
		{
			System.out.println("Key: "+deger.getKey()+" Value: "+deger.getValue());
			
		}*/
		
		//System.out.println(map.keySet()); //Key de�erleri d�ner.
		
		for(Integer key:map.keySet())
		{
			System.out.println("Key: "+key+" Value: "+map.get(key));
		}
		
		
		
		Collection<String > degerler=map.values();
		
		for(String s :degerler)
		{
			System.out.println("Deger: "+s);
		}
	}
	public static void main(String[] args) {
  
		/*
		Set<String> set1=new HashSet<String>();
		Set<String> set2=new LinkedHashSet<String>();
		Set<String> set3=new TreeSet<String>();
		
		
		//Hashset kar���k yazd�r�r.1 eleman� 1 defa depolar.
		set1.add("java");
		set1.add("C++");
		set1.add("Php");
		set1.add("Pyhton");
		
		//linkedset eklendi�i �ekline yazar.1 eleman� 1 defa depolar.
		set2.add("java");
		set2.add("C++");
		set2.add("Php");
		set2.add("Pyhton");
		
		
		//Tree set alfabetik s�ralar.1 eleman� 1 defa depolar.
		set3.add("java");
		set3.add("C++");
		set3.add("Php");
		set3.add("Pyhton");
		
		//System.out.println(set1.contains("java"));//java var true d�ner.
		//set1.remove("java");//eleman kald�rma.
		
		Set<String> setyeni=new HashSet<String>();
		Set<String> setyeni2=new HashSet<String>();
		
		
		setyeni.add("java");
		setyeni.add("php");
		setyeni.add("javascript");
		setyeni.add("c++");
		
		setyeni2.add("php");
		setyeni2.add("pyhton");
		setyeni2.add("go");
		setyeni2.add("c");
		setyeni2.add("ruby");
		
		Set<String> setfark=new HashSet<String>(setyeni2);
		System.out.println(setfark.removeAll(setyeni));
		System.out.println(setfark);
		
		Set<String> setkesisim=new HashSet<String>(setyeni2);
		System.out.println(setkesisim.retainAll(setyeni));
		System.out.println(setkesisim);

        
		/////////HASHMAPP/////////////////////////////////////////////////
		
		HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
		hashmap.put(10, "java");
		hashmap.put(30, "pyhton"); //1 de�eri 2 keye at�labilir ama tersi olmaz.
		hashmap.put(50,"php");
		hashmap.put(20,"php");
		
		
		//System.out.println(hashmap);
		//System.out.println(hashmap.get(50));//keyi 50 olan de�eri yazd�r�r.
		
		for(Map.Entry<Integer, String> giris:hashmap.entrySet())
		{
			System.out.println("Key :"+giris.getKey()+" Deger : "+giris.getValue());
			
		}
		
		
		*/
		
		
		//////////////HASHMAP///////////////////////////////////////////////
		
		
		//////////HASHMAP,L�NKEDHASHMAP,TREEMAP/////////////////////////
		
		
		//Map<Integer,String> hash=new HashMap<Integer,String>();
		//Map<Integer, String> linkedmap=new LinkedHashMap<Integer,String>();
		//Map<Integer, String> treemap=new TreeMap<Integer,String>();
		
		//mapYazdir(hash);
		
		////////////////HASHMAP,L�NKEDHASHMAP,TREEMAP/////////////////////////

		///////KEND� OBJELER�M�Z� KULLANMAK///////////////////////////
		
		/*
		Set<Player> hashset=new HashSet<Player>();
		
		Player player1=new Player("�lker", 10);
		Player player2=new Player("Murat", 20);
		Player player3=new Player("Ali", 30);
		Player player4=new Player("�lker", 10);
		
		hashset.add(player1);
		hashset.add(player2);
		hashset.add(player3);
		hashset.add(player4);
		
		for(Player p:hashset)
		{
			System.out.println(p);
		}
		*/
		
		///////KEND� OBJELER�M�Z� KULLANMAK///////////////////////////
		
		ArrayList<Player> liste=new ArrayList<Player>();
		
		liste.add(new Player("Ilker",10));
		liste.add(new Player("Mustafa",10));
		liste.add(new Player("Aykut",15));
		liste.add(new Player("Murat",7));
		
		/*Collections.sort(liste);//S�ralama i�in.Comparator kullanmadan s�ralama.
		for(Player p :liste)
		{
			System.out.println(p);
		}*/
		
		
		
		////   ID YE GORE SIRALAMA   ///////////////////////////
		
		/*
		Collections.sort(liste, new BuyuktenKucugeSiralaPlayer());//Comparator kullanarak s�ralama.
		
		
		for(Player p :liste)
		{
			System.out.println(p);
		}
		*/

		////   ID YE GORE SIRALAMA   ///////////////////////////
		
	   Collections.sort(liste, new BuyuktenKucugeStringSiralaPlayer());
	   
	   for(Player p :liste)
		{
			System.out.println(p);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	System.out.println(p1.compareTo(p2));
		
		
		///////KEND� OBJELER�M�Z� KULLANMAK///////////////////////////

		
		
		
		
		
		
		
		
		
		
		
	}

}
