import javafx.beans.binding.When;

import java.util.*;

class EX11_16 {
    public static void main(String [] args){
        HashMap map = new HashMap();
        map.put("hbn1218","1234");
        map.put("cbn1218","1111");
        map.put("cbn1218","1234"); //이미존재하는 키 추가가능. 기존값은 없어짐

        Scanner s =new Scanner(System.in);

        while (true){
            System.out.println("id와 password를 입력해주세요.");
            System.out.println("ID:");
            String ID = s.nextLine().trim();

            System.out.println("password:");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(ID)){
                System.out.println("비밀번호가 일치하지 않습니다.다시 입력해주세요.");
                continue;
            }
            if(!(map.get(ID)).equals(password)){
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }else {
                System.out.println("일치합니다.");
                break;
            }
        }
}
}
