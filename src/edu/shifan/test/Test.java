package edu.shifan.test;

import edu.shifan.mapper.StudentMapper;
import edu.shifan.pojo.Student;
import edu.shifan.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //testIf();
        //testWhere();
        //testForeach();
        testChoose();
    }

    /**
     * 测试choose
     */
    private static void testChoose() {
        Student stu = new Student();
        stu.setStuName("T");
        stu.setGender(true);
        stu.setGradeId(3);
        System.out.println(stu);

        //1、获取Session对象
        SqlSession session = SessionUtil.getSession(false);
        //2、获取Mapper对象
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        //3、调用方法
        List<Student> list= mapper.findByExp3(stu);
        //4、关闭session对象
        SessionUtil.close();

        //输出查询结果
        for(Student s : list)
            System.out.println(s);
    }

    /**
     * 测试forEach标签
     */
    private static void testForeach() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(32);
        list.add(33);

        //1、获取Session对象
        SqlSession session = SessionUtil.getSession(false);
        //2、获取Mapper对象
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        //3、调用方法
        List<Student> students= mapper.findByIds(list);
        //4、关闭session对象
        SessionUtil.close();

        //输出查询结果
        for(Student s : students)
            System.out.println(s);
    }

    /**
     * 测试where标签
     */
    private static void testWhere() {
        Student stu = new Student();
        stu.setStuName("T");
        stu.setGender(true);
        System.out.println(stu);

        //1、获取Session对象
        SqlSession session = SessionUtil.getSession(false);
        //2、获取Mapper对象
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        //3、调用方法
        List<Student> list= mapper.findByExp2(stu);
        //4、关闭session对象
        SessionUtil.close();

        //输出查询结果
        for(Student s : list)
            System.out.println(s);
    }

    /**
     * 测试If标签
     */
    private static void testIf() {
        Student stu = new Student();
        stu.setStuName("T");
        stu.setGender(true);
        System.out.println(stu);

        //1、获取Session对象
        SqlSession session = SessionUtil.getSession(false);
        //2、获取Mapper对象
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        //3、调用方法
        List<Student> list= mapper.findByExp(stu);
        //4、关闭session对象
        SessionUtil.close();

        //输出查询结果
        for(Student s : list)
            System.out.println(s);
    }
}
