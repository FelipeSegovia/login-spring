package nejolearn.nejolearn.models.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
public class TblUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;

    public TblUser(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public TblUser() {

    }
}

