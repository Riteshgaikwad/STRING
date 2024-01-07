import java.util.Scanner;
class create{

    public static void print_ltrs(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");
        //Strings are IMMUTABLE
        //IMMUTABLE means IF YOU WANT  TO CHANGE IN STRING ALWAYS NEW STRING IS CREATED DO NOT CHANGE IN PREVIOUS STRING 

        Scanner sc=new Scanner(System.in);
        String name;
        String full_name;
        // name=sc.next(); only single word printed
        // System.out.println(name);
        full_name=sc.nextLine(); //print full name
        System.out.println(full_name);

        //functions in string
        // 1)Length
        String full="Tony Stark";
        System.out.println(full.length());

        //2)concatination
        String f_name="Ritesh";
        String l_name="Gaikwad";
        String full_n=f_name+" "+l_name;
        System.out.println(full_n+ " is full name");

        //3)find charachter at specific position (.charAt())
        System.out.println(f_name.charAt(0));
        print_ltrs(f_name);
        sc.close();
    }
}