import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EncapsulateCollection {

    public static void main(String[] args) {
        Person kent = new Person();
        kent.addCourse(new Course("Smalltalkプログラミング", false));
        kent.addCourse(new Course("シングルモルトの味わい", true));
        Assert.equals(2, kent.numberOfCourses());
        Course refact = new Course("リファクタリング", true);
        kent.addCourse(refact);
        kent.addCourse(new Course("冷酷な皮肉", false));
        Assert.equals(4, kent.numberOfCourses());
        kent.getCourses().remove(refact);
        Assert.equals(4, kent.numberOfCourses());

        kent.numberOfAdvancedCourses();
    }

    private class Course {

        private final String _name;

        private final boolean _isAdvanced;

        public Course(String name, boolean isAdvanced) {
            _name = name;
            _isAdvanced = isAdvanced;
        }

        public boolean isAdvanced() {
            return _isAdvanced;
        }

    }

    private class Person {

        private final Set _courses = new HashSet();

        public Set getCourses() {
            return Collections.unmodifiableSet(_courses);
        }

        public void initializeCourses(Set arg) {
            Assert.isTrue(_courses.isEmpty());
            _courses.addAll(arg);
        }

        public void addCourse(Course arg) {
            _courses.add(arg);
        }

        public void removeCourse(Course arg) {
            _courses.remove(arg);
        }

        int numberOfAdvancedCourses() {
            Iterator iterator = getCourses().iterator();
            int count = 0;
            while (iterator.hasNext()) {
                Course each = (Course) iterator.next();
                if (each.isAdvanced()) {
                    count++;
                }
            }
        }

        public int numberOfCourses() {
            return _courses.size();
        }

    }

}
