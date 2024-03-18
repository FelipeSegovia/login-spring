package nejolearn.nejolearn.services;

import nejolearn.nejolearn.models.user.TblUser;

import java.util.List;


public interface IUser {
    List<TblUser> getAll();
    TblUser getById(Long id);

    List<TblUser> seedUsers();
    TblUser createUser(String name, String email, String password);
}