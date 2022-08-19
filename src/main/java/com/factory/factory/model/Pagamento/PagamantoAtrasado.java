package com.factory.factory.model.Pagamento;
import com.factory.factory.model.pagamentoModel;
import java.math.BigDecimal;
public class PagamantoAtrasado implements calcularPagamento{
    @Override
    public BigDecimal calculoPagamento(pagamentoModel pagamentoModel) {
        return   pagamentoModel.getValorAPagar().add(pagamentoModel.getDiferencaDeValor());
    }
}
