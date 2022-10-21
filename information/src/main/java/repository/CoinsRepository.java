package repository;

import model.Coins;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinsRepository extends CrudRepository<Coins, String> {
}
