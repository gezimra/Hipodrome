package LastWeek;

import java.util.*;

public class Hipodromi {
	private String emri;
	private Vector<KafshaGaruese> lista;
	
	public Hipodromi(String emri) {
		this.emri=emri;
		lista = new Vector<KafshaGaruese>();
	}
	
	public void shtoKafshen(KafshaGaruese kg)throws GaraException{
		if(kg==null) {
			throw new GaraException("nuk ka kafshe te regjistruara!");
		}
		if(lista.contains(kg)) {
			throw new GaraException("Kafsha ekziston");
		}
		lista.add(kg);
	}
	
	public void shtypKafshet() {
		for(KafshaGaruese kafshet: lista) {
			System.out.println(kafshet);
		}
	}
	
	public void filloGaren() {
		Enumeration<KafshaGaruese> en = lista.elements();
		
		while(en.hasMoreElements()) {
			KafshaGaruese kg = en.nextElement();
			if(kg instanceof KaliGarues) {
				kg.setPriority(Thread.MAX_PRIORITY);
			}
			kg.start();
		}
	}
	
	public static void main(String[] args) {
		Hipodromi h = null;
		
		try {
			h = new Hipodromi("ABC");
			KafshaGaruese kg1= new QeniGarues(3,  "ABC 1",1);
			KafshaGaruese kg2= new QeniGarues(4,  "ABC 2",2);
			
			
			KafshaGaruese kg3= new KaliGarues(2,  "BCA 1",1);
			KafshaGaruese kg4= new KaliGarues(5,  "BCA 2",2);
			
			h.shtoKafshen(kg1);
			h.shtoKafshen(kg2);
			h.shtoKafshen(kg3);
			h.shtoKafshen(kg4);
			
			h.filloGaren();
		}catch(GaraException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
