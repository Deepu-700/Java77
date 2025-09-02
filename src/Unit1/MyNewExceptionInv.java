package Unit1;

public class MyNewExceptionInv {
public static void main(String[] args) {
    UserdefineException udf =new UserdefineException();
    try
    {
        udf.validate(20);
    }
    catch (InvalidAgeException e)
    {
        System.out.println(e.getMessage());
    }
}
}
