package taskgeotree;

public class Person {
    private String fullName;
    private String gender;

    public Person(String fullName, String gender) {
        this.fullName = fullName;
        this.gender = gender;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        } else if (this.getClass() != obj.getClass()){
            return false;
        } else return this.getFullName().equals(((Person) obj).getFullName());
    }
}
