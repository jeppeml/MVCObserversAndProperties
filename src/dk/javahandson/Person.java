package dk.javahandson;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private StringProperty name = new SimpleStringProperty();

    public Person() {
    }

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }
/*
    @Override
    public String toString() {
        return name.get();
    }*/
}
