package academy.learnprogramming;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {

        Data x = new Data("Fred",41);
        //x.Print();

        ArrayList<Data> array = new ArrayList<Data>();
        array.add(new Data("Fred", 21));
        array.add(new Data("Jo", 43));
        array.add(new Data("Zoe", 37));
        array.add(2,new Data("Harry", 78));
        //PrintCollection(array);

        LinkedList<Data> Linked = new LinkedList<Data>();
        Linked.add(new Data("Fred", 21));
        Linked.add(new Data("Jo", 43));
        Linked.add(new Data("Zoe", 37));
        Linked.add(2, new Data("Harry", 78));
        //PrintCollection(Linked);


        //Exercise 3
        ArrayList<Data> ArrayA = new ArrayList<Data>();
        ArrayA.add(new Data("Fred", 21));
        ArrayA.add(new Data("Jo", 43));
        ArrayA.add(new Data("Zoe", 37));

        ArrayList<Data> ArrayB = new ArrayList<Data>();

        /*PrintCollection(ArrayA);
        System.out.println();
        ArrayB = ArrayA;
        PrintCollection(ArrayB);
        System.out.println();
        ArrayA.remove(1);
        PrintCollection(ArrayB);*/


        ArrayList<Data> ArrayC = new ArrayList<Data>();
        ArrayC.add(new Data("Fred", 21));
        ArrayC.add(new Data("Jo", 43));
        ArrayC.add(new Data("Zoe", 37));

        ArrayList<Data> ArrayD = new ArrayList<Data>();

        /*PrintCollection(ArrayC);
        System.out.println();
        ArrayD = (ArrayList<Data>)ArrayC.clone();
        ArrayC.remove(1);
        PrintCollection(ArrayC);
        System.out.println();
        PrintCollection(ArrayD);
        System.out.println();*/

        Stack<Data> stack = new Stack<Data>();

        stack.push(new Data("Fred", 21));
        stack.push(new Data("Jo", 43));
        stack.push(new Data("Zoe", 37));
        PrintCollection(stack);

        while(stack.isEmpty() == false)
        {
            stack.pop().Print();
        }
        System.out.println(stack.size());

        ArrayBlockingQueue<Data> q = new ArrayBlockingQueue<Data>(10);

        q.add(new Data("Fred", 21));
        q.add(new Data("Jo", 43));
        q.add(new Data("Zoe", 37));
        PrintCollection(q);

        while(q.isEmpty() == false)
        {
            q.poll().Print();
        }
        System.out.println(q.size());

        for(int i=0;i<20;++i)
        {
            q.offer(new Data("Test:"+String.valueOf(i),i));
        }
        PrintCollection(q);


    }
    public static void PrintCollection(Collection<Data> c)
    {
        for (Iterator<Data> iter = c.iterator(); iter.hasNext();)
        {
            Data x = (Data)iter.next();
            x.Print();
        }
        System.out.println();
    }

}
