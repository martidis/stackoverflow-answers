package com.tasosmartidis.stackoverflow.jaxb;


import com.tasosmartidis.stackoverflow.jaxb.base.config.BaseConfiguration;
import com.tasosmartidis.stackoverflow.jaxb.base.util.UnmarshallingUtil;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BaseConfiguration.class)
public class BaseTestSetup {

	@Autowired
	protected UnmarshallingUtil unmarshallingUtil;
}
