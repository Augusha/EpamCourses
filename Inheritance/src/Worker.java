public class Worker extends Person {
   private String speciality;
   private double experience;
    Worker(String name, String surname, int age, String speciality, double experience) {
        super(name, surname, age);
        this.speciality = speciality;
        this.experience = experience;
    }
    public void setEducation(String education){
        this.speciality = education;
    }
    public String getEducation()
    {
        return speciality;
    }
    public void setCourse(int course)
    {
        this.experience = course;
    }
    public double getCourse()
    {
        return experience;
    }
    @Override
    public String Output() {
        return super.Output()+ "\nSpeciality: " + speciality + "\nExperience: " + experience + " years";
    }
}
