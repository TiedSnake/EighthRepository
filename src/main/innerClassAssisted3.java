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
abstract class AnonymousInnerClass
{
    public abstract void display();
}
public class innerClassAssisted3
{
    public static void main(String[] args)
    {
        AnonymousInnerClass i = new AnonymousInnerClass()
        {
            public void display()
            {
                System.out.println("Anonymous Inner Class");
            }
        };
        i.display();
    }
}