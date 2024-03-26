package Past.training;

public class Person {
    public String name;
    public int age;
    public Gender gender = Gender.UNKNOWN;
    public String universalRights = "All humans are created equal";
    public void haveBirthday(){
        age++;
    }

    public int getAge() {
            return age;
    }


    public Gender getGender(){
        return gender;
    }
    public void setname(String test){
        name = test;
    }
    public void setage(int test1){
        age = test1;
    }
    public void setGender(Gender test2){
        gender = test2;
    }
}
