package RandomAccess;

import java.util.*;

/**
 * @author : [yzh]
 * @version : [v1.0]
 * @className : RandomAcessTime
 * @description : [描述说明该类的功能]
 * @createTime : [2021/12/30 23:33]
 * @updateUser : [yzh]
 * @updateTime : [2021/12/30 23:33]
 * @updateRemark : [描述说明本次修改内容]
 */
public class RandomAcessTime {

//    public long judge(List list){
//        if(list instanceof RandomAccess){
//
//        }else {
//
//        }
//    }

    public static long travelByLoop(List list){
        Long starTime=System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        Long endTime=System.currentTimeMillis();
        return endTime-starTime;
    }
    public static long travelByIterator(List list){
        Long starTime=System.currentTimeMillis();
        Iterator iterator =list.iterator();

        while (iterator.hasNext()){
            iterator.hasNext();
        }
        Long endTime=System.currentTimeMillis();
        return endTime-starTime;

    }
    public static void main(String[] args) {
        List<String>  arrayList=new ArrayList<String>();
        for (int i = 0; i < 3000; i++) {
            arrayList.add(i+"");
        }
        long travelByLoop=RandomAcessTime.travelByLoop(arrayList);
        long travelByIterator=RandomAcessTime.travelByIterator(arrayList);
        System.out.println("listloop时间:"+travelByLoop);
        System.out.println("listIterator时间:"+travelByIterator);

        List<String> linkedList=new LinkedList<String>();
        for (int i = 0; i < 3000; i++) {
            linkedList.add(i+"");
        }
        long travelByLoop1=RandomAcessTime.travelByLoop(linkedList);
        long travelByIterator1=RandomAcessTime.travelByIterator(linkedList);
        System.out.println("linkedListloop时间:"+travelByLoop1);
        System.out.println("linkedListIterator时间:"+travelByIterator1);

    }
}
