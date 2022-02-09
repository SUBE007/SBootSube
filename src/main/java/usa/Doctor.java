package usa;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component//what ever the class you created it is used to create beans of that object
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

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

    @Override
    public void setBeanName(String s) {
        System.out.println("set bean name method is called");

    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("post constrcut is called");
    }
}
