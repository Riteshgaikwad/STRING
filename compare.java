public class compare {
    public static void main(String[] args){
        String str1="Tony";
        String str2="Tony"; // checks on object level 
        String str3=new String("Tony"); // use (.equals) to combare two strings

        if(str1==str2){
            System.out.println("Strings are equla");
        }
        else{
            System.out.println("String ae not equal");
        }
        if(str1==str3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("String are not equal");
        }
        if(str1.equals(str3)){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
    }
    
}
