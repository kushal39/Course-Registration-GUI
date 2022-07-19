import javax.swing.*;//importing javax.swing
import java.awt.*;//importing java.awt
import java.util.*;//importing java.util
import java.awt.event.*;//importing java.awt.event

//creating class name INGCollege and implementing ActionListener
public class INGCollege implements ActionListener{
    
    
    
    //declearing frame as academiccourse
    JFrame academiccourse;
    JPanel panel1,panel2,panel3,panel4;//declaring panels with respective name panel1,panel2,panel3,panel4
    //declaring label to the panel
    JLabel academictitle,courseid,coursename,courseleader,lecturername,level,
            credit,startingdate,numberofassesment,duration,completiondate,
            nonacademictitle,noncourseid,noncoursename,noncourseleader,
            noninstructorname,nonprerequisite,nonexamdate,nonstartingdate,
            nonduration,noncompletiondate;
        // declaring textfield to the respective panel    
    JTextField tfcourseid,tfcoursename,tfcourseleader,tflecturername,tflevel,
            tfcredit,tfstartingdate,tfnumberofassesment,tfduration,tfcompletiondate,
            tfnoncourseid,tfnoncoursename,tfnoncourseleader,
            tfnoninstructorname,tfnonprerequisite,tfnonexamdate,tfnonstartingdate,
            tfnonduration,tfnoncompletiondate;
       // declaring button in the panel1 and panel3     
    JButton add,register,clear,display,nonadd,nonregister,nonclear,nonremove,
            nondisplay,shift1,shift2;
            
    ArrayList<Course> alist = new ArrayList<Course>();        
    private String adcourseid,adcoursename,adcourseleader,adlecturername,adlevel,adcredit,adstartingdate,adnumberofassesment,adduration,adcompletiondate;
    static AcademicCourse aobject;
    private int addduration;
    private int addnumberofassesment;
    private String adnoncourseid,adnoncoursename,adnoncourseleader,adnoninstructorname,adnonprerequisite,adnonexamdate,adnonstartingdate,adnonnumberofassesment,adnonduration,adnoncompletiondate;
    static NonAcademicCourse bobject;
    private int addnonduration;
    private int addnonnumberofassesment;
    static NonAcademicCourse nobj;
    
   
    
    
    INGCollege(){
        academiccourse= new JFrame();
        
        panel1= new JPanel();
        panel2= new JPanel();
        panel3= new JPanel();
        panel4= new JPanel();
        
        academictitle= new JLabel("ACADEMIC COURSE");
        courseid= new JLabel("Course ID");
        coursename= new JLabel("Course Name");
        courseleader= new JLabel("Course Leader");
        lecturername= new JLabel("Lecturer Name");
        level= new JLabel("Level");
        credit= new JLabel("Credit");
        startingdate= new JLabel("Starting Date");
        numberofassesment= new JLabel("Number Of Assesment");
        duration= new JLabel("Duration");
        completiondate= new JLabel("Completion Date");
        nonacademictitle= new JLabel("NON-ACADEMIC COURSE");
        noncourseid= new JLabel("Course ID");
        noncoursename= new JLabel("Course Name");
        noncourseleader= new JLabel("Course Leader");
        noninstructorname= new JLabel("Instructor Name");
        nonprerequisite= new JLabel("Prerequisite");
        nonexamdate= new JLabel("Exam Date");
        nonstartingdate= new JLabel("Starting Date");
        nonduration= new JLabel("Duration");
        noncompletiondate= new JLabel("Completion Date");
        
        
        tfcourseid= new JTextField();
        tfcoursename= new JTextField();
        tfcourseleader= new JTextField();
        tflecturername= new JTextField();
        tflevel= new JTextField();
        tfcredit= new JTextField();
        tfstartingdate= new JTextField();
        tfnumberofassesment= new JTextField();
        tfduration= new JTextField();
        tfcompletiondate= new JTextField();
        tfnoncourseid= new JTextField();
        tfnoncoursename= new JTextField();
        tfnoncourseleader= new JTextField();
        tfnoninstructorname= new JTextField();
        tfnonprerequisite= new JTextField();
        tfnonexamdate= new JTextField();
        tfnonstartingdate= new JTextField();
        tfnonduration= new JTextField();
        tfnoncompletiondate= new JTextField();
        
        
        add= new JButton("Add");
        register= new JButton("Register");
        clear= new JButton("Clear");
        display= new JButton("Display");
        shift1= new JButton("Non-academic");
        nonadd= new JButton("Add");
        nonregister= new JButton("Register");
        nonclear= new JButton("Clear");
        nonremove= new JButton("Remove");
        nondisplay= new JButton("Display");
        shift2= new JButton("academic");
        

        academictitle.setBounds(58,105,262,41);
        courseid.setBounds(22,181,69,24);
        coursename.setBounds(210,181,92,24);
        courseleader.setBounds(21,274,99,24);
        lecturername.setBounds(209,274,93,24);
        level.setBounds(21,363,34,24);
        credit.setBounds(209,363,38,24);
        startingdate.setBounds(20,456,82,24);
        numberofassesment.setBounds(209,456,145,24);
        duration.setBounds(20,547,53,24);
        completiondate.setBounds(212,547,105,24);
        nonacademictitle.setBounds(21,105,339,41);
        noncourseid.setBounds(22,181,69,24);
        noncoursename.setBounds(210,181,92,24);
        noncourseleader.setBounds(21,274,99,24);
        noninstructorname.setBounds(209,274,106,24);
        nonprerequisite.setBounds(21,363,75,24);
        nonexamdate.setBounds(209,363,70,24);
        nonstartingdate.setBounds(20,456,82,24);
        nonduration.setBounds(209,456,53,24);
        noncompletiondate.setBounds(20,547,105,24);
        tfcourseid.setBounds(21,211,149,37);
        tfcoursename.setBounds(209,211,149,37);
        tfcourseleader.setBounds(20,302,149,37);
        tflecturername.setBounds(208,302,149,37);
        tflevel.setBounds(20,393,149,37);
        tfcredit.setBounds(208,393,149,37);
        tfstartingdate.setBounds(19,484,149,37);
        tfnumberofassesment.setBounds(207,484,149,37);
        tfduration.setBounds(19,575,149,37);
        tfcompletiondate.setBounds(211,575,149,37);
        tfnoncourseid.setBounds(21,211,149,37);
        tfnoncoursename.setBounds(209,207,149,37);
        tfnoncourseleader.setBounds(20,302,149,37);
        tfnoninstructorname.setBounds(208,298,149,37);
        tfnonprerequisite.setBounds(20,393,149,37);
        tfnonexamdate.setBounds(208,389,149,37);
        tfnonstartingdate.setBounds(19,484,149,37);
        tfnonduration.setBounds(207,480,149,37);
        tfnoncompletiondate.setBounds(19,575,149,37);
        add.setBounds(24,300,130,40);
        register.setBounds(24,391,130,40);
        clear.setBounds(25,482,130,40);
        display.setBounds(27,573,130,40);
        shift1.setBounds(3,51,172,53);
        nonadd.setBounds(24,209,130,40);
        nonregister.setBounds(24,300,130,40);
        nonclear.setBounds(25,391,130,40);
        nonremove.setBounds(25,484,130,40);
        nondisplay.setBounds(25,573,130,40);
        shift2.setBounds(3,51,172,53);
        
        panel1.add(add);
        panel1.add(register);
        panel1.add(clear);
        panel1.add(display);
        panel1.add(shift1);
        
        panel2.add(academictitle);
        panel2.add(courseid);
        panel2.add(coursename);
        panel2.add(courseleader);
        panel2.add(lecturername);
        panel2.add(level);
        panel2.add(credit);
        panel2.add(startingdate);
        panel2.add(numberofassesment);
        panel2.add(duration);
        panel2.add(completiondate);
        panel2.add(tfcourseid);
        panel2.add(tfcoursename);
        panel2.add(tfcourseleader);
        panel2.add(tflecturername);
        panel2.add(tflevel);
        panel2.add(tfcredit);
        panel2.add(tfstartingdate);
        panel2.add(tfnumberofassesment);
        panel2.add(tfduration);
        panel2.add(tfcompletiondate);
        
        panel3.add(nonadd);
        panel3.add(nonregister);
        panel3.add(nonclear);
        panel3.add(nonremove);
        panel3.add(nondisplay);
        panel3.add(shift2);
        
        panel4.add(nonacademictitle);
        panel4.add(noncourseid);
        panel4.add(noncoursename);
        panel4.add(noncourseleader);
        panel4.add(noninstructorname);
        panel4.add(nonprerequisite);
        panel4.add(nonexamdate);
        panel4.add(nonstartingdate);
        panel4.add(nonduration);
        panel4.add(noncompletiondate);
        panel4.add(tfnoncourseid);
        panel4.add(tfnoncoursename);
        panel4.add(tfnoncourseleader);
        panel4.add(tfnoninstructorname);
        panel4.add(tfnonprerequisite);
        panel4.add(tfnonexamdate);
        panel4.add(tfnonstartingdate);
        panel4.add(tfnonduration);
        panel4.add(tfnoncompletiondate);
        
        academictitle.setFont(new Font("Arial", Font.BOLD, 26));
        courseid.setFont(new Font("Arial", Font.PLAIN, 14));
        coursename.setFont(new Font("Arial", Font.PLAIN, 14));
        courseleader.setFont(new Font("Arial", Font.PLAIN, 14));
        lecturername.setFont(new Font("Arial", Font.PLAIN, 14));
        level.setFont(new Font("Arial", Font.PLAIN, 14));
        credit.setFont(new Font("Arial", Font.PLAIN, 14));
        startingdate.setFont(new Font("Arial", Font.PLAIN, 14));
        numberofassesment.setFont(new Font("Arial", Font.PLAIN, 14));
        duration.setFont(new Font("Arial", Font.PLAIN, 14));
        completiondate.setFont(new Font("Arial", Font.PLAIN, 14));
        nonacademictitle.setFont(new Font("Arial", Font.BOLD, 26));
        noncourseid.setFont(new Font("Arial", Font.PLAIN, 14));
        noncoursename.setFont(new Font("Arial", Font.PLAIN, 14));
        noncourseleader.setFont(new Font("Arial", Font.PLAIN, 14));
        noninstructorname.setFont(new Font("Arial", Font.PLAIN, 14));
        nonprerequisite.setFont(new Font("Arial", Font.PLAIN, 14));
        nonexamdate.setFont(new Font("Arial", Font.PLAIN, 14));
        nonstartingdate.setFont(new Font("Arial", Font.PLAIN, 14));
        nonduration.setFont(new Font("Arial", Font.PLAIN, 14));
        noncompletiondate.setFont(new Font("Arial", Font.PLAIN, 14));
        
        Color panelcolor= new Color(47, 132, 180);
        
        
        
        
        
        panel2.setBackground(panelcolor);
        panel4.setBackground(panelcolor);
        shift1.setBackground(panelcolor);
        shift2.setBackground(panelcolor);
        shift1.setOpaque(true);
        shift2.setOpaque(true);
        shift1.setBorderPainted(false);
        shift2.setBorderPainted(false);
        shift1.setForeground(Color.white);
        shift2.setForeground(Color.white);
        
        academictitle.setForeground(Color.white);
        courseid.setForeground(Color.white);
        coursename.setForeground(Color.white);
        courseleader.setForeground(Color.white);
        lecturername.setForeground(Color.white);
        level.setForeground(Color.white);
        credit.setForeground(Color.white);
        startingdate.setForeground(Color.white);
        numberofassesment.setForeground(Color.white);
        duration.setForeground(Color.white);
        completiondate.setForeground(Color.white);
        nonacademictitle.setForeground(Color.white);
        noncourseid.setForeground(Color.white);
        noncoursename.setForeground(Color.white);
        noncourseleader.setForeground(Color.white);
        noninstructorname.setForeground(Color.white);
        nonprerequisite.setForeground(Color.white);
        nonexamdate.setForeground(Color.white);
        nonstartingdate.setForeground(Color.white);
        nonduration.setForeground(Color.white);
        noncompletiondate.setForeground(Color.white);
        
        
        
        panel1.setVisible(true);
        panel1.setSize(178,731);
        panel1.setLocation(0,0);
        panel1.setLayout(null);
        
        
        panel2.setVisible(true);
        panel2.setSize(395,731);
        panel2.setLocation(178,0);
        panel2.setLayout(null);
        
        panel3.setVisible(false);
        panel3.setSize(178,731);
        panel3.setLocation(0,0);
        panel3.setLayout(null);
        
        panel4.setVisible(false);
        panel4.setSize(395,731);
        panel4.setLocation(177,0);
        panel4.setLayout(null);
        
        
        shift1.addActionListener(this);
        shift2.addActionListener(this);
        clear.addActionListener(this);
        nonclear.addActionListener(this);
        add.addActionListener(this);
        nonadd.addActionListener(this);
        register.addActionListener(this);
        nonregister.addActionListener(this);
        nonremove.addActionListener(this);
        display.addActionListener(this);
        nondisplay.addActionListener(this);
        
        
        academiccourse.add(panel1);
        academiccourse.add(panel2);
        academiccourse.add(panel3);
        academiccourse.add(panel4);
                
        
        academiccourse.setLayout(null);
        academiccourse.setSize(575,731);
        
        academiccourse.setVisible(true);

        
    
        
                
        academiccourse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==shift1)
        {
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(true);
            panel4.setVisible(true);
        }
        else if (e.getSource()==shift2)
        {
            panel1.setVisible(true);
            panel2.setVisible(true);
            panel3.setVisible(false);
            panel4.setVisible(false);
        }
        else if (e.getSource()==clear)
        {
            tfcourseid.setText("");
            tfcoursename.setText("");
            tfcourseleader.setText("");
            tflecturername.setText("");
            tflevel.setText("");
            tfcredit.setText("");
            tfstartingdate.setText("");
            tfnumberofassesment.setText("");
            tfduration.setText("");
            tfcompletiondate.setText("");
        
        }
        else if (e.getSource()==nonclear)
        {
           tfnoncourseid.setText("");
           tfnoncoursename.setText("");
           tfnoncourseleader.setText("");
            tfnoninstructorname.setText("");
            tfnonprerequisite.setText("");
            tfnonexamdate.setText("");
            tfnonstartingdate.setText("");
            tfnonduration.setText("");
            tfnoncompletiondate .setText("");
        
        }
        else if (e.getSource()==add)
        {
            try
            {
                 adcourseid=tfcourseid.getText();
                 adcoursename=tfcoursename.getText();
                 adcourseleader=tfcourseleader.getText();
                 adlecturername=tflecturername.getText();
                 adlevel=tflevel.getText();
                 adcredit=tfcredit.getText();
                 adstartingdate=tfstartingdate.getText();
                 adnumberofassesment=tfnumberofassesment.getText();
                 addnumberofassesment=Integer.parseInt(adnumberofassesment);
                 adduration=tfduration.getText();
                 addduration=Integer.parseInt(adduration);
                 adcompletiondate=tfcompletiondate.getText();
             
             
                boolean isadded =false;
                for(Course aobject:alist)
                {
                    if (aobject.getCourseId().equals(adcourseid))
                    {
                        isadded=true;
                        break;
                    }
                }
                if(isadded==false)
                {
                     aobject = new AcademicCourse(adcourseid,adcoursename,addduration,adlevel,adcredit,addnumberofassesment);
                     alist.add(aobject);
                     
                     JOptionPane obj1 = new JOptionPane();
                     obj1.showMessageDialog(panel2 , "Course is added to academic course");
                }
                else if(isadded==true)
                {
                    JOptionPane obj2 = new JOptionPane();
                    obj2.showMessageDialog(panel2 , " Course is already added");
                 }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane obj3 = new JOptionPane();
                obj3.showMessageDialog(panel2 , "please enter valid duration and no.of assesment");
    
            }
        }
        else if (e.getSource()==nonadd)
        {
            try
            {
                 adnoncourseid=tfnoncourseid.getText();
                 adnoncoursename=tfnoncoursename.getText();
                 adnoncourseleader=tfnoncourseleader.getText();
                 adnoninstructorname=tfnoninstructorname.getText();
                 adnonprerequisite=tfnonprerequisite.getText();
                 adnonprerequisite=tfnonprerequisite.getText();
                 adnonstartingdate=tfnonstartingdate.getText();
                 adnonexamdate=tfnonexamdate.getText();
                 
                 adnonduration=tfnonduration.getText();
                 addnonduration=Integer.parseInt(adnonduration);
                 adnoncompletiondate=tfnoncompletiondate.getText();
             
             
                boolean isadded =false;
                for(Course bobject:alist)
                {
                    if (bobject.getCourseId().equals(adcourseid))
                    {
                        isadded=true;
                        break;
                    }
                }
                if(isadded==false)
                {
                     bobject = new NonAcademicCourse(adnoncourseid,adnoncoursename,addnonduration,adnonprerequisite);
                     alist.add(bobject);
                     
                     JOptionPane obj1 = new JOptionPane();
                     obj1.showMessageDialog(panel2 , "Course is added to non-academic course");
                }
                else if(isadded==true)
                {
                    JOptionPane obj2 = new JOptionPane();
                    obj2.showMessageDialog(panel2 , " Course is already added");
                 }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane obj3 = new JOptionPane();
                obj3.showMessageDialog(panel2 , "please enter valid duration and no.of assesment");
    
            }
        }
        else if (e.getSource()==register)
        {
            try
            {
                adcourseid=tfcourseid.getText();
                adcoursename=tfcoursename.getText();
                adcourseleader=tfcourseleader.getText();
                adlecturername=tflecturername.getText();
                adlevel=tflevel.getText();
                adcredit=tfcredit.getText();
                adstartingdate=tfstartingdate.getText();
                adnumberofassesment=tfnumberofassesment.getText();
                addnumberofassesment=Integer.parseInt(adnumberofassesment);
                adduration=tfduration.getText();
                addduration=Integer.parseInt(adduration);
                adcompletiondate=tfcompletiondate.getText();
             
                boolean isreg=false;
                 for(Course aobject:alist)
                {
                    if(aobject.getCourseId().equals(adcourseid))
                    {
                        AcademicCourse obj1 = (AcademicCourse)aobject;
                        obj1.getIsRegistered();
                        if(obj1.getIsRegistered()==true)
                        {
                          JOptionPane obj3 = new JOptionPane();
                          obj3.showMessageDialog(panel2 , "Please Add the Course first"); 
                          isreg=true;
                        }
                        else if(obj1.getIsRegistered()==false)
                        {
                            obj1.registered(adcourseleader,adlecturername,adstartingdate,adcompletiondate);
                            JOptionPane obj = new JOptionPane();
                            obj.showMessageDialog(panel2 , "Course is already Registered");
                            isreg = true;
                            break;
                        }
                    }
                }
                if (isreg == false)
                {
                    JOptionPane.showMessageDialog(panel2 , "Course is Registered");
                }
            }
            catch(NumberFormatException n)
            {
                 JOptionPane.showMessageDialog(panel2 , "Enter Valid Value"); 
            }
        }
        else if (e.getSource()==nonregister)
        {
            try
            {
                 adnoncourseid=tfnoncourseid.getText();
                 adnoncoursename=tfnoncoursename.getText();
                 adnoncourseleader=tfnoncourseleader.getText();
                 adnoninstructorname=tfnoninstructorname.getText();
                 adnonprerequisite=tfnonprerequisite.getText();
                 adnonprerequisite=tfnonprerequisite.getText();
                 adnonstartingdate=tfnonstartingdate.getText();
                 adnonexamdate=tfnonexamdate.getText();
                 
                 
                 boolean isreg=false;
                 for(Course aobject:alist)
                {
                    if(aobject.getCourseId().equals(adcourseid))
                    {
                        NonAcademicCourse obj1 = (NonAcademicCourse)aobject;
                        obj1.getIsRegistered();
                        if(obj1.getIsRegistered()==true)
                        {
                          JOptionPane obj3 = new JOptionPane();
                          obj3.showMessageDialog(panel4 , "Please add the course first"); 
                          isreg=true;
                        }
                        else if(obj1.getIsRegistered()==false)
                        {
                            obj1.register(adnoncourseleader,adnoninstructorname,adnonstartingdate,adnoncompletiondate,adnonexamdate);
                            JOptionPane obj = new JOptionPane();
                            obj.showMessageDialog(panel4 , "Course is already registered");
                            isreg = true;
                            break;
                        }
                    }
                }
                if (isreg == false)
                {
                    JOptionPane.showMessageDialog(panel4 , "Course is already Registered");
                }
          }
          catch(NumberFormatException n)
          {
              JOptionPane.showMessageDialog(panel4 , "Enter Valid Value"); 
          }
        }
        else if (e.getSource()==nonremove)
        {
          try
          {
              adnoncourseid= tfnoncourseid.getText();
              
              boolean isremove=false;
              for(Course bobject:alist)
              {
                  if(bobject.getCourseId().equals(adnoncourseid))
                  {
                      nobj = (NonAcademicCourse)bobject;
                      nobj.getIsRemoved();
                      if(nobj.getIsRemoved()==true)
                      {
                          JOptionPane.showMessageDialog(panel4 , "The Course is already removed");
                          isremove=true;
                      }
                      else
                      {
                          nobj.remove();
                          JOptionPane.showMessageDialog(panel4 , "The Course is removed sucessfully");
                          isremove=true;
                      }
                  }
              }
              if(isremove==false)
              {
                  JOptionPane.showMessageDialog(panel4 , "Please register the Course first");
              }
          }
          catch(Exception na)
          {
              JOptionPane.showMessageDialog(panel4 , "Please enter valid course to register");
          }
        }
        else if (e.getSource()==display)
        {
            for(Course aobject:alist)
            {
                AcademicCourse ad = (AcademicCourse)aobject;
                ad.display();
            }
        }
        else if (e.getSource()==nondisplay)
        {
            for(Course aobject:alist)
            {
                NonAcademicCourse nad = (NonAcademicCourse)aobject;
                nad.display();
            }
        }
    }
    
      public static void main(String args[]){
        new INGCollege();
    }
           
    }
