package be.robydevisser.receptcal.service;

import be.robydevisser.receptcal.model.User;
import be.robydevisser.receptcal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    PasswordEncoder pwEnc;

    @Autowired
    UserRepository userRepository;

    public User save(User user) {
        user.setPassword(pwEnc.encode(user.getPassword()));
        user.setId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    public User login(String email, String password){
        User user = userRepository.findOneByEmail(email);
        if(equalPassword(user.getPassword(),password)){
            user.setPassword("");
            return user;
        }
        return new User();
    }

    private Boolean equalPassword(String userPw, String pw){
        return pwEnc.matches(userPw,pw);
    }
}
