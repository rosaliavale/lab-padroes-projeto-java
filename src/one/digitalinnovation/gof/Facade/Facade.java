package one.digitalinnovation.gof.Facade;

import Subsistema1.crm.CrmService;
import Subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente (String nome, String cep) {
String cidade = CepApi.getInstancia().recuperarCidade(cep);
String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente (nome, cep, cidade, estado);

    }
}
