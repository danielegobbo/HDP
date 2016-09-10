package infecciologia.model;

import java.io.Serializable;
import java.util.List;
 
import javax.persistence.*;
 
@Entity
public class Dog implements Serializable{
    private static final long serialVersionUID = 1L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int age;
    private String name;
 
    @ManyToMany(mappedBy="dogs")
    private List<Person> persons;
 
    // get and set
 
    @Override
    public int hashCode() {
        return getId();
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;
            return dog.getId() == getId();
        }
 
        return false;
    }
 
    @Override
    public String toString() {
        return name;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}