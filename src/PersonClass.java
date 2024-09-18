public class PersonClass {
    private String name; //restricted access

    //getter and setter
    //returns the value of the variable name
    public String getName(){
        return name;
    }
    //set method takes a parameter (newName) and assigns it to the name variable.
    // this keyword is used to refer to the current object.
    public void setName(String newName){
        this.name = newName;
    }
}
