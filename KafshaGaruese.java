package LastWeek;

public abstract class KafshaGaruese extends Thread{
	private int mosha;
	private String emri;
	private int pozitaStartuese;
	public KafshaGaruese(int mosha, String emri, int pozitaStartuese) throws GaraException {
		if(mosha>10){
			throw new GaraException("Mosha e dhene eshte gabim! >10");
		}
		this.mosha = mosha;
		this.emri = emri;
		if(pozitaStartuese<1) {
			throw new GaraException("Pozita garuese gabim");
		}
		this.pozitaStartuese=pozitaStartuese;
	}
	public int getMosha() {
		return mosha;
	}
	public void setMosha(int mosha) {
		this.mosha = mosha;
	}
	public String getEmri() {
		return emri;
	}
	public void setEmri(String emri) {
		this.emri = emri;
	}
	public int getPozitaStartuese() {
		return pozitaStartuese;
	}
	public void setPozitaStartuese(int pozitaStartuese) {
		this.pozitaStartuese = pozitaStartuese;
	}
	@Override
	public String toString() {
		return "KafshaGaruese [mosha=" + mosha + ", emri=" + emri + "]";
	}
	
	public boolean equals(Object o) {
		if(o instanceof KafshaGaruese) {
			KafshaGaruese kg = (KafshaGaruese)o;
			return kg.getEmri().equals(emri);
		}
		return false;
	}
	
	
	
	
}
