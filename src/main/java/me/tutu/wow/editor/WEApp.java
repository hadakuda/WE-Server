package me.tutu.wow.editor;

import me.tutu.wow.editor.config.DynamicDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({DynamicDataSourceConfig.class})
@SpringBootApplication
public class WEApp {

	public static void main(String[] args) {
		SpringApplication.run(WEApp.class, args);
	}

}
