import com.feit.rhip3.MvcAPP;
import com.feit.rhip3.domain.User;
import com.feit.rhip3.domain.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = MvcAPP.class)
public class ApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void getHello() throws Exception {
    }

    @Test
    public void test() throws Exception{
        //userRepository.save(new User("AAA", 10));
        User user= userRepository.findByName("AAA");
        System.out.println(user.toString());
    }
}
