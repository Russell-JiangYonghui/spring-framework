package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mac on 2020/5/16.
 */
public class SpringMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("classpath:my-spring-config.xml");
	}
}
