package nejolearn.nejolearn.repositories;

import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource
public class ClientRepository extends JpaRepository<Client,Long> {
}
