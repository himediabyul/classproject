package com.app.board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.app.board.mapper") // 메인메소드
public class SpringBootBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBoardApplication.class, args);
	}

}
