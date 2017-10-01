package myHashMap;

public class Main {

  public static void main(String[] args) {
//               HashMap<String , Integer> a = new HashMap<>();
//        a.put("kl", 5);
//        a.put("kl", 7);
//        System.out.println("dd");
//        System.out.println(a.get("kl"));

    MyHashMap<String, Integer> myMap = new MyHashMap<>();

    //  System.out.println(key.hashCode());
    // myMap.put(key, 88);
    //System.out.println(myMap.get(key));

    myMap.put("trzy", 4);
    System.out.println(myMap.get("trzy"));
    myMap.put("klucz", 48);
    //  System.out.println(myMap.get("klucz"));
    myMap.put("klucz", 55);
    System.out.println(myMap.size());
    myMap.put("klucz", 55);
    //myMap.put("klucz", 55);

    myMap.put("glscl", 6);
    myMap.put("Bogdan", 8);
    myMap.put("klucz", 288);
    System.out.println(myMap.get("trzy"));
    System.out.println(myMap.get("klucz"));
    //  System.out.println(myMap.get("trzy"));
//        System.out.println(myMap.get("glscl"));
//        //System.out.println(myMap.get("pusty"));
//        System.out.println(myMap.isEmpty());
//        System.out.println(myMap.size());
//
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i <= 11; i++) {
//            list.add(i, null);
//        }
//        list.add(12, "sss");
//        System.out.println(list.get(12));
//        System.out.println(list.size());

//        List<String> listInside = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//        List<List<String>> list = new ArrayList<>();
//
//        listInside.add("jeden");
//        //listInside.add("dwa");
//        list2.add("proba");
//        list2.add("prob2");
//        list2.add("prob3");
//       // listInside.addAll(list2);
//       // list.add(0,listInside);
//        list.add(list2);
//        //list2.add(list.get(0).get(0));
//        System.out.println(listInside.size());
//        System.out.println(list2);
//        System.out.println(list);
//        System.out.println(listInside.equals(list2));

  }

}
