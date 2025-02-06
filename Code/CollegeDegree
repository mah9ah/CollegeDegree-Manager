public class CollegeDegree {
    private String major;
    private int numberOfCourses;
    private String[] courseNameArray;
    private int[] courseCreditArray;
    private static int maximumNumberOfCourses = 40;

    public CollegeDegree() {
        major = "";
        numberOfCourses = 0;
        courseNameArray = new String[maximumNumberOfCourses];
        courseCreditArray = new int[maximumNumberOfCourses];
    }
    public void setMajor( String newMajor){
        major = newMajor;
    }
    public String getMajor(){
        return major;
    }

    public void addCourse( String courseName , int numberOfCredits) {
        if (numberOfCredits >= 1 && numberOfCredits <= 5 && numberOfCourses < courseNameArray.length) {
            courseNameArray[numberOfCourses] = courseName;
            courseCreditArray[numberOfCourses] = numberOfCredits;
            numberOfCourses++;
        }
    }

    public String getCourses(){
        String courses = "";
        for (int index = 0; index< numberOfCourses; index++) {
            courses +=  courseNameArray[index] + "\n";
        }
        return courses;
    }

    public int getNumberOfCourses(){
        return numberOfCourses;
    }

    public int getTotalNumberOfCredits(){
        int totalCredits = 0;
        for ( int index = 0 ; index < numberOfCourses; index++) {
            totalCredits = totalCredits + courseCreditArray[index];
        }
        return totalCredits;
    }

    public static void increaseMaximumNumberOfCourses( int newMaximumNumberOfCourses){
        if ( newMaximumNumberOfCourses > maximumNumberOfCourses){
            maximumNumberOfCourses = newMaximumNumberOfCourses;
        }
    }

    public static int getMaximumNumberOfCourses(){
        return maximumNumberOfCourses;
    }





    }










    

