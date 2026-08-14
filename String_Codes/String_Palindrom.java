class String_Palindrom{
    public static boolean checkPalidrom(String str){

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "Madam";
        if(checkPalidrom(str)){
            System.out.println("String Is Palindrom");
        }else{
            System.out.println("String is Not Palindrom ");
        }
    }
}