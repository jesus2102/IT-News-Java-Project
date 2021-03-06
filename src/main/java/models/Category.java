package models;

public enum Category {

    JAVA("Java"),
    RUBY("Ruby"),
    PYTHON("Python"),
    JAVASCRIPT("JavaScript"),
    C("C"),
    CPLUS("C++"),
    SWIFT("Swift"),
    NEWRELEASE("New Release"),
    TECH("Technology"),
    RESEARCH("Research"),
    WORK("Work"),
    IDEAS("Ideas"),
    HISTORY("History");

    private final String name;

    Category(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
