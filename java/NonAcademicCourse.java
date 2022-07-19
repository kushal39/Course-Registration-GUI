//NonAcademicCourse is a subclass of Course in this case. 
public class NonAcademicCourse extends Course{
   //Using the private modifier to declare instance variables 
   private String instructorname;
   private int Duration;
   private String startdate;
   private String completiondate;
   private String examdate;
   private String prerequisite;
   private boolean isregistered;
   private boolean isremoved;
   //Creating a NonAcademicCourse constructor with the public modifier 
   public NonAcademicCourse( String CourseID, String Coursename, int Duration, String prerequisite ){
    //super is used to call the specified parameters from SuperClass Course inside parantheses. 
    super(CourseID, Coursename,Duration);
    this.instructorname = instructorname;/*This keyword is used to distinguish between the instance and local variables instructor name*/
    this.Duration= Duration;
    this.startdate = "";
    this.completiondate = "";
    this.examdate= "";
    this.prerequisite = prerequisite;
    this.isregistered = false;
    this.isremoved = true;
    }
    //To get instructor name from a declared instance variable, use the getter method. 
    public String getInstructorName(){
        return instructorname;//returns instructor_name
    }
    // To get the start date from a declared instance variable, use the getter method. 
    public String getStartDate(){
        return startdate;//returns start_date
    }
    // To get completion date from a declared instance variable, use the getter method. 
    public String getCompletionDate(){
        return completiondate;//returns completion_date
    }
    // To get exam date from a declared instance variable, use the getter method. 
    public String getExamDate(){
        return examdate;//returns exam_date
    }
    // To get a prerequisite from a declared instance variable, use the getter method. 
    public String getPrerequisite(){
        return prerequisite;//returns prerequisite
    }
    // To get is registered from a declared instance variable, use the getter method. 
    public boolean getIsRegistered(){
        return isregistered;//returns is_registered
    }
    // To get is removed from a declared instance variable, use the getter method. 
    public boolean getIsRemoved(){
        return isremoved;//returns is_removed
    }
    // Setting up a setter setInstructorName is a function that sets the value of the String type parameter instructor name. 
    public void setInstructorName(String instructorname){
       if(isregistered==false){
        this.instructorname = instructorname;
        System.out.println("New Instructor has been registered");
        }
       else{
        System.out.println("Instructor's name cannot be changed");
        }
    }
    // The register method was created with a returntype of void and a public modifier. 
    public void register( String Courseleader,String instructorname, String startdate,
    String completiondate, String examdate){
      if(isregistered==false){
        super.setCourseLeader(Courseleader);
        setInstructorName(instructorname);
        this.startdate=startdate;
        this.completiondate=completiondate;
        this.examdate=examdate;
        this.instructorname = instructorname;
        this.isregistered = true;
        }
      else{
         System.out.println("Non-Academic Course has already been registered");
        }
    }
    // returntype void and public modifier were used to create the remove() method. 
    public void remove(){
     if(isremoved==true){
        System.out.println("Non-Academic Course is also removed");
        }
     else{
        super.getCourseLeader();
        this.instructorname="";
        this.startdate="";
        this.completiondate="";
        this.examdate="";
        this.isregistered=false;
        this.isremoved=true;
     }
    }
    // The returntype void and public modifier were used to create the display() method. 
    public void display(){
    super.display();//call values from class Course
    if(isregistered==true){
    System.out.println("Instructor Name "+this.instructorname);
    System.out.println("Start Date "+this.startdate);
    System.out.println("Completion Date "+this.completiondate);
    System.out.println("Exam Date "+this.examdate);
    }
   
    }
}//end of the subclass Non Academic Course

