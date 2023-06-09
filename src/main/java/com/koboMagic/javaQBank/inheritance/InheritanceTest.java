package main.java.com.koboMagic.javaQBank.inheritance;


//Which of the following lines of code will print the name of the Eagle object?
interface Flyer {
    String getName();
}

class Bird implements Flyer {
    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Flyer f = new Eagle("American Bald Eagle");
//        System.out.println(f.name);
        System.out.println(f.getName());
        System.out.println(((Eagle)f).name);
        System.out.println(((Bird)f).name);
        System.out.println(((Bird)f).getName());
//        System.out.println(Eagle.name);
//        System.out.println(Eagle.getName(f));



    }
}

//name is not a static field in class Eagle.
//While accessing a method or variable, the compiler will only allow you to access a method or variable that is visible
// through the class of the reference.  When you try to use f.name, the class of the reference f is Flyer and Flyer has
// no field named "name", thus, it will not compile. But when you cast f to Bird (or Eagle), the compiler sees that the
// class Bird (or Eagle, because Eagle inherits from Bird) does have a field named "name" so ((Eagle)f).name or
// ((Bird)f).name will work fine.  f.getName() will work because Flyer does have a getName() method.
