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
}