package org.gax.cv4.main;

import org.gax.cv4.model.MyExceptionClass;

import java.security.KeyException;

public class Test {
    public static void main(String[] args) {
        int[] a={0,1,2};
        try{
            System.out.println(a[8]);
        }catch(Exception e){
            System.out.println("sxd");
        }

        try{
            if(a[0] == 0){
                throw new MyExceptionClass("sts");
            }
        }catch (MyExceptionClass e){
            System.out.println(e);
        }
    }
}
