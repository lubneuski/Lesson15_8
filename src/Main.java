import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        System.out.println("Задание 1. Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.");
//        List<Integer> list=new ArrayList<>();
//        int i= 0;
//            while (i<20){
//                list.add((int) ( Math.random()*100));
//                i++;
//            }
        List<Integer>list=Stream.generate(()-> (int) (Math.random() * 100)).limit(20).collect(Collectors.toList());
            System.out.println(list);
        List<Integer>list1=list.stream().distinct().collect(Collectors.toList());
            System.out.println(list1+" - без дубликатов.");
            System.out.println(list1.stream().skip(6).limit(11).filter(y -> y % 2 == 0).collect(Collectors.toList())+" - все четные элементы с 7 по 17.");
            System.out.println(list1.stream().map(x -> x * 2).collect(Collectors.toList())+" - все элементы умножены на 2.");
            System.out.println(list1.stream().sorted().limit(4).collect(Collectors.toList())+" - отсортирован и первые 4 элемента.");
//            System.out.println(list1.stream().count()+" - количество элементов.");
            System.out.println((long) list1.size() +" - количество элементов.");
            System.out.println(list1.stream().mapToInt(a->a).average().orElse(0)+" - среднее арифметическое всех чисел.");
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задание 2. Создать коллекцию класса ArrayList со значениями имен всех студентов в группе.");
    List<String>names=new ArrayList<>();
        names.add("Вадим");
        names.add("Валерия");
        names.add("Денис");
        names.add("Глеб");
        names.add("Ольга");
        names.add("Роман");
        names.add("Ольга");
        names.add("Даниил");
        names.add("Александр");
        names.add("Елизавета");
        names.add("Святослав");
        names.add("Яна");
        names.add("Мария");
        names.add("Ирина");
        names.add("александр");
        names.add("Даниил");
        names.add("Юлия");
        System.out.println("Количество людей с вашим именем: "+names.stream().filter(s-> s=="Александр"||s=="александр").count());
        System.out.println("Имена, начинающиеся на \"а\": ");
        names.stream().filter(s-> s.startsWith("А")||s.startsWith("а")).forEach(System.out::println);
    }
}