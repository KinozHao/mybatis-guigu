package cum.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author kinoz
 * @Date 2022/11/19 16:15
 * @apiNote
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String mail;
    //仅测试批量添加使用,因为需要字段和属性名称一样
    private String e_name;
    private String email;
    //多对一
    private Department dept;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", mail='" + mail + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Employee(Integer id,String e_name, Integer age, String sex, String email, Department dept) {
        this.id = id;
        this.e_name = e_name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.dept = dept;
    }
}