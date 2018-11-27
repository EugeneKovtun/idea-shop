package ua.kpi.tef.ideashop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.kpi.tef.ideashop.controllers.HomeController;
import ua.kpi.tef.ideashop.controllers.ProductController;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IdeaShopApplicationTests {

    @Autowired
    private HomeController homeController;
    @Autowired
    private ProductController productController;
	@Test
	public void contextLoads() {
        assertThat(homeController).isNotNull();
        assertThat(productController).isNotNull();
    }

}
