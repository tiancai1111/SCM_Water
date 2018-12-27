package app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages= {"controller","service"})
@MapperScan("mapper")
@EnableCaching
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
}
