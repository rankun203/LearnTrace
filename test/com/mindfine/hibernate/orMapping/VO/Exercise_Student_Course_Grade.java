package com.mindfine.hibernate.orMapping.VO;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-19
 * Time: 下午7:09
 */
public class Exercise_Student_Course_Grade extends SuperTest{

    /**
     * “创建整个表结构，不产生任何数据。”
     */
    @Test
    public void testInit(){

        new SchemaExport(new Configuration().configure()).create(true, true);

    }

    @Test
    public void testInsertCourse(){
        Exercise_Course course1 = new Exercise_Course();
        Exercise_Course course2 = new Exercise_Course();
        Exercise_Course course3 = new Exercise_Course();
        course1.setName("语文");
        course2.setName("数学");
        course3.setName("英语");
        session.beginTransaction();
        session.save(course1);
        session.save(course2);
        session.save(course3);

        session.getTransaction().commit();

    }

    /**
     * “添加学生，并且设定每个学生所选的课程，他们是多对多的关系。”
     */
    @Test
    public void testInsertStudent(){
        this.testInsertCourse();

        Exercise_Student student1 = new Exercise_Student();
        Exercise_Student student2 = new Exercise_Student();
        Exercise_Student student3 = new Exercise_Student();
        Exercise_Student student4 = new Exercise_Student();
        student1.setName("张三");
        student2.setName("李四");
        student3.setName("王五");
        student4.setName("杨二");

        session = sf.getCurrentSession();
        session.beginTransaction();
        Exercise_Course tempCourse1 = (Exercise_Course)session.get(Exercise_Course.class, 1);
        Exercise_Course tempCourse2 = (Exercise_Course)session.get(Exercise_Course.class, 2);
        Exercise_Course tempCourse3 = (Exercise_Course)session.get(Exercise_Course.class, 3);

        student1.getCourseSet().add(tempCourse1);
        student2.getCourseSet().add(tempCourse1);
        student3.getCourseSet().add(tempCourse1);
        student4.getCourseSet().add(tempCourse1);

        student1.getCourseSet().add(tempCourse2);
        student2.getCourseSet().add(tempCourse2);
        student3.getCourseSet().add(tempCourse2);
        student4.getCourseSet().add(tempCourse2);

        student1.getCourseSet().add(tempCourse3);
        student2.getCourseSet().add(tempCourse3);
        student3.getCourseSet().add(tempCourse3);
        student4.getCourseSet().add(tempCourse3);

        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(student4);

        session.save(tempCourse1);
        session.save(tempCourse2);
        session.save(tempCourse3);

        session.getTransaction().commit();
    }

    /**
     * “从数据库中拿出一个学生来，然后输出他所有的课程。
     * “从数据库中拿出一个课程来，然后输出它所有的学生。
     */
    @Test
    public void testNavEachother(){
        session.beginTransaction();
        Exercise_Student student = (Exercise_Student)session.get(Exercise_Student.class, 7);

        Set<Exercise_Course> courseSet = student.getCourseSet();
        System.out.println("Student: " + student.getName() + " 修了：");
        for(Exercise_Course course: courseSet){
            System.out.println("课程：" + course.getName());
        }

        Exercise_Course course = (Exercise_Course)session.get(Exercise_Course.class, 2);
        Set<Exercise_Student> studentSet = course.getStudentSet();
        System.out.println("Course: " + course.getName() + " 有以下人选修：");
        for(Exercise_Student student1 : studentSet){
            System.out.println("学生：" + student1.getName());
        }
        session.getTransaction().commit();
    }

    /**
     * “测试：从不同学生得到的本应该相同的课程，实际获得的对象是不是也是  hashCode 也相同。
     * ”结论：本来应该相同的课程对象，从不同的途径拿出来，他们还是相同的，在内存中会按一个对象存储。
     * “从数据库往外取的时候却不得不把每一个同学的课程都取出来？
     */
    @Test
    public void testEqualHashCode(){
        session.beginTransaction();
        Exercise_Student student1 = (Exercise_Student)session.get(Exercise_Student.class, 7);
        Exercise_Student student2 = (Exercise_Student)session.get(Exercise_Student.class, 8);

        Set<Exercise_Course> s1CourseSet = student1.getCourseSet();
        Set<Exercise_Course> s2CourseSet = student2.getCourseSet();

        for (Exercise_Course cs : s1CourseSet){
            for(Exercise_Course cc : s2CourseSet){
                System.out.println(cs == cc);
            }
        }

        session.getTransaction().commit();
    }


    /**
     * ”为一些学生打分。
     */
    @Test
    public void testEvaluate(){
        session.beginTransaction();
        Exercise_Student student1 = (Exercise_Student)session.get(Exercise_Student.class, 7);
        Exercise_Student student2 = (Exercise_Student)session.get(Exercise_Student.class, 8);

        Set<Exercise_Course> s1CourseSet = student1.getCourseSet();
        Set<Exercise_Course> s2CourseSet = student2.getCourseSet();

        Exercise_Grade s1g1 = new Exercise_Grade();
        Exercise_Grade s1g2 = new Exercise_Grade();
        Exercise_Grade s1g3 = new Exercise_Grade();
        Exercise_Grade_pk s1g1pk = new Exercise_Grade_pk();
        Exercise_Grade_pk s1g2pk = new Exercise_Grade_pk();
        Exercise_Grade_pk s1g3pk = new Exercise_Grade_pk();
        s1g1pk.setsId(student1);
        s1g2pk.setsId(student1);
        s1g3pk.setsId(student1);
        for(Exercise_Course s1c : s1CourseSet){
            switch (s1c.getId()){
                case 1 : s1g1pk.setcId(s1c);break;
                case 2 : s1g2pk.setcId(s1c);break;
                case 3 : s1g3pk.setcId(s1c);break;
            }
        }
        s1g1.setId(s1g1pk);
        s1g2.setId(s1g2pk);
        s1g3.setId(s1g3pk);
        s1g1.setGrade(80);
        s1g2.setGrade(95);
        s1g3.setGrade(35);

        Exercise_Grade s2g1 = new Exercise_Grade();
        Exercise_Grade s2g2 = new Exercise_Grade();
        Exercise_Grade s2g3 = new Exercise_Grade();
        Exercise_Grade_pk s2g1pk = new Exercise_Grade_pk();
        Exercise_Grade_pk s2g2pk = new Exercise_Grade_pk();
        Exercise_Grade_pk s2g3pk = new Exercise_Grade_pk();
        s2g1pk.setsId(student2);
        s2g2pk.setsId(student2);
        s2g3pk.setsId(student2);
        for(Exercise_Course s2c : s2CourseSet){
            switch (s2c.getId()){
                case 1 : s2g1pk.setcId(s2c);break;
                case 2 : s2g2pk.setcId(s2c);break;
                case 3 : s2g3pk.setcId(s2c);break;
            }
        }
        s2g1.setId(s2g1pk);
        s2g2.setId(s2g2pk);
        s2g3.setId(s2g3pk);
        s2g1.setGrade(50);
        s2g2.setGrade(35);
        s2g3.setGrade(27);

        session.save(s1g1);
        session.save(s1g2);
        session.save(s1g3);
        session.save(s2g1);
        session.save(s2g2);
        session.save(s2g3);

        session.getTransaction().commit();
    }

    /**
     * “输出某个学生所有课程的分数。以及平均分，总分。
     */
    @Test
    public void testGetStudentGrade(){
        session.beginTransaction();
        Exercise_Student student = (Exercise_Student)session.get(Exercise_Student.class, 7);
        Set<Exercise_Grade> studentGrade = student.getGradeSet();
        double totalGrade = 0;
        int courseCount = 0;
        for (Exercise_Grade grade : studentGrade){
            System.out.format("课程：%s 得分：%.2f", grade.getId().getcId().getName(), grade.getGrade()).println();
            courseCount ++;
            totalGrade += grade.getGrade();
        }

        System.out.format("平均分：%.2f", totalGrade / courseCount).println();
        System.out.format("总分：%.2f", totalGrade).println();
        session.getTransaction().commit();
    }

    /**
     * ”输出某一课程的平均分，最高分，最低分。以及得这个分的人的名字。
     */
    @Test
    public void testGetCourseGradeStudent(){
        session.beginTransaction();
        Exercise_Course course = (Exercise_Course)session.get(Exercise_Course.class, 3);
        Set<Exercise_Grade> courseGrade = course.getGradeSet();
        double totalGrade = 0;
        Exercise_Grade highest = null;
        Exercise_Grade lowest = null;
        int i = 0;
        for(Exercise_Grade gradeSingle : courseGrade){
            double grade = gradeSingle.getGrade();
            totalGrade += grade;
            if(i == 0){
                highest = gradeSingle;
                lowest = gradeSingle;
            }
            if(grade > highest.getGrade()){
                highest = gradeSingle;
            }
            if(grade < lowest.getGrade()){
                lowest = gradeSingle;
            }
            i ++;
        }
        System.out.format("课程：%s ", course.getName()).println();
        System.out.format("平均分：%.2f", totalGrade / i).println();
        if (highest != null) {
            System.out.format("最高分：%.2f，名字：%s", highest.getGrade(), highest.getId().getsId().getName()).println();
        }
        if (lowest != null) {
            System.out.format("最低分：%.2f，名字：%s", lowest.getGrade(), lowest.getId().getsId().getName()).println();
        }
        session.getTransaction().commit();
    }

    /**
     * “输出所有的分数，以及获得分数的人的名字和他所选的课程。
     */
    @Test
    public void testGetGradeStudentCourse(){
        session.beginTransaction();
        Iterator gradeIter = session.createQuery("from Exercise_Grade ").iterate();
        while(gradeIter.hasNext()){
            Exercise_Grade grade = (Exercise_Grade)gradeIter.next();
            System.out.format("姓名：%s 课程：%s 分数：%.2f", grade.getId().getsId().getName(), grade.getId().getcId().getName(), grade.getGrade()).println();
        }
        session.getTransaction().commit();
    }

}
