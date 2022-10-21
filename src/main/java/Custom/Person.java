package Custom;

public class Person {
    public static Person findUserByName(String userName) throws MyCustomException {
        String emptyString = "";
        if(emptyString.equals(userName)){
            throw new MyCustomException("Name cannot be emoty");

        }
        return new Person();
    }

    @Override
    public String toString() {
        return "Person{}";
    }
}
