package com.factory.factory.model.Pagamento;

public class PagamentoFactory {
    public calcularPagamento calculoPagamento(String tipoDePagamento){

        if (tipoDePagamento.equalsIgnoreCase("PAGAMENTO_ATRASADO")){
            return new PagamantoAtrasado();
        } else if (tipoDePagamento.equalsIgnoreCase("PAGAMENTO_EM_DIA")) {
            return new PagamentoEmDia();
        }
        return null;
    }

}
