public class AcademicCourse extends Course{
    private String LecturerName;
    private String Level;
    private String Credit;
    private String StartingDate;
    private String CompletionDate;
    private int NumberOfAssessment;
    private boolean isRegistered ;
   
    public AcademicCourse(String CourseID, String Coursename,int Duration, String Level, String Credit,
     int NumberOfAssessment){  
    super(Coursename, CourseID, Duration);
    this.LecturerName="";
    this.Level = Level;
    this.Credit = Credit;
    this.StartingDate = "";
    this.CompletionDate ="";
    this.isRegistered = false;
    this.NumberOfAssessment =NumberOfAssessment;
    }
    public String getLecturerName(){
        return LecturerName;
    }
    public String getLevel(){
        return Level;
    }
    public String getCredit(){
        return Credit;
    }
    public String getStartingDate(){
        return StartingDate;
    }
    public String  getCompletionDate(){
        return CompletionDate;
    }
    public boolean getIsRegistered(){
        return isRegistered;
    }
    public int getNumberOfAssessment(){
        return NumberOfAssessment;
    }
    public void  setLecturerName( String LecturerName){
        this.LecturerName =  LecturerName;
    }
    public void  setNumberOfAssessment( int NumberOfAssessment){
        this.NumberOfAssessment = NumberOfAssessment;
    }
    public void registered(String Courseleader, String LecturerName, String StartingDate, String CompletionDate){
        if(isRegistered== true){
            System.out.println("Lecturer Name "+LecturerName+ "has started at "+StartingDate +"and completed at" +CompletionDate);
        }
        else{
            super.setCourseLeader(Courseleader);
            setLecturerName (LecturerName);
            this.StartingDate = StartingDate;
            this.CompletionDate =CompletionDate;
            this.isRegistered = true;
        
        }
    }
    public void display(){  
        super.display();
        if(isRegistered==true){
            System.out.println("LecturerName "+this.LecturerName);
            System.out.println("Level : "+this.Level);
            System.out.println("Credit : "+this.Credit);
            System.out.println("StartingDate: "+this.StartingDate);
            System.out.println("CompletionDate: "+this.CompletionDate);
        }
    }

}

