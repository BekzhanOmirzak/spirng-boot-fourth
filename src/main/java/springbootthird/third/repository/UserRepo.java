package springbootthird.third.repository;


import org.springframework.data.repository.CrudRepository;
import springbootthird.third.models.User;

public interface UserRepo extends CrudRepository<User,Long> {


}
