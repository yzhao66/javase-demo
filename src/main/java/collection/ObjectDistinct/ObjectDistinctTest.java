package collection.ObjectDistinct;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static collection.ObjectDistinct.DistinctPerson.initList;

/**
 * @author zoh66
 * @Description 对象数组去重
 * @create 2023-03-14 10:04 AM
 */
public class ObjectDistinctTest {

    public static void main(String[] args) {

//       方法一：将原数组插入到新数组的时候，将插入的对象和新数组中的已插入对象进行比较，若不相同，则插入到新的数组中；
        List<DistinctPerson> distinctPeople = DistinctPerson.initList();
        List<DistinctPerson> newDistinctPeople = new ArrayList<>();
        distinctPeople.forEach(t -> {
            //anyMatch表示有一个匹配就返回true;
            boolean match = newDistinctPeople.stream().anyMatch(u -> t.getName().equals(u.getName()));
            if (!match) {
                newDistinctPeople.add(t);
            }
        });

        DistinctPerson.printList("方法一", newDistinctPeople);


        /**
         方法二：使用hashSet进行对象的去重（需要将list中对象的hasCode()、equals()方法进行重写，然后放到set集合中）
         * 若对象中的equals方法的返回值为true，hashCode方法的返回值必定是相同的；
         */
        distinctPeople = initList();
        distinctPeople = distinctPeople.parallelStream().distinct().collect(Collectors.toList());
        DistinctPerson.printList("方法二", distinctPeople);
    }
}

