package examples.aaronhoskins.com.week2day3demo.models;

public class Person  {
    private String firstName;
    private String lastName;
    public String doNotDoThis;
    protected String alsoDoNotDoThisUnlessYouKnowForSure;

    public Person() {
    }

    public Person(String firstName, String lastName, String doNotDoThis) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.doNotDoThis = doNotDoThis;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDoNotDoThis() {
        return doNotDoThis;
    }

    public void setDoNotDoThis(String doNotDoThis) {
        this.doNotDoThis = doNotDoThis;
    }

    public void talk() {
        System.out.println("I AM PERSON");
    }
}
