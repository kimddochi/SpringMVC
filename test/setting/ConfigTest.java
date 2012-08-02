package setting;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import utils.BeanDefinitionUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/test-context.xml")
public class ConfigTest {

	@Test
	public void configTest() throws Exception {
		//GenericXmlApplicationContext ac = new GenericXmlApplicationContext("classpath:/config/root-context.xml");
		GenericXmlApplicationContext ac = new GenericXmlApplicationContext(getClass(), "../test-context.xml");
		
		BeanDefinitionUtils.printBeanDefinitions(ac);
	}
}
