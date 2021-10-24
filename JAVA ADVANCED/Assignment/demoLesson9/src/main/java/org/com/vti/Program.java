package org.com.vti;

import org.com.vti.entity.Department;
import org.com.vti.entity.User;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.time.LocalDate;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
//        Department department = new Department();
//        department.setName("wai");
//        department.setTotalMember(-10);
//
//        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
//        Validator validator = validatorFactory.getValidator();
//
//        Set<ConstraintViolation<Department>> violations = validator.validate(department);
//
//        for (ConstraintViolation<Department> violation:violations
//             ) {
//            System.out.println(violation.getMessage());
//        }

        User user = new User();
        LocalDate localDate = LocalDate.of(2010,10,20);
        user.setName("ABC");
        user.setBirthDate(localDate);
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        Set<ConstraintViolation<User>> violations = validator.validate(user);

        for (ConstraintViolation<User> violation:violations
        ) {
            System.out.println(violation.getMessage());
        }

    }
}
