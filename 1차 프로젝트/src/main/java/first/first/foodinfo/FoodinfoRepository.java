package first.first.foodinfo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodinfoRepository extends JpaRepository<FoodInfo, Long> {

}
