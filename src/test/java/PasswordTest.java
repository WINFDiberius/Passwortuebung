import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    Password weak;


    @BeforeEach
    void setUp(){
        weak = new Password("weak","onlysigns",7);
    }

    @Test
    void validatePasswordStrength() {

        int strength = 0;

        Assertions.assertEquals(strength, weak.validatePasswordStrength());

    }
}