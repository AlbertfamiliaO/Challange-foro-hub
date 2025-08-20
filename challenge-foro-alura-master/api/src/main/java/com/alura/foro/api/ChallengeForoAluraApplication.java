package com.alura.foro.api;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeForoAluraApplication {

	public static void  man(MysqlxDatatypes.Scalar.String[] args) {
		SpringApplication.run(ChallengeForoAluraApplication.class, args);
	}

}
