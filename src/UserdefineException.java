public class UserdefineException {
    public void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("cannot vote");
        else
            System.out.println("Eligible to vote");

    }
}