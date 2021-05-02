package repository;
import edu.wctc.distjavazodiac.entity.Fortune;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.crudRepository;
public interface FortuneRepository extends CrudRepository<Fortune, Integer> {
}
