package nejolearn.nejolearn.services;

import nejolearn.nejolearn.models.user.TblUser;
import nejolearn.nejolearn.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUser{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public List<TblUser> getAll() {
        return userRepository.findAll();
    }

    @Override
    public TblUser getById(Long id) {
        return null;
    }

    @Override
    public List<TblUser> seedUsers() {
        return null;
    }

    @Override
    public TblUser createUser(String name, String email, String password) {
        TblUser userCreated = new TblUser(name, email, password);
        return userRepository.save(userCreated);
    }
}
