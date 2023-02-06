package java_outline.중요개념학습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// java의 collection 프레임워크에 대한 기초 학습
public class java02_javaCollections {
    public static void main(String args[]) {

        ArrayList<Integer> arr = new ArrayList<Integer>(); // 중복 허용 및 index를 통한 순서 존재
        arr.add(1); // index 0  = 1
        arr.remove(0); // index 0 값 제거
        arr.indexOf(0); // index 0의 값
        arr.get(0); // index 0의 값 가져오기
        arr.size(); // arr ArrayList의 길이 출력

        HashSet<Integer> set = new HashSet<Integer>(); // 중복 제거 및 순서 존재 x
        set.add(1); // 값 추가
        set.size(); // set의 값의 개수 출력


        Map<String, String> map = new HashMap<String, String>(); // 순서는 상관이 없다 (key가 중요)
        map.put("10","1"); // key 와 value 할당
        map.put("11","2");
        map.remove("10"); // 해당 key의 제거 및 value 제거
        map.replace("11","3"); // "조용찬"의 key에 해당하는 value 변경

        System.out.print(map.get("10")); // key에 대한 value 값 받기
        System.out.print(map.containsKey("11")); // true or false 로 출력 (key가 있나?)
        // key, value - key는 중복되어지면 안됨

    }

}
