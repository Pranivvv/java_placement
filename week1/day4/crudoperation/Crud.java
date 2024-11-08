import java.util.*;
class Student{
    Scanner sc = new Scanner(System.in); 
    int arRollno[] = new int[10];
    String arName[] = new String[10];
    String arCity[] = new String[10];
    String arMblno[] = new String[10];
    int curRec=0;
    int lastRec=0;
    
    public String inputData(String name, String city, String mblno){
        arRollno[lastRec] = lastRec+1;
        arName[lastRec] = name;
        arCity[lastRec] = city;
        arMblno[lastRec] = mblno;
        lastRec++;
        return "Record added";
    }

    public void showData(int rno){
        for(int i=0; i<lastRec; i++){
            if(arRollno[i]==rno){
                System.out.println("1. Roll number : "+ rno);
                System.out.println("2. Name : " + arName[i]);
                System.out.println("3. City : " + arCity[i]);
                System.out.println("3. Mobile Number : " + arMblno[i]);
            }
            else{
                System.out.println("Entered roll number not found");
            }
        }
    }

    public void showAllData(){
        for(int i=0; i<lastRec; i++){
            System.out.println("1. Roll number : "+ arRollno[i]);
            System.out.println("2. Name : " + arName[i]);
            System.out.println("3. City : " + arCity[i]);
            System.out.println("4. Mobile Number : " + arMblno[i]);
            System.out.println("--------------------------------------");
        }
    }

    public String updateData(int rno){
        int i=0;
        for(i=0; i<lastRec; i++){
            if(arRollno[i]==rno){
                System.out.println("1. Name : " + arName[i]);
                System.out.println("2. City : " + arCity[i]);
                System.out.println("3. Mobile Number : " + arMblno[i]);
                System.out.println("--------------------------------------");
                break;
            }
            else{
                System.out.println("Entered roll number not found");
            }
        }
        System.out.println("Enter option to update : ");
        int op = sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Enter new your name");
                String name = sc.next();
                arName[i] = name;
                break;
            case 2:
                System.out.println("Enter your city");
                String city = sc.next();
                arCity[i] = city;
                break;
            case 3:   
                System.out.println("Enter your mobile number"); 
                String mblno = sc.next();
                arMblno[i] = mblno;
                break;
            default :
                System.out.println("invalid input");
        }
        return "Data updated";
    }
}

class Crud{
    public static void main(String args[]){
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("--------------------------------------");
            System.out.println("1. Input New Student Data");
            System.out.println("2. Show Srudent Information");
            System.out.println("3. Show Srudent Information");
            System.out.println("4. Delete Student Information");
            System.out.println("5. Update Student Informatiom");
            System.out.println("6. Exit");
            System.out.println("--------------------------------------");
            System.out.println("Enter any choice : ");

            int op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Enter your name");
                    String name = sc.next();
                    System.out.println("Enter your city");
                    String city = sc.next();
                    System.out.println("Enter your mobile number");
                    String mblno = sc.next();
                    String res = s.inputData(name,city,mblno);
                    System.out.println(res);
                    break;
                
                case 2:
                    System.out.println("Enter your roll number");
                    int rno = sc.nextInt();
                    s.showData(rno);
                    break;

                case 3:
                    s.showAllData();
                    break;

                case 4:
                    System.out.println("Enter your roll number");
                    rno = sc.nextInt();
                    res = s.updateData(rno); 

                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid option");
                    break;

            }
        }
    }
}