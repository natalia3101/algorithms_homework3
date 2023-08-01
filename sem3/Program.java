package sem3;

public class Program {
    
    public static void main(String[] args){
        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employee("Natalia", 34));
        linkedList.addFirst(new Employee("Anna", 17));
        linkedList.addFirst(new Employee("Dmitrii", 67));
        linkedList.addFirst(new Employee("Petr", 41));
        linkedList.addFirst(new Employee("Galina", 27));

        // Employee res = linkedList.contains(new Employee("User3", 67));
        // System.out.println(res);

        System.out.println();
        System.out.println(linkedList);

        // linkedList.sort(new EmployeeComparator(SortDirect.Ascending));
        // System.out.println();
        // System.out.println(linkedList);

        // linkedList.sort(new EmployeeComparator(SortDirect.Descending));
        // System.out.println();
        // System.out.println(linkedList);

        // linkedList.removeFirst();

        // linkedList.removeLast();

        // System.out.println();
        // System.out.println(linkedList);

        System.out.println();
        linkedList.reverse();
        System.out.println(linkedList);
    }
}
