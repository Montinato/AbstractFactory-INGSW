package logica;

public class FabbricaBMW implements FabbricaAuto{

	public FabbricaBMW() { return; } 
	
	@Override
	public UtilitariaBMW creaUtilitaria(String n,String d) {
		return new UtilitariaBMW();
		
	}

	@Override
	public SportivaBMW creaSportiva(String n,String d) {
		return new SportivaBMW();
		
	}

	@Override
	public SuvBMW creaSuv(String n, String d) {
		// TODO Auto-generated method stub
		return new SuvBMW();
	}



}
