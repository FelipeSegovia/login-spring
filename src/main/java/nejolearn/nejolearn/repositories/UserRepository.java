package nejolearn.nejolearn.repositories;

import nejolearn.nejolearn.models.user.TblUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<TblUser,Long> {
}
