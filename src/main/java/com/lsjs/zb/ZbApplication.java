package com.lsjs.zb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yhx12
 */

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.lsjs.zb.dao")
public class ZbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZbApplication.class, args);
	}
}



