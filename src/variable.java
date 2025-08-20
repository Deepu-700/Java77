public class variable {
    static int bread = 10;
    static{
        System.out.println("I am in static block.");
    }
    public static void display(){       /**/
        System.out.println("Slices Remaining "+bread);
    }

    public static void eat() {

        bread--;

    }

    public static void main(String[] args) {
//        variable v1=new variable();
//        variable v2=new variable();
//        v1.bread= v1.bread -1;
//        System.out.println(v2.bread);
//    }

        variable.display();
        variable.eat();
        variable.display();
        System.out.println(variable.bread);
    }
}
