package ContactBook;

public abstract class Person {
    protected String name;

    public String getName(){
        return name;
    }

    public abstract String getInfo();
}
