import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String input;
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        input = sc.nextLine();
        while (checkInput(input) == false){
            System.out.println("Chuỗi nhập chưa chính xác. Vui lòng nhập lại: ");
            input = sc.nextLine();
        }
        countWord(input,arrayTelex());
    }

    public static boolean checkInput(String str){
        boolean check = true;
        Pattern str_pattern= Pattern.compile("\\w+");
        Matcher str_matcher = str_pattern.matcher(str);
        if(!str_matcher.matches()){
            check = false;
        }
        return check;
    }
    public static Set<String> arrayTelex(){
        Set<String> list=  new HashSet<>();
        list.add("w");
        list.add("wf");
        list.add("ws");
        list.add("wr");
        list.add("wx");
        list.add("wj");

        list.add("W");
        list.add("WF");
        list.add("WS");
        list.add("WR");
        list.add("WX");
        list.add("WJ");

        list.add("ee");
        list.add("ef");
        list.add("es");
        list.add("er");
        list.add("ex");
        list.add("ej");

        list.add("EE");
        list.add("EF");
        list.add("ES");
        list.add("ER");
        list.add("EX");
        list.add("EJ");

        list.add("oo");
        list.add("of");
        list.add("os");
        list.add("or");
        list.add("ox");
        list.add("oj");
        list.add("ow");

        list.add("OO");
        list.add("OW");
        list.add("OF");
        list.add("OS");
        list.add("OR");
        list.add("OX");
        list.add("OJ");


        list.add("aw");
        list.add("aa");
        list.add("af");
        list.add("as");
        list.add("ar");
        list.add("ax");
        list.add("aj");

        list.add("AW");
        list.add("AA");
        list.add("AF");
        list.add("AS");
        list.add("AR");
        list.add("AX");
        list.add("AJ");

        list.add("if");
        list.add("is");
        list.add("ir");
        list.add("ix");
        list.add("ij");

        list.add("IF");
        list.add("IS");
        list.add("IR");
        list.add("IX");
        list.add("IJ");

        list.add("dd");
        list.add("DD");
        return list;
    }

    public static void countWord(String input, Set<String> list){
        int dem=0;
        List<String> ds = new ArrayList<>();
        //convert String to Array:
            String[] arr= input.split("");
        //loop each element of Array:
            for (int i=0;i<arr.length;i++){
                for (String subList: list) {
                    //check two serial character
                        if ((i+1)<= arr.length-1 && arr[i].concat(arr[i+1]).equals(subList)) {
                            dem++;
                            ds.add(arr[i].concat(arr[i+1]));
                            i=i+1;
                            break;
                      //check one single character
                        } else {
                            if (i<=arr.length-1 && arr[i].equals(subList)) {
                                dem++;
                                ds.add(arr[i]);
                            }
                        }
                }
            }
        System.out.println("Số ký tự Tiếng Việt="+ dem +ds);
    }

}