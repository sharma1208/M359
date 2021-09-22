package Unit3_Boolean.examples;

public class Student {
    private String fName;
    private String lName;
    private int idNum;

    public Student(String fName, String lName, int idNum) {
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int IdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    //returns true if they have the same first and last name, false otherwise
    public boolean equals(Student other){
        if(other.fName == this.fName && this.lName == other.lName){
            return true;
        } else{
            return false;
        }
    }

//returns - if this comes first; returns positive if this comes second; returns if zero if they have the same
    public int compareTo(Student other){
       int lastNameCompare =  this.lName.compareTo(other.lName);
       int firstNameCompare = this.fName.compareTo(other.fName);
        if(lastNameCompare != 0 ){
            return lastNameCompare;
        } else {
            return firstNameCompare;
        }
    }
}
