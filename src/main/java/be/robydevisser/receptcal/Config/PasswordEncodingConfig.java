/*
 Author:Roby de Visser
*/

package be.robydevisser.receptcal.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordEncodingConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {

        return new PasswordEncoder() {

            @Override
            public String encode(CharSequence rawPassword) {

                return BCrypt.hashpw(rawPassword.toString(), BCrypt.gensalt(6));
            }

            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {

                return BCrypt.checkpw(rawPassword.toString(), encodedPassword);
            }
        };
    }

}
