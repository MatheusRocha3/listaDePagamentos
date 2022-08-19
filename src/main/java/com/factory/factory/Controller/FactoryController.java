package com.factory.factory.Controller;
import com.factory.factory.model.pagamentoModel;
import com.factory.factory.Service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FactoryController {

    @Autowired
    private FactoryService pagamentoService;

    @GetMapping(path = "/pagamento")
    public List<pagamentoModel> buscaTodosPagamentos(){
        return pagamentoService.buscarTodos();
    }

    @GetMapping(path = "/pagamento/{codigo}")
    public Optional<pagamentoModel> buscaPagamentoPorId(@PathVariable Long codigo){
        return pagamentoService.buscarId(codigo);
    }

    @PostMapping(path = "/pagamento")
    @ResponseStatus(HttpStatus.CREATED)
    public pagamentoModel cadastrarPagamento(@RequestBody pagamentoModel pagamentoModel){
        return pagamentoService.cadastrar(pagamentoModel);
    }

    @PutMapping(path = "/pagamento/{codigo}")
    public pagamentoModel alterarPagamento(@RequestBody pagamentoModel pagamentoModel){
        return pagamentoService.alterar(pagamentoModel);
    }

    @DeleteMapping(path = "/pagamento/{codigo}")
    public void deletarPagamento(@PathVariable Long codigo){
        pagamentoService.deletar(codigo);
    }

}
