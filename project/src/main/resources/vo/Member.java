package vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Member {
    private String id;
    private String pwd;
    private String name;
    private String address;
    private String phone;
    private String email;
}