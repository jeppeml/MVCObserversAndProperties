package dk.javahandson;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MainModel {
    private final ObservableList<Person> names;

    public MainModel() {
        this.names = FXCollections.observableArrayList();
    }

    public ObservableList<Person> getNames() {
        return names;
    }

    public void loadFromDB(){
        MockDB db = new MockDB();
        this.names.clear();
        this.names.addAll(db.getAllPersons());
    }

    public void delete(Person selected) {
        this.names.remove(selected);
        // Code to update DB
    }

    public void add(Person p) {
        this.names.add(p);
        // Code to update DB
    }
}
