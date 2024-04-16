package edu.shifan.mapper;

import edu.shifan.pojo.Student;

import java.util.List;

public interface StudentMapper {
    /**
     * 实现多条件查询
     */
    List<Student> findByExp(Student student);

    /**
     * 实现多条件查询
     */
    List<Student> findByExp2(Student student);

    /**
     * 实现条件查询
     *  使用姓名、性别、所属年级之一作为条件进行查询
     */
    List<Student> findByExp3(Student student);

    /**
     * 多ID查询
     */
    List<Student> findByIds(List<Integer> array);
}
