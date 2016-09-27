import com.rabbit.dto.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shuangjian on 2016/9/21.
 */
public class StartUp {

    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-rabbit.xml");
        RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
        User user = new User();
        user.setId(1);
        user.setName("test");
        template.convertAndSend(user);
        Thread.sleep(1000);
        ctx.destroy();
    }
}
