package bai_tap_them1.service;

import bai_tap_them1.model.Person;
import bai_tap_them1.repository.PersonRepositoryImpl;

import static jdk.internal.org.jline.utils.Colors.s;

public class PersonServiceImpl implements PersonService {
     PersonRepositoryImpl personRepositoryImpl=new PersonRepositoryImpl();
    @Override
    public void addStudent(Person.Student student) {
        personRepositoryImpl.addStudent(student);
    }

    @Override
    public void addTeacher(Person.Teacher teacher) {
        personRepositoryImpl.addTeacher(teacher);
    }

    @Override
    public void showStudent() {
         personRepositoryImpl.showStudent();
    }

    @Override
    public void showTeacher() {
         personRepositoryImpl.showTeacher();
    }


    @Override
    public void removeStudent(String idRemove) {
        personRepositoryImpl.removeStudent(idRemove);
    }

    @Override
    public void removeTeacher(String idRemove) {
        personRepositoryImpl.removeTeacher(idRemove );
    }

    @Override
    public int getSizeStudent() {
        return personRepositoryImpl.getSizeStudent();
    }

    @Override
    public int getSizeTeacher() {
        return personRepositoryImpl.getSizeTeacher();
    }
}
