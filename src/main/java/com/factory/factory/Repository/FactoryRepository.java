package com.factory.factory.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.factory.factory.model.pagamentoModel;

@Repository
public interface FactoryRepository extends JpaRepository<pagamentoModel, Long>{
}
