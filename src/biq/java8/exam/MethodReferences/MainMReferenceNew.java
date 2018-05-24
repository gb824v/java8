package biq.java8.exam.MethodReferences;

import com.sun.tools.javac.util.Context;


import java.util.ArrayList;
import java.util.List;
/*      There are 4 Kinds of Method References:
        1) Reference to a static method:
            ContainingClass::staticMethodName
        2) Reference to an instance method of a particular object:
            ContainingObject::instanceMethodName
        3) Reference to an instance method of an arbitrary object of a particular type:
            ContainingType::methodName
        4) Reference to a constructor:
            ClassName::new
*/

class MainMReferenceNew {

    public static void main(String argv[]) {
        createFactory();

    }

    private static Context.Factory<List<String>> createFactory() {
        Context.Factory<List<String>> f = new Context.Factory<List<String>>() {
            @Override
            public List<String> make(Context c) {
                return new ArrayList<String>();
            }
        };
        return f;
        //Is equal to
        //Context.Factory<List<String>> f1 = ()-> new ArrayList<String>();
        //Is equal to
        //Context.Factory<List<String>> f2 = ArrayList<String>::new;
    }
}
