package Past.training;

public class Trainee {
        public String firstName ;
        public String lastName;
        public Trainee(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String fullName() {
            return firstName + " " + lastName;
        }
}
