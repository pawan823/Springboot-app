 package in.pawanit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages={"com.pawanit","in.pawanit",})

@SpringBootApplication

public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		/*below code r for understanding purpose
		int count = ctxt.getBeanDefinitionCount();
		System.out.println("Bean Definition count:"+count);
		String[] beanDefinitionNames = ctxt.getBeanDefinitionNames();
		for(String name:beanDefinitionNames)
		{
			System.out.println(name);
		}*/
	}

}

