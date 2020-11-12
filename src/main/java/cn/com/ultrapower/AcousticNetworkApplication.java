package cn.com.ultrapower;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement  //开启事务
@MapperScan("cn.com.ultrapower.mapper")
@SpringBootApplication
public class AcousticNetworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcousticNetworkApplication.class, args);
    }

}
