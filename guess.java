

public class guess {

        public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i =1;i<str.length();i++){
            if(str.charAt(i) ==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // String name = "Namaste Bharat";
        // String name2 = "    Hello   ";
        // String name3 = "White";
        // String name4 = new String("QWERTY");

        // System.out.println(name.length());
        // System.out.println(name.concat(name2));
        // System.out.println(name.charAt(5));

        // System.out.println(name.equals(name4));
        // System.out.println(name == name4);

        // System.out.println(name.substring(2, 7));
        // System.out.println(name2.trim());
        // System.out.println(name.lastIndexOf(name));
        // System.out.println(name.compareTo(name3));
        // System.out.println(name3.compareTo(name));

        // System.out.println(name.replace('a', 'r'));
        // System.out.println(name2.replace('H', 'M').trim().concat("w"));
        // System.out.println(name.toUpperCase());
        // System.out.println(name4.toLowerCase());
        // System.out.println(name2);

        //  String fruits[] = {"apple","mango","banana"};
        // String largest = fruits[0];
        // for (int i = 0; i < fruits.length; i++) {
        //     if(largest.compareTo(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        String sh = "Hello i am sourav";
        System.out.println(toUpperCase(sh));
    }
}