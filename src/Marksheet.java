public class Marksheet {
    int Rollnumber;
    static int total;
    static double percentage;

    public static void marksheet(int Rollnumber,String name,int eng,int maths,int sci) {
        total = (eng + maths + sci);
        percentage = (total / 3);
        System.out.println(name + "Rollnumber=" + Rollnumber + "Total marks =" + total + " =" + " percentage = " + percentage + "%");
        if (percentage >= 35) {
            System.out.println("sejal is pass" + "with"  + percentage + "%");
        } else {
            System.out.println("sejal is fail" + "with" + percentage + "%");
        }
    }


        public static void main(String[] args){
        marksheet(2,"sejal", 60, 50,55);

    }
    }


