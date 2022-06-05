package testingMaps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class refMapTest {
    public static HashMap<String,String> ref;

    public static void  setRef(Map<String, String> ref){
        refMapTest.ref = (HashMap<String, String>) ref;
    }
    public static void demo(){
        setRef(new HashMap<>());
        ref.put("1","2");
    }
    public static void main(String[] args) {
        //setRef(new HashMap<>());
        demo();
        System.out.println(ref.isEmpty()+" as");
        HashMap<String,Object> refMap = new HashMap<>();
        HashMap<String,Object> refMap1 = new HashMap<>();
        System.out.println(refMap1.isEmpty());
        refMap.put("ok","11");
        refMap.put("ok1","112");
        refMap.put("ok2","1121");
        refMap.put("ok3","113");
        refMap.put("ok4","114");

        String status = String.valueOf(refMap.get("ok3"));
        System.out.println(status);
        String status2 = String.valueOf(refMap.get("ok5"));
        System.out.println("status2  "+status2);
      //  String req = refMap.computeIfAbsent("ok5",k->null);
        System.out.println(status2.getClass().getSimpleName());
        if(!status.equals("null")){
            System.out.println("null as string it giving");
        }
        if(status2.equals("")){
            System.out.println("case 2");
        }
        if(status !="null"){
            System.out.println("case 3");
        }
      //  if(status2)
    }
}
