package main.java.com.koboMagic.javaQBank.working_with_methods;

//Which of the following options when applied individually will change the Data object currently referred to by the
// variable d to contain 2, 2 as values for its data fields?
class Data {
    private int x = 0, y = 0;

    public Data(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public void setValues(int x, int y) {//3
//        this.x = x;
//        this.y = y;
//    }
}

public class EncapsulationTest {
    public static void main(String[] args) {
        Data d = new Data(1, 1);
        //add code here
//        d.x = 2; d.y = 2;//1
//        d = new Data(2, 2);//2
//        d.setValues(2, 2);//3
    }
}

//Note that x and y are private in class Data. Therefore, you cannot access these members from any other class.
//d = new Data(2, 2);This will create a new Data object and will not change the original Data object referred to be d.
//Third method is a good example of encapsulation where the data members of Data class are private and there is a
// method in Data class to manipulate its data. Compare this approach to making x and y as public and letting other
// classes directly modify the values.