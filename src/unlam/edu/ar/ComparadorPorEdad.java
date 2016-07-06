package unlam.edu.ar;
import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Cliente> {

	@Override
	public int compare(Cliente primerCliente, Cliente segundoCliente){
		return primerCliente.getEdad() - segundoCliente.getEdad();
	}
	
}
