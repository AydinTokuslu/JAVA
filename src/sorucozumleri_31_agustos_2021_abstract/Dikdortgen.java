package sorucozumleri_31_agustos_2021_abstract;

public class Dikdortgen extends Sekil {

public int kk,uk;
	
	
	
	public Dikdortgen(int kk, int uk) {
		super();
		this.kk = kk;
		this.uk = uk;
	}

	@Override
	public int cevre() {
	
		return 2*(kk+uk);
		
	}

	@Override
	public int alan() {
		
		return kk*uk;
		
	}

}
