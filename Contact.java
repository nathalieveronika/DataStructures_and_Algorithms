public class Contact implements Comparable<Contact> {
    public String firstName;
    public String lastName;

    public Contact(String f, String l) {
        firstName = f; lastName = l;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public int compareTo(Contact c) {
        // for contacts with different last names,
        // it should compare their last names
        if (c.lastName != this.lastName){
          // or is it the other way round?
          return this.lastName.compareTo(c.lastName);
        } else {
          // for contacts with the same last name
          // it should compare their first names
          return this.firstName.compareTo(c.firstName);
        }

    }
}
