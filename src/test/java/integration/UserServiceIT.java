package integration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestConstructor;
import org.springframework.transaction.annotation.Transactional;
import ru.javarush.mapper.UserMapper;
import ru.javarush.repository.UserRepository;

@SpringBootTest
@Transactional
@ActiveProfiles("test")
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
public class UserServiceIT {

    private UserMapper userMapper;
    private UserRepository userRepository;

    @Test
    public void findById(){

    }


}
