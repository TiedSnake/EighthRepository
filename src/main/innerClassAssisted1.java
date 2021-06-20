/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class innerClassAssisted1
{

    private String msg = "Welcome to Java";

    class Inner
    {

        void hello()
        {
            System.out.println(msg + ", Let us start learning Inner Classes");
        }
    }

    public static void main(String[] args)
    {
        innerClassAssisted1 obj = new innerClassAssisted1();

        innerClassAssisted1.Inner in = obj.new Inner();
        in.hello();
    }
}
