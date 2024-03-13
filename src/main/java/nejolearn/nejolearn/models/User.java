package nejolearn.nejolearn.models;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
