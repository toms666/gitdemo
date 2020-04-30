package com.toms;

import com.toms.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "这是用来练习上传的第一个项目" );
        UserService su=new UserService();
        System.out.println( su.get());

    }
}
