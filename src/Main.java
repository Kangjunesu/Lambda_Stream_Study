import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        List<String> list1 = new ArrayList<>();
//        list1.add("Java");
//        list1.add("C");
//        list1.add("React");
//
//        for(String str : list1){
//            System.out.println(str);
//        }
//
//        System.out.println("for문없이 출력");
//        //(파라미터) -> { 실행문 }
//        //forEach : 리스트가 가지고있는 데이터를 순회
//        list1.stream().forEach((String str) ->{
//            System.out.println(str);
//        });
//
//        System.out.println();
//        System.out.println("한줄로 바꿔서 출력");
//        // 위를 아래처럼 한줄로  가능 { } 제거
//        list1.stream().forEach((String str) -> System.out.println(str));
//        // list가 String 타입이므로 추론이 가능. 파라미터의 타입이 예측 가능하면 생략 가능
//        list1.stream().forEach(str -> System.out.println(str));
//        // 이것도 가능
//        list1.stream().forEach(System.out::println); // 함수 reference 방식이라고 함

        ///////////////////////////////////////////////////

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Song", 45));
        customers.add(new Customer("Kim", 33));
        customers.add(new Customer("Park", 21));
        customers.add(new Customer("Lee", 67));
        customers.add(new Customer("Choi", 19));

        //1. 나이 30 이상
        //2. 나이 오름차순
        //3. 이름 순

        List<Customer> list = new ArrayList<>();
        for(Customer customer : customers){
            if(customer.getAge()>30){
                list.add(customer);
            }
        }  // 나이 30 초과 추출

        Collections.sort(list);  // 나이에 대한 오름차순 정렬

        List<String> results = new ArrayList<>();
        for(Customer customer : list){
            results.add(customer.getName());
        }  //나이 30이상, 나이로 오름차순돼있는 이름.

        for(String name : results){
            System.out.println(name);
        }
        //Kim
//      Song
//      Lee

        System.out.println("------스트림 api------");

        List<String> customersNames = customers.stream()
                                        .filter(customer -> customer.getAge() > 30) // 필터링
                                        .sorted()                                   //정렬
                                        .map(Customer::getName)                     //데이터 매핑
                                        .collect(Collectors.toList());              //데이터를 리스트화 후 반환

        for(String name : customersNames){
            System.out.println(name);
        }  // 위와 결과 동일






    }
}