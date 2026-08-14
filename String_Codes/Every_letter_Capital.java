public class Every_letter_Capital {
    public static String convertFirstLetterCapital(String str){
        StringBuilder sb = new StringBuilder();

        sb.append(Character.toUpperCase(str.charAt(0)));
        boolean capital = false;
        for(int i=1 ; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                capital = true;
            }else if(capital){
                sb.append(Character.toUpperCase(str.charAt(i)));
                capital = false;
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(convertFirstLetterCapital("hi, i am dnyaneshwar"));
    }
}
