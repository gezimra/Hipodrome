package LastWeek;

import java.util.Random;

public class QeniGarues extends KafshaGaruese implements Garon {
	private int distanca =0;
	public QeniGarues(int mosha, String emri, int pozitaStartuese) throws GaraException {
		super(mosha, emri, pozitaStartuese);
		if(mosha<1) {
			throw new GaraException("Mosha eshte dhene gabim!");
		}
	}

	@Override
	public void vrapo() {
		distanca+=10;
		System.out.println(toString());
	}
	
	public void run() {
		Random r1= new Random();
		while(distanca <= GJATESIA_E_PISTES) {
			try {
				Thread.sleep(r1.nextInt(2000));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			vrapo();
		}
	}
	public String toString() {
		return "Qeni Garues: "+ getEmri()+" vrapoi: "+distanca+"metra";
	}

}
