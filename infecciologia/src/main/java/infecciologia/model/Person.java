package infecciologia.model;

import java.io.Serializable;
import java.util.List;
 
import javax.persistence.*;
 
@Entity
@NamedQuery(name = "Person.findUserByIdWithDogs", query = "select p from Person p left join fetch p.dogs where p.id = :personId")
public class Person implements Serializable {
 
    private static final long serialVersionUID = 1L;
    public static final String FIND_USER_BY_ID_WITH_DOGS = "Person.findUserByIdWithDogs";
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int age;
    private String name;
 
    @ManyToMany
    private List<Dog> dogs;
 
    // get and set
 
    @Override
    public int hashCode() {
        return getId();
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return person.getId() == getId();
        }
 
        return false;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}