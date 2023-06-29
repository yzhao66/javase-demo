package generic;

/**
 * @author zoh66
 * @Description
 * @create 2023-04-28 10:39
 */
interface Info<T> {
    T getVar();


}

class InfoImpl<T> implements Info {

    @Override
    public T getVar() {
        return null;
    }
}
