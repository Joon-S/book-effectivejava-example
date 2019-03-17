package chapter_4;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Stack<Object>, Stack<int[]>, 등등 만들수있지만
 * Stack<int>, Stack<double> 은 안됨. 자바 제네릭 자료형 시스템의 근본적 한계
 * 제약을 피할려면 규칙 49 참고
 *
 */
public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if ( size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if ( elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
