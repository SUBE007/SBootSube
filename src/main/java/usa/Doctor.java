package usa;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//what ever the class you created it is used to create beans of that object
@Scope(scopeName = "singleton")
public class Doctor implements Staff{

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void  assist(){
        System.out.println("Doctor is Assisting");
    }
}
