package org.zerock.sample;

import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTest {

    @Autowired
    private Restaurant restaurant;

    @Test
    public void testExist(){
        Assert.assertNotNull(restaurant);

        log.info(restaurant);
        log.info("=========================");
        log.info(restaurant.getChef());
    }

}