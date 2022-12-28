package cum.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author kinoz
 * @Date 2022/11/19 16:15
 * @apiNote 当需要开启二级缓存时候需要实现序列化接口
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    //Serializable id
    private static final long serialVersionID = 23423423253L;

    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String mail;
    private String collage;

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
                ", collage='" + collage + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Employee(Integer id, String e_name, Integer age, String sex, String email, String collage, Department dept) {
        this.id = id;
        this.e_name = e_name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.collage = collage;
        this.dept = dept;
    }
}