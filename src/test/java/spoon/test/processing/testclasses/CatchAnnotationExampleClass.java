package spoon.test.processing.testclasses;

public class CatchAnnotationExampleClass {
    public void testMethod(String test) {
        String testStr = null;
        try {
            testStr.length();
        } catch (@MyCatchAnnotation(something =  "annotation string") NullPointerException e) {
            e.printStackTrace();
        }
    }
}
