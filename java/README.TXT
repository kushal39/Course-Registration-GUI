// Here the Super Class is Course //
  public class Course{
  private String CourseID;
  private String Coursename;
  private String Courseleader;
  private int Duration;
     /* Constructing a Course Constructor */
     public Course(String CourseID, String Coursename, int Duration){
      this.CourseID=CourseID;//This keyword distinguishes instance variables from local variables when used after a dot(.). 
      this.Coursename=Coursename;
      this.Courseleader="";
      this.Duration=Duration;
       
     }
     /* Using Encapsulation*/
     //returns course_ID
     public String getCourseId(){
        return CourseID;
        }
     //returns course_name
     public String getCourseName(){
        return Coursename;
        }
     //returns course_leader
     public String getCourseLeader(){
        return Courseleader;
        }
     //returns duration  
     public int getDuration(){
        return Duration;
        }
     //sets the course leader value 
     public void setCourseLeader(String Courseleader){
         this.Courseleader=Courseleader;
        }
     public void display(){
        System.out.println("Your Course ID is:" +CourseID);
        System.out.println("Your Course Name is:" +Coursename);
         if(Courseleader != ""){
        System.out.println("Your Course leader is:" +Courseleader);
       }
        System.out.println("Your duration is:" +Duration);
     }//ends the display method
}//ends the class Course