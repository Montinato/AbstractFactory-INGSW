package logica;

public class FabbricaAUDI implements FabbricaAuto{

	@Override
	public SportivaAUDI creaSportiva(String n,String d) {
		return new SportivaAUDI();
		
	}

	@Override
	public SuvAUDI creaSuv(String n, String d) {
		// TODO Auto-generated method stub
		return new SuvAUDI();
	}

	@Override
	public UtilitariaAUDI creaUtilitaria(String n,String d) {
		// TODO Auto-generated method stub
		return new UtilitariaAUDI();
	}

	

}
