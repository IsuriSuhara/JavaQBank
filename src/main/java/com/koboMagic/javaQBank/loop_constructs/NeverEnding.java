package main.java.com.koboMagic.javaQBank.loop_constructs;

//What will the following code print?
public class NeverEnding {
    int x = 5;
    int getX(){ return x; }

    public static void main(String[] args) {
        NeverEnding tc = new NeverEnding();
        tc.looper();
        System.out.println(tc.x);
    }

    public void looper(){
//        int x = 0;
        while( (x = getX()) != 0 ){
            for(int m = 10; m>=0; m--){
                x = m;
            }
        }

    }
}

//This program will compile and run but will never terminate.
//Note that looper() declares an automatic variable x, which shadows the instance variable x. So when x = m; is executed,
// it is the local variable x that is changed not the instance field x. So getX() never returns 0.
// If you remove int x = 0; from looper(), it will print 0 and end.
