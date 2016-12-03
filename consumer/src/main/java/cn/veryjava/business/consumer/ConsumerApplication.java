package cn.veryjava.business.consumer;

import com.alibaba.boot.dubbo.EnableDubboAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.business.consumer.
 * 作者: barton.
 * 日期: 16-12-3.
 * 项目名称: business
 * 版本: 1.0
 * JDK: since 1.8
 */
@SpringBootApplication
@EnableDubboAutoConfiguration
public class ConsumerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConsumerApplication.class, args);
  }
}
