package main.java.com.koboMagic.javaQBank.loop_constructs;

public class CrazyLoop {
    void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
//            JILL:  System.out.println(c);//1
            JILL: if (c > 3) break JILL; else c++;//2
        }
    }
}

//compile error will be shown on line 2, uncomment line 1 and remove start label JILL from line 2 and see.
//Because break JILL; would be valid only when it is within the block of code under the scope of the label JILL.
// In this case, the scope of JILL extends only up till System.out.println(c); and break JILL; is out of the scope of the label.