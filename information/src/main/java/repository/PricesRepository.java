package repository;

import model.Prices;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PricesRepository extends CrudRepository<Prices, Integer> {

    List<Prices> findFirst10ByCoincodeOrderByDateDesc(String Coincode);

    Long countByCoincode(String Coincode);
}
