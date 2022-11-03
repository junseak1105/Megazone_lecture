package com.rubypaper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplication.class,
properties={
        "author.name=홍길동",
        "author.age=20",
        "author.nation=한국",
})
public class PropertiestTest {
    @Autowired
    Environment env;

    @Test
    public void testMethod() {
        System.out.println("이름: " + env.getProperty("author.name"));
        System.out.println("나이: " + env.getProperty("author.age"));
        System.out.println("국가: " + env.getProperty("author.nation"));

    }
}
