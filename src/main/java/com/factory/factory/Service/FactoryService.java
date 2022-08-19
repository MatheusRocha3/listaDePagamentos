package com.factory.factory.Service;
import com.factory.factory.model.pagamentoModel;
import com.factory.factory.model.Pagamento.PagamentoFactory;
import com.factory.factory.Repository.FactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class FactoryService {
    @Autowired
    private FactoryRepository pagamentoRepository;


    public List<pagamentoModel> buscarTodos(){
        return pagamentoRepository.findAll();
    }

    public Optional<pagamentoModel> buscarId(Long codigo){
        return pagamentoRepository.findById(codigo);
    }

    public pagamentoModel cadastrar(pagamentoModel pagamentoModel){
        PagamentoFactory factory = new PagamentoFactory();
        BigDecimal valor = factory.calculoPagamento(pagamentoModel.getStatus()).calculoPagamento(pagamentoModel);
        pagamentoModel.getIdPagamento();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getDiferencaDeValor();
        pagamentoModel.setValorPago(valor);

        return pagamentoRepository.save(pagamentoModel);
    }


    public pagamentoModel alterar(pagamentoModel pagamentoModel){

        PagamentoFactory factory = new PagamentoFactory();
        BigDecimal valor = factory.calculoPagamento(pagamentoModel.getStatus()).calculoPagamento(pagamentoModel);
        pagamentoModel.getIdPagamento();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getDiferencaDeValor();
        pagamentoModel.setValorPago(valor);

        return pagamentoRepository.save(pagamentoModel);
    }

    public void deletar(Long codigo){
        pagamentoRepository.deleteById(codigo);
    }
}
