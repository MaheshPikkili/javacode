package com.ojas.arralist;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


// TODO: Auto-generated Javadoc
/**
 * The Class First.
 */
public class First {
    
    /** The Constant LOGGER. */
    public final static Logger LOGGER=Logger.getLogger(First.class);
    
    
    /** The flag. */
    public transient boolean flag=true;
    
    /**
     * Method 1.
     */
    public void method1() {
        
        BasicConfigurator.configure();
        final Scanner scanner=new Scanner(System.in);
        final ArrayList<String> alist=new ArrayList<String>();
        LOGGER.debug("insert object into arraylist:");
        while(flag) {
            alist.add(scanner.next());
            LOGGER.debug("do you want to insert one more object(yes):");
            final String option=scanner.next();
            if ("yes".equalsIgnoreCase(option)) {
                flag = true;
                LOGGER.debug("insert object");
            }
            else  {
                flag = false;
            }
        }
        LOGGER.debug(alist);
        scanner.close();
    }
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(final String[] args) {
        
        // TODO Auto-generated method stub
        new First().method1();
    }

}