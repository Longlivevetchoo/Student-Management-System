public class Student {
    private int id ;
    private String name;
    private int numGrades;
    private int maxnumGrades;
    private double[] list_grades;

    //empty constractor
    public Student(){};


    public Student(int id , String name , int maxnumGrades){
        this.id=id;
        this.name=name;
        this.maxnumGrades = maxnumGrades;
        numGrades = 0 ;
        this.list_grades = new double[maxnumGrades];
    }

    public void ShowStudentinfo(){
        System.out.println("ID: " + this.id + "   Name: " + this.name);
    }

    public void addGrade(double grade) {
        if (numGrades >= maxnumGrades) {
            System.out.println("Cannot add more grades – array is full!");
            return;
        }
        list_grades[numGrades] = grade;
        numGrades++;
    }




    public void printGrades() {
        System.out.print("Grades: ");
        for (int i = 0; i < numGrades; i++) {
            System.out.print(list_grades[i] + " ");
        }
        System.out.println();
    }



    public double getAverage(){
        if(numGrades == 0 ) return 0.0;

        double sum = 0.0 ;

        for(int i = 0 ; i <numGrades ; i++){
            sum += list_grades[i];
        }

        return sum / numGrades;
    }

    public int getId(){
        return id;
    }


   
             
        
    }
        



    

