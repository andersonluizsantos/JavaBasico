package tratamentoexcecaopropria;

public class AgendaCheiaException extends Exception{
	
	@Override
	public String getMessage() {
		return "Agenda j� est� cheia";
	}
}
