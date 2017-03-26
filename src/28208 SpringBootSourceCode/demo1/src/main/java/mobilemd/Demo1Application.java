package mobilemd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@RequestMapping("/")
	public String Index()
    {
		return "hello spring boot";
	}

    @Autowired
	private Author auther;

    @RequestMapping("/author")
	public Author GetAuthor(){
        return auther;
    }
}
