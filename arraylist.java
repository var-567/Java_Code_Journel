import java.util.*;
class Arraylist{
    public static void main(String args[]){
    List<Integer> al=new ArrayList<>();
    al.add(5);
    al.add(6);
    al.set(1,7);
    Collections.reverse(al);
    Iterator itr=al.iterator();  
          while(itr.hasNext()){  
                System.out.println(itr.next());  
            }

    for(Integer i:al){
        System.out.println(i);
    }
    System.out.println(al);
}
}

