package SEPT.EX30092024;

import com.sun.tools.attach.AgentInitializationException;

public class Function_me {
    public static void main(String[] args) {
        //in function we have to declare the varaible name in main brackets
        // 4 types
        //1.without parameter and without return type
        // no returm type we have to use the void class
        function_name_1();
//2.Without Parameters but With Return Type
        // have to declare the data type and call it in the main method
        // we have to declare the function name in to the variable name
        int age=function_type_2();
        System.out.println(age);
        //3.With Parameters and Without Return Type"
        // in this function we have to declare the with in the function bracket
        // always mention the string in double course;
        function_type_3(65,"hari","googlr.com",21 );


    }
    public static void function_name_1() {
        System.out.println("1.Without Parameters and Without Return Type");
    }
        public static int function_type_2(){
            System.out.println("2.Without Parameters but With Return Type");
            return 65;
        }
public static void function_type_3( int Age,String name,String Email,int DOB){
    System.out.println("3.With Parameters and Without Return Type");
    System.out.println("your input:"+ Email);
}
}
