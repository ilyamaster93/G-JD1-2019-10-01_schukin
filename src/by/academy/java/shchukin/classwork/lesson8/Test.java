package by.academy.java.shchukin.classwork.lesson8;

public class Test {
public static void main(String[] args) {
printClassVersion(new Class1());
printClassVersion(new Class2());
printClassVersion(new Class2());
printClassVersion(new Class2());
}

private static void printClassVersion(Object o) {
Class<? extends Object> clazz = o.getClass();
Version annotation = clazz.getAnnotation(Version.class);

System.out.println("version of object:" + annotation.versionNumber());

}
}
