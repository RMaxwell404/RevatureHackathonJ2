package com.revature.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescriptionMakerTest {

    private DescriptionMaker dMaker = new DescriptionMaker();

    @Test
    public void makeDescriptionTest(){
        System.out.println(dMaker.makeDescription());

    }

}