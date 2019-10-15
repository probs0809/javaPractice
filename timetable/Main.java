public class Main{
    public static void main(String[] args) {
        TimeTableEngine t = new TimeTableEngine();
        t.setTimeTableSize(5, 10);
        t.setNoSubject(10);
        t.setSubjectHoursPerWeek(0, 2);
        t.setSubjectHoursPerWeek(1, 2);
        t.setSubjectHoursPerWeek(2, 2);
        t.setSubjectHoursPerWeek(3, 2);
        t.setSubjectHoursPerWeek(4, 5);
        t.setSubjectHoursPerWeek(5, 2);
        t.setSubjectHoursPerWeek(6, 2);
        t.setSubjectHoursPerWeek(7, 2);
        t.setSubjectHoursPerWeek(8, 2);
        t.setSubjectHoursPerWeek(9, 2);
        t.findUnallocatedSubjects();
        t.findManuallyAllotedSubject();
        t.generateTimeTable();
        t.forTestingOutput();
        t.getOutput();
    }
}