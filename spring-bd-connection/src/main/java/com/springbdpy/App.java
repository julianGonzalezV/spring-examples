package com.springbdpy;

import com.springbdpy.beans.Barca;
import com.springbdpy.beans.Juve;
import com.springbdpy.beans.Player;
import com.springbdpy.beans.ShirtBrand;
import com.springbdpy.service.impl.ShirtBrandServiceImp;
import com.springbdpy.service.interfaces.ShirtBrandService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/springbdpy/xml/beans.xml");

        ShirtBrand brand = (ShirtBrand) context.getBean("shirtBrand");
        brand.setId("brand0001");
        brand.setName("spring brand");

        ShirtBrandService brandService  =  (ShirtBrandService) context.getBean("shirtBrandServiceImp");
        try{
            brandService.insert(brand);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        Player player1 = (Player) context.getBean("player");
        System.out.println("****************CREATED PLAYER************************");
        System.out.println(player1);
        System.out.println("****************END CREATED PLAYER********************");


        ((ConfigurableApplicationContext) context).close();


    }
}
