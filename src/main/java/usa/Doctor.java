package usa;

import org.springframework.stereotype.Component;

@Component//what ever the class you created it is used to create beans of that object
public class Doctor implements Staff{

    public void  assist(){
        System.out.println("Doctor is Assisting");
    }
}
