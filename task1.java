public class task1 {
    public static void main(String[] args) {
        String str = "Good Morning";
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(" ");
            }
        }

        System.out.println("Answer : " + sb.toString());
    }
}
