package Unit1;

public class A{
    final int x;
    A(){
        x=12;
    }
//    x=13 nhi ho payega
        public final void display()
        {
            System.out.println("I am in nested class A.");
        }
    }
//    copy constructor java me nhi hota
// 8 data types in primitive
//private-same class me access hoga
//default - package ke andr aur class ke andr
//public- access anywhere
//protected
//variable - local instance static
//static - memory allocate one time only
//staic - block class variable
//
//class ke sath bnega
//class ke andr bnega
//method ko static kr diya to bina obj ke usko call kr skte hai
//static block - main se phle bnta hai class ke andr rhega phle compile hoga
//static class outer walo ko nhi bna skte inner walo ko bna skte hai
//main is necessary to get the output
//Final keyword - variable method class me use hoga ye
//final variable - to create a constant variable
//INHERITANCE : java multiple inheritance support nhi krta
//final methods - method over riding can not done
//final class - cannnot inheritance
//can we initialize blank final variable ?
// Abstraction in java - it focuses on what an object does not how it does it.
//Ways to achieve Abstraction in Java
