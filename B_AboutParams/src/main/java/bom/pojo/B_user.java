package bom.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Objects;

/**
 * @author kinoz
 * @Date 2022/10/21 10:24
 * @apiNote
 */
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class B_user {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String sex;
    private String email;
}
