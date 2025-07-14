package application;

import java.util.List;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("========= teste1: Department findById =========");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("========= teste2: Department findAll =========");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);

        System.out.println("=========  teste3: Department insert =========");
        Department newDep = new Department(null, "Music");
        departmentDao.insert(newDep);
        System.out.println("Inserted! New id = " + newDep.getId());

        System.out.println("=========  teste4: Department update =========");
        dep = departmentDao.findById(10);
        System.out.println(dep);
        dep.setName("Movies");
        departmentDao.update(dep);
        System.out.println("Update completed");

        System.out.println("\n========= teste5: Department delete =========");
        departmentDao.deleteByID(10);
}}