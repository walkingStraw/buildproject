import jdk.nashorn.internal.runtime.regexp.joni.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sang.App;
import org.sang.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { App.class})
public class Test01ApplicationTests {

    @Autowired
    private HelloService helloService;

    @Test
    public void contextLoads(){
        Assert.assertThat(helloService.sayHello("lzb"), Matchers.is("hellolzb"));
    }
}
