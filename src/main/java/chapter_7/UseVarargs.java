package chapter_7;

/**
 * 무작정 마지막에 배열이 인자라고 다 뜯어고치지말고
 * 정말 임의 개수의 인자를 처리해야만 할때만 사용하도록하자
 * 나중에 고칠려고하면 손댈부분이 어마무시하게 많아진다
 */
public class UseVarargs {

    //Bad
    static int sumBad(int... args) {
        if(args.length == 0)
            throw new IllegalArgumentException("Too few arguments");
        int min = args[0];
        for(int i=1;i<args.length;i++) {
            if(args[i] < min)
                min = args[i];
        }
        return min;
    }

    //Good
    static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs)
            if (arg < min)
                min = arg;
        return min;
    }
}
