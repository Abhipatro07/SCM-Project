package com.scm.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.scm.Entities.User;

@Repository
public interface UserRepo extends JpaRepository<User , String>{
    //* Extra methods DB related operations
    //* Custom query methods
    //* custom finder methods

    static Optional<User> findByEmail(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByEmail'");
    }
    Optional<User> findByEmailAndPassword(String email , String password);

}
