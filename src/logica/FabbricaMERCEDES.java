package logica;

public class FabbricaMERCEDES implements FabbricaAuto{

	@Override
	public UtilitariaMercedes creaUtilitaria(String n,String d) {
		return new UtilitariaMercedes();
		
	}

	@Override
	public SportivaMercedes creaSportiva(String n,String d) {
		return new SportivaMercedes();
		
	}

	@Override
	public SuvMercedes creaSuv(String n, String d) {
		// TODO Auto-generated method stub
		return new SuvMercedes();
	}

	

}
