package collection.ObjectDistinct;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author zoh66
 * @Description
 * @create 2023-03-14 10:05 AM
 */
public class DistinctPerson {

    private String name;

    private int score;

    public DistinctPerson(int score, String name) {
        super();
        this.name = name;
        this.score = score;
    }

    static List<DistinctPerson> initList() {
        List<DistinctPerson> distinctPeople = new ArrayList<DistinctPerson>();
        distinctPeople.add(new DistinctPerson(980, "M1"));
        distinctPeople.add(new DistinctPerson(34, "M2"));
        distinctPeople.add(new DistinctPerson(12, "M3"));
        distinctPeople.add(new DistinctPerson(65, "M4"));
        distinctPeople.add(new DistinctPerson(12, "M5"));
        distinctPeople.add(new DistinctPerson(33, "M6"));
        distinctPeople.add(new DistinctPerson(90, "M7"));
        distinctPeople.add(new DistinctPerson(123, "M8"));
        distinctPeople.add(new DistinctPerson(124, "M8"));
        return distinctPeople;
    }

    static void printList(String title, List<DistinctPerson> distinctPeople) {
        System.out.println("==============" + title + "=================");
        for (DistinctPerson distinctPerson : distinctPeople) {
            System.out.println(distinctPerson.toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    /**
     * 当name相同，就认定两个对象相等
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DistinctPerson that = (DistinctPerson) o;
        return Objects.equals(name, that.name);
    }

    /**
     * 仅使用name字段的值来生成hashcode；
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "DistinctPerson{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}