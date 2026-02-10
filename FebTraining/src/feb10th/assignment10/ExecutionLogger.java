package feb10th.assignment10;

import java.lang.reflect.Method;

public class ExecutionLogger {

    public static void log(Object obj) throws Exception {
        Class<?> cls = obj.getClass();

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.currentTimeMillis();
                method.invoke(obj);
                long end = System.currentTimeMillis();
                System.out.println("Execution Time: " + (end - start) + " ms");
            }
        }
    }
}
