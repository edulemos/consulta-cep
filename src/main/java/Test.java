

import java.rmi.RemoteException;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteProxy;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;

public class Test {
	
	public static void main(String[] args) throws SQLException, SigepClienteException, RemoteException {
		
		AtendeClienteProxy proxy = new AtendeClienteProxy();
		EnderecoERP consultaCEP = proxy.consultaCEP("22021001");
		System.out.println(consultaCEP);

	}

}
