package com.techsharezone.bootify.aws.sns;

import com.amazonaws.services.sns.AmazonSNS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootifyAwsSnsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootifyAwsSnsExampleApplication.class, args);
	}

}
