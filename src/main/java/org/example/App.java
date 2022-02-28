package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("personId",Person.class);
        Popugay popugay = context.getBean("popugayId",Popugay.class);
        Cat cat = context.getBean("catId",Cat.class);
        Person person1 = context.getBean("FriendId",Person.class);
        System.out.println(person);
        System.out.println(person1);


    }
}
