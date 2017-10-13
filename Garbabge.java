

import java.util.*;

class Garbabge {

    int num;
    public void finalize()
    {
        System.out.println("Object no "+num+"  destroyed ");
    }
    public static void main(String[] args) {
        for(int i =1;i<20;i++)
        {
            Garbabge g = new Garbabge();
            g.num = i;
        }
    }
    
}