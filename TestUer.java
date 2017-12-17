package demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.entity.User;
import demo.service.UserI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestUer {
	
	private UserI ui;

	public UserI getUi() {
		return ui;
	}
	@Autowired
	public void setUi(UserI ui) {
		this.ui = ui;
	}
	
	@Test
	public void test01() {
		User u = ui.getUser(5);
//		u.setId(5);
//		u.setName("好好思考的积分是");
//		ui.setUser(u);
		System.out.println(u.getName());
	}
}
