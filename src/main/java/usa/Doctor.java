package usa;

public class Doctor implements Staff{
    private  String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    public void  assist(){
        System.out.println("Doctor is Assisting");
    }
}
