package com.study.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ���������ṩ��
 */
public class DubboStarter {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "provider.xml" });
		context.start();
		System.in.read(); // ��������˳�
		context.close();
	}
}