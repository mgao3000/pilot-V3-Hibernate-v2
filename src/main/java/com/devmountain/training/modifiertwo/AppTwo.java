package com.devmountain.training.modifiertwo;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppTwo
{
    private static Logger logger = LoggerFactory.getLogger(com.devmountain.training.modifier.App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.info( "Hello World from logger!" );
        com.devmountain.training.modifier.App app = new com.devmountain.training.modifier.App();
        app.isInputStringANumeric();

        ModifierHelloWorldSubClassDifferentPackage modifierHelloWorldSubClassDifferentPackage =
                new ModifierHelloWorldSubClassDifferentPackage();
  //      modifierHelloWorldSubClassDifferentPackage.

    }

    public void isInputStringANumeric() {
        String text1 = "012abc5";
        String text2 = "012345";

        boolean result1 = StringUtils.isNumeric(text1);
        boolean result2 = StringUtils.isNumeric(text2);

        System.out.println((text1 + " is a numeric? " + result1));
        System.out.println((text2 + " is a numeric? " + result2));
        logger.info((text1 + " is a numeric? " + result1));
        logger.info((text2 + " is a numeric? " + result2));
    }
}
