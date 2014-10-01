/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.totoland.test;

import com.totoland.web.factory.DropdownFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author totoland
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:spring/config/BeanLocations.xml"
    })
public class App {
    
    @Autowired
    DropdownFactory dropdownFactory;
    
    @Test
    public void test(){
    
        System.out.println(dropdownFactory.ddlStrategic());
        
    }
    
}
