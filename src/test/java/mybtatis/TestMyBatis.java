package mybtatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.blog.common.t01.pojo.User;
import com.blog.common.t01.service.IUserService;

/**
 * 
 * 功能说明：mybatis连接测试
 *
 * @date 2017-4-21
 * @author chenwq
 * @email chenwqEmail@163.com
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	private ApplicationContext applContext = null;
	@Resource
	private IUserService userService = null;
	@Before
	public void before() {
		applContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		userService = (IUserService) applContext.getBean("userService");
	}
	@Test
	public void test() {
		User user = userService.getUserById(1);
		 logger.info("用户名："+user.getUserName());
		logger.info(JSON.toJSONString(user));
	}
}
