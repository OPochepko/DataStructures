
public class Main {
    public static void main(String[] args){
        java.util.LinkedList<String> javaLinkedList = new java.util.LinkedList<String>();
        LinkedList<String> myLinkedList = new LinkedList<>();

        javaLinkedList.add("Zero");
        javaLinkedList.add("One");
        javaLinkedList.add("Two");
        javaLinkedList.add("Three");
        javaLinkedList.add("Four");

        myLinkedList.add("Zero");
        myLinkedList.add("One");
        myLinkedList.add("Two");
        myLinkedList.add("Three");
        myLinkedList.add("Four");

        System.out.println(javaLinkedList.get(2));
        System.out.println(myLinkedList.get(2));


        javaLinkedList.remove("Three");
        myLinkedList.remove("Three");

        System.out.println(javaLinkedList.get(3));
        System.out.println(myLinkedList.get(3));

        System.out.println("javaLinkedList size = " + javaLinkedList.size());
        System.out.println("myLinkedList size = " + myLinkedList.size);

        javaLinkedList.add(3,"new Three");
        myLinkedList.add(3,"new Three");

        System.out.println("javaLinkedList size = " + javaLinkedList.size());
        System.out.println("myLinkedList size = " + myLinkedList.size);

        System.out.println(javaLinkedList.get(3));
        System.out.println(myLinkedList.get(3));

        System.out.println(javaLinkedList.get(4));
        System.out.println(myLinkedList.get(4));






    }
}
