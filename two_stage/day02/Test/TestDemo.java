package two_stage.day02.Test;

public class TestDemo {
    public static void main(String[] args) {
        pingpangSporter pps = new pingpangSporter(10,"jiajia");
        System.out.println(pps.getName()+pps.getAge());
        pps.study();
        pps.studyEnglish();
        pingpangTeacher ppt = new pingpangTeacher(56,"tiantian");
        ppt.studyEnglish();
        ppt.teach();
        BasketSporter bs = new BasketSporter(24,"tiantian");
        bs.study();

    }
}
