import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("React");

        for(String str : list){
            System.out.println(str);
        }

        System.out.println("for문없이 출력");
        //(파라미터) -> { 실행문 }
        //forEach : 리스트가 가지고있는 데이터를 순회
        list.stream().forEach((String str) ->{
            System.out.println(str);
        });

        System.out.println();
        System.out.println("한줄로 바꿔서 출력");
        // 위를 아래처럼 한줄로  가능 { } 제거
        list.stream().forEach((String str) -> System.out.println(str));
        // list가 String 타입이므로 추론이 가능. 파라미터의 타입이 예측 가능하면 생략 가능
        list.stream().forEach(str -> System.out.println(str));
        // 이것도 가능
        list.stream().forEach(System.out::println); // 함수 reference 방식이라고 함





    }
}